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
import com.smart.mango.web.inside.service.IBssDetService;
import com.smart.mango.web.inside.service.ICompService;

@Controller
public class BssDetController {

	@Autowired
	public IBssDetService iBssDetService;
	@Autowired
	public IPagingService iPagingService;

	@Autowired
	public ICommonService iCommonService;

	@Autowired
	public ICompService iCompService;

	// 영업상세조회창
	@RequestMapping(value = "/bssDet")
	public ModelAndView bssDet(HttpSession session, @RequestParam HashMap<String, String> params, ModelAndView mav)
			throws Throwable {

		mav.setViewName("bss/bssDet");
		return mav;
	}

	// 기회가져오기
	@RequestMapping(value = "getChnAjax", method = RequestMethod.POST, produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String getChnAjax(@RequestParam HashMap<String, String> params, HttpSession session, ModelAndView mav)
			throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();

		try {
			HashMap<String, String> data = iBssDetService.getChn(params);
			modelMap.put("data", data);
			modelMap.put("SUCCESS", "SUCCESS");

		} catch (Exception e) {
			e.printStackTrace();
			modelMap.put("FAILED", "FAILED");
		}
		return mapper.writeValueAsString(modelMap);
	}

	// 기회 -- 사업유형
	@RequestMapping(value = "getBssTypeAjax", method = RequestMethod.POST, produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String getBssTypeAjax(@RequestParam HashMap<String, String> params, HttpSession session, ModelAndView mav)
			throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();

		try {
			List<HashMap<String, String>> list = iBssDetService.getBssType(params);
			modelMap.put("list", list);
			modelMap.put("SUCCESS", "SUCCESS");

		} catch (Exception e) {
			e.printStackTrace();
			modelMap.put("FAILED", "FAILED");
		}
		return mapper.writeValueAsString(modelMap);
	}

	// 기회 -- 매출구분
	@RequestMapping(value = "getBssSalesDivAjax", method = RequestMethod.POST, produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String getBssSalesDivAjax(@RequestParam HashMap<String, String> params, HttpSession session,
			ModelAndView mav) throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();

		try {
			List<HashMap<String, String>> list = iBssDetService.getBssSalesDiv(params);
			modelMap.put("list", list);
			modelMap.put("SUCCESS", "SUCCESS");

		} catch (Exception e) {
			e.printStackTrace();
			modelMap.put("FAILED", "FAILED");
		}
		return mapper.writeValueAsString(modelMap);
	}

	// 담당자 목록 Get
	@RequestMapping(value = "/getBssEmpPopAjax", method = RequestMethod.POST, produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String getBssEmpPopAjax(@RequestParam HashMap<String, String> params, ModelAndView mav) throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();

		int cnt = iBssDetService.getEmpCnt(params);

		PagingBean pb = iPagingService.getPagingBean(Integer.parseInt(params.get("page")), cnt, 7, 5);
		params.put("startCnt", Integer.toString(pb.getStartCount()));
		params.put("endCnt", Integer.toString(pb.getEndCount()));

		List<HashMap<String, String>> list = iBssDetService.getEmpList(params);

		modelMap.put("list", list);
		modelMap.put("pb", pb);

		return mapper.writeValueAsString(modelMap);
	}

	// 상품팝업 -- 상품구분
	@RequestMapping(value = "/getSelectProdDivAjax", method = RequestMethod.POST, produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String getSelectProdDivAjax(@RequestParam HashMap<String, String> params, ModelAndView mav)
			throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();

		List<HashMap<String, String>> list = iBssDetService.getSelectProdDiv(params);

		modelMap.put("list", list);

		return mapper.writeValueAsString(modelMap);
	}

	// 상품팝업 -- 상품유형
	@RequestMapping(value = "/getSelectProdTypeAjax", method = RequestMethod.POST, produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String getSelectProdTypeAjax(@RequestParam HashMap<String, String> params, ModelAndView mav)
			throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();

		List<HashMap<String, String>> list = iBssDetService.getSelectProdType(params);

		modelMap.put("list", list);

		return mapper.writeValueAsString(modelMap);
	}

	// 영업 의견 목록 Get
	@RequestMapping(value = "/getBssOpinAjax", method = RequestMethod.POST, produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String getBssOpinAjax(@RequestParam HashMap<String, String> params, ModelAndView mav) throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();

		try {

			List<HashMap<String, String>> opin = iBssDetService.getBssOpin(params);
			int cnt = iBssDetService.getBssOpinCnt(params);

			modelMap.put("opin", opin);
			modelMap.put("cnt", cnt);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return mapper.writeValueAsString(modelMap);
	}

	// 영업 의견 Insert
	@RequestMapping(value = "/insertBssOpinAjax", method = RequestMethod.POST, produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String insertBssOpinAjax(@RequestParam HashMap<String, String> params, ModelAndView mav) throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();
		String res = "";
		try {
			iBssDetService.insertBssOpin(params);
			res = "SUCCESS";
		} catch (Exception e) {
			res = "FAILED";
			e.printStackTrace();
		}

		modelMap.put("res", res);

		return mapper.writeValueAsString(modelMap);
	}

	// 영업 의견 Delete
	@RequestMapping(value = "/delBssOpinAjax", method = RequestMethod.POST, produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String delBssOpinAjax(@RequestParam HashMap<String, String> params, ModelAndView mav) throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();
		String res = "";
		try {
			iBssDetService.delBssOpin(params);
			res = "SUCCESS";
		} catch (Exception e) {
			res = "FAILED";
		}

		modelMap.put("res", res);

		return mapper.writeValueAsString(modelMap);
	}

	// 영업 관련 활동일정 Get
	@RequestMapping(value = "/getBssScheAjax", method = RequestMethod.POST, produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String getBssScheAjax(@RequestParam HashMap<String, String> params, ModelAndView mav) throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();

		String str = "";
		if (params.get("acti0") != null) {
			str += "OR CC2.CODE_S_CATE = 0 ";
		}
		if (params.get("acti1") != null) {
			str += "OR CC2.CODE_S_CATE = 1 ";
		}
		if (params.get("acti2") != null) {
			str += "OR CC2.CODE_S_CATE = 2 ";
		}
		if (params.get("acti3") != null) {
			str += "OR CC2.CODE_S_CATE = 3 ";
		}
		if (str.equals("")) {
			str += "1 != 1";
			params.put("filter", str);
		} else {
			params.put("filter", str.substring(3));
		}

		System.out.println(params + "\n\n\n");

		List<HashMap<String, String>> list = iCompService.getCompSche(params);

		modelMap.put("list", list);
		return mapper.writeValueAsString(modelMap);
	}
}
