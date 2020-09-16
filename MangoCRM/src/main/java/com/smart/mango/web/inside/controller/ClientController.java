package com.smart.mango.web.inside.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smart.mango.common.bean.PagingBean;
import com.smart.mango.common.service.IPagingService;
import com.smart.mango.web.common.service.ICommonService;
import com.smart.mango.web.inside.service.ClientService;
import com.smart.mango.web.inside.service.IClientService;
import com.smart.mango.web.inside.service.IEmpService;

@Controller
public class ClientController {
	@Autowired
	public IClientService iClientService;
	
	@Autowired
	public ICommonService iCommonService;
	
	@Autowired
	public IPagingService iPagingService;
	
	@Autowired
	public IEmpService iEmpService; 
	
	@Autowired
	public ObjectMapper mapper;
	
	@Autowired
	public ClientService clientService;
	
	// 고객 목록
	@RequestMapping(value = "/clientList")
	public ModelAndView clientList(HttpSession session, @RequestParam HashMap<String, String> params, ModelAndView mav) {
		clientService.pageSet(params);
		mav.addObject("page", params.get("page"));
		mav.setViewName("client/clientList");

		return mav;
	}
	
	// 고객등록
	@RequestMapping(value = "/clientAdd")
	public ModelAndView clientAdd(HttpSession session, @RequestParam HashMap<String, String> params,ModelAndView mav) {
		clientService.pageSet(params);
		mav.addObject("page", params.get("page"));
		mav.setViewName("client/clientAdd");

		return mav;
	}
	
	// 고객 정보
	@RequestMapping(value = "/clientDetail")
	public ModelAndView clientDetail(HttpSession session, ModelAndView mav, @RequestParam HashMap<String, String> params) throws Throwable {
		HashMap<String, String> data = iClientService.getClientData(params);
		mav.addObject("data", data);
		mav.setViewName("client/clientDetail");
		
		return mav;
	}
	
	// 고객 수정
	@RequestMapping(value = "/clientUpdate")
	public ModelAndView clientUpdate(HttpSession session, ModelAndView mav, @RequestParam HashMap<String, String> params) throws Throwable {
		clientService.pageSet(params);
		mav.addObject("page", params.get("page"));
		mav.setViewName("client/clientUpdate");
		
		return mav;
	}
		
	// 담당자 목록 가져오기
	@RequestMapping(value="/getEmppopListAjax", method=RequestMethod.POST, produces="text/json;charset=UTF-8")
	@ResponseBody
	public String getEmppopListAjax(@RequestParam HashMap<String, String> params, ModelAndView mav) throws Throwable {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		clientService.pageSet(params);
		PagingBean emppb = iPagingService.getPagingBean(Integer.parseInt(params.get("page")), iClientService.getEmpCnt(params), 10, 5);
		params.put("startCnt", Integer.toString(emppb.getStartCount()));
		params.put("endCnt", Integer.toString(emppb.getEndCount()));
		modelMap.put("emplist", iClientService.getEmpList(params));
		modelMap.put("emppb", emppb);
		return mapper.writeValueAsString(modelMap);
	}
//	고객 등록 셋팅
	@RequestMapping(value = "/clientAddSetAjax",
			method = RequestMethod.POST,
			produces = "test/json;charset=UTF-8")
	@ResponseBody 
	public String clientAddSetAjax(@RequestParam HashMap<String, String>params,HttpSession session, ModelAndView modelAndView) throws Throwable{
		Map<String,Object> modelMap = new HashMap<String,Object>();
		params.put("sEmpNo",String.valueOf(session.getAttribute("sEmpNo")));
		modelMap.put("grade",iClientService.getClientGrade(params));
		return mapper.writeValueAsString(modelMap);
	}
	//	고객 등록
	@RequestMapping(value = "/clientWriteAjax",
			method = RequestMethod.POST,
			produces = "test/json;charset=UTF-8")
	@ResponseBody 
	public String clientWriteAjax(@RequestParam HashMap<String, String>params, ModelAndView modelAndView) throws Throwable{
		Map<String,Object> modelMap = new HashMap<String,Object>();
		try {
			/* 고객등록 */
			iClientService.clientInsertData(params);
			modelMap.put("res","SUCCESS");
		} catch (Exception e) {
			e.printStackTrace();
			modelMap.put("res", "Failed");
		}
		return mapper.writeValueAsString(modelMap);
	}
	
	//	고객 수정
	@RequestMapping(value = "/clientUpdateAjax",
			method = RequestMethod.POST,
			produces = "test/json;charset=UTF-8")
	@ResponseBody 
	public String clientUpdateAjax(@RequestParam HashMap<String, String>params, ModelAndView modelAndView) throws Throwable{
		Map<String,Object> modelMap = new HashMap<String,Object>();
		try {
			/* 고객등록 */
			iClientService.clientUpdateData(params);
			modelMap.put("res","SUCCESS");
		} catch (Exception e) {
			e.printStackTrace();
			modelMap.put("res", "Failed");
		}
		return mapper.writeValueAsString(modelMap);
	}
	
	
	
	// 고객사 목록 가져오기
	@RequestMapping(value="/getcompListAjax", 
			method=RequestMethod.POST, 
			produces="text/json;charset=UTF-8")
	@ResponseBody
	public String getcompListAjax(@RequestParam HashMap<String, String> params, ModelAndView mav, HttpSession session) throws Throwable {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		params.put("sEmpNo",String.valueOf(session.getAttribute("sEmpNo")));
		clientService.pageSet(params);
		PagingBean pb = iPagingService.getPagingBean(Integer.parseInt(params.get("page")), iClientService.getCompCnt(params), 10, 5);
		params.put("startCnt", Integer.toString(pb.getStartCount()));
		params.put("endCnt", Integer.toString(pb.getEndCount()));
		modelMap.put("list", iClientService.getCompList(params));
		modelMap.put("pb", pb);
	
		return mapper.writeValueAsString(modelMap);
	}
	
	// 고객 목록 가져오기
	@RequestMapping(value="/getclientAjax", 
			method=RequestMethod.POST, 
			produces="text/json;charset=UTF-8")
	@ResponseBody
	public String getclientAjax(@RequestParam HashMap<String, String> params, ModelAndView mav, HttpSession session) throws Throwable {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		
		clientService.pageSet(params);
		PagingBean pb = iPagingService.getPagingBean(Integer.parseInt(params.get("page")), iClientService.getclientCnt(params), 10, 5);
		params.put("startCnt", Integer.toString(pb.getStartCount()));
		params.put("endCnt", Integer.toString(pb.getEndCount()));
		modelMap.put("list", iClientService.getclientList(params));
		modelMap.put("pb", pb);
		
		return mapper.writeValueAsString(modelMap);
	}
	
	// 고객 의견 목록 Get
		@RequestMapping(value="/getClientOpinAjax", method=RequestMethod.POST, produces="text/json;charset=UTF-8")
		@ResponseBody
		public String getClientOpinAjax(@RequestParam HashMap<String, String> params, ModelAndView mav) throws Throwable {
			Map<String, Object> modelMap = new HashMap<String, Object>();
			modelMap.put("opin", iClientService.getClientOpin(params));
			modelMap.put("cnt", iClientService.getClientOpinCnt(params));
			
			return mapper.writeValueAsString(modelMap);
		}
		
		// 고객 의견 Insert
		@RequestMapping(value="/insertClientOpinAjax", method=RequestMethod.POST, produces="text/json;charset=UTF-8")
		@ResponseBody
		public String insertClientOpinAjax(@RequestParam HashMap<String, String> params, ModelAndView mav) throws Throwable {
			Map<String, Object> modelMap = new HashMap<String, Object>();
			String res = "";
			try {
				iClientService.insertClientOpin(params);
				res = "SUCCESS";
			}
			catch(Exception e) {
				res = "FAILED";
			}
			modelMap.put("res", res);
			
			return mapper.writeValueAsString(modelMap);
		}
		
		// 고객 의견 Delete
		@RequestMapping(value="/delClientOpinAjax", method=RequestMethod.POST, produces="text/json;charset=UTF-8")
		@ResponseBody
		public String delClientOpinAjax(@RequestParam HashMap<String, String> params, ModelAndView mav) throws Throwable {
			Map<String, Object> modelMap = new HashMap<String, Object>();
			String res = "";
			try {
				iClientService.delClientOpin(params);
				res = "SUCCESS";
			}
			catch(Exception e) {
				res = "FAILED";
			}
			modelMap.put("res", res);
			
			return mapper.writeValueAsString(modelMap);
		}
		
		// 고객 메모 목록 Get
		@RequestMapping(value="/getClientMemoAjax", method=RequestMethod.POST, produces="text/json;charset=UTF-8")
		@ResponseBody
		public String getClientMemoAjax(@RequestParam HashMap<String, String> params, ModelAndView mav) throws Throwable {
			Map<String, Object> modelMap = new HashMap<String, Object>();
			modelMap.put("memo", iClientService.getClientMemo(params));
			modelMap.put("cnt", iClientService.getClientMemoCnt(params));
			
			return mapper.writeValueAsString(modelMap);
		}
		
		// 고객 의견 Insert
		@RequestMapping(value="/insertClientMemoAjax", method=RequestMethod.POST, produces="text/json;charset=UTF-8")
		@ResponseBody
		public String insertClientMemoAjax(@RequestParam HashMap<String, String> params, ModelAndView mav) throws Throwable {
			Map<String, Object> modelMap = new HashMap<String, Object>();
			String res = "";
			try {
				iClientService.insertClientMemo(params);
				res = "SUCCESS";
			}
			catch(Exception e) {
				res = "FAILED";
			}
			
			modelMap.put("res", res);
			
			return mapper.writeValueAsString(modelMap);
		}
		
		// 고객 의견 Delete
		@RequestMapping(value="/delClientMemoAjax", method=RequestMethod.POST, produces="text/json;charset=UTF-8")
		@ResponseBody
		public String delClientMemoAjax(@RequestParam HashMap<String, String> params, ModelAndView mav) throws Throwable {
			Map<String, Object> modelMap = new HashMap<String, Object>();
			String res = "";
			try {
				iClientService.delClientMemo(params);
				res = "SUCCESS";
			}
			catch(Exception e) {
				res = "FAILED";
			}
			
			modelMap.put("res", res);
			
			return mapper.writeValueAsString(modelMap);
		}
		
		// 고객 리스트 삭제 Delete
		@RequestMapping(value="/clientdelAjax", method=RequestMethod.POST, produces="text/json;charset=UTF-8")
		@ResponseBody
		public String clientdelAjax(@RequestParam HashMap<String, String> params, @RequestParam("client_check") List<String> clientCheck, ModelAndView mav) throws Throwable {
			Map<String, Object> modelMap = new HashMap<String, Object>();
			String res = "";
			try {
				for(int i = 0 ; i < clientCheck.size(); i++) {
					params.put("client_no",clientCheck.get(i));
					iClientService.clientDel(params);
				}
				res = "SUCCESS";
			}
			catch(Exception e) {
				res = "FAILED";
			}
			
			modelMap.put("res", res);
			
			return mapper.writeValueAsString(modelMap);
		}
		
		// 고객 정보 삭제 Delete
		@RequestMapping(value="/clientddelAjax", method=RequestMethod.POST, produces="text/json;charset=UTF-8")
		@ResponseBody
		public String clientddelAjax(@RequestParam HashMap<String, String> params, ModelAndView mav) throws Throwable {
			Map<String, Object> modelMap = new HashMap<String, Object>();
			String res = "";
			try {
				iClientService.clientDel(params);
				res = "SUCCESS";
			}
			catch(Exception e) {
				res = "FAILED";
			}
			
			modelMap.put("res", res);
			
			return mapper.writeValueAsString(modelMap);
		}
		
//		활동일정
		@RequestMapping(value="/getClientScheAjax", method=RequestMethod.POST, produces="text/json;charset=UTF-8")
		@ResponseBody
		public String getClientScheAjax(@RequestParam HashMap<String, String> params, ModelAndView mav) throws Throwable {
			Map<String, Object> modelMap = new HashMap<String, Object>();
			
			String str = "";
			if(params.get("acti0") != null) {
				str += "OR CC2.CODE_S_CATE = 0 ";
			}
			if(params.get("acti1") != null) {
				str += "OR CC2.CODE_S_CATE = 1 ";
			}
			if(params.get("acti2") != null) {
				str += "OR CC2.CODE_S_CATE = 2 ";
			}
			if(params.get("acti3") != null) {
				str += "OR CC2.CODE_S_CATE = 3 ";
			}
			if(str.equals("")) {
				str += "1 != 1";
				params.put("filter", str);
			} else {
				params.put("filter", str.substring(3));			
			}
				
			List<HashMap<String, String>> scheList = iClientService.getClientSche(params);
			
			
			modelMap.put("scheList", scheList);
			return mapper.writeValueAsString(modelMap);
		}
		
}
