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
import com.smart.mango.web.inside.service.ICompService;
import com.smart.mango.web.inside.service.IDepartService;

@Controller
public class DepartController {

	@Autowired  
	public IDepartService iDepartService;
	@Autowired  
	public ICompService iCompService;
	@Autowired
	public IPagingService iPagingService;
	
	@RequestMapping(value="/departMgt")
	public ModelAndView departMgt(HttpSession session,@RequestParam HashMap<String,String> params,
								ModelAndView mav) throws Throwable {
		mav.setViewName("depart/departMgt");
		return mav;
	}
	
	@RequestMapping(value = "/departMgtAjax",
			method = RequestMethod.POST,
			produces = "text/json;charset=UTF-8")
	@ResponseBody 
	public String departMgtAjax(@RequestParam HashMap<String,String> params,
						ModelAndView mav, HttpSession session) throws Throwable{

		ObjectMapper mapper = new ObjectMapper();
		Map<String,Object> modelMap = new HashMap<String,Object>();
		
		List<HashMap<String, String>> Teamlist = iDepartService.getTeamList(params);
		List<HashMap<String, String>> Such = iDepartService.getSuch(params);
		List<HashMap<String, String>> Departlist = iDepartService.getDepartList(params);
		
		modelMap.put("Teamlist", Teamlist);
		modelMap.put("Such", Such);
		modelMap.put("Departlist", Departlist);
			
			
		return mapper.writeValueAsString(modelMap);
	}
	
	@RequestMapping(value="/empPopAjax", method=RequestMethod.POST, produces="text/json;charset=UTF-8")
	@ResponseBody
	public String empPopAjax(@RequestParam HashMap<String, String> params, ModelAndView mav) throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();
		
		int cnt = iCompService.getEmpCnt(params);
		
		PagingBean pb = iPagingService.getPagingBean(Integer.parseInt(params.get("page")), cnt, 7, 5);
		params.put("startCnt", Integer.toString(pb.getStartCount()));
		params.put("endCnt", Integer.toString(pb.getEndCount()));
		
		List<HashMap<String, String>> list = iCompService.getEmpList(params);
		
		modelMap.put("list", list);
		modelMap.put("pb", pb);
		
		return mapper.writeValueAsString(modelMap);
	}
	
	@RequestMapping(value="/insertDepartAjax", method=RequestMethod.POST, produces="text/json;charset=UTF-8")
	@ResponseBody
	public String insertDepartAjax(@RequestParam HashMap<String, String> params, ModelAndView mav) throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();
		
		iDepartService.insertDepart(params);
		iDepartService.updateDepart(params);
		
		return mapper.writeValueAsString(modelMap);
	}
	
	@RequestMapping(value="/departInfo")
	public ModelAndView departInfo(HttpSession session,@RequestParam HashMap<String,String> params,
								ModelAndView mav) throws Throwable {
		
		HashMap<String,String> getDepartInfo = iDepartService.getDepartInfo(params);
		mav.addObject("getDepartInfo",getDepartInfo);
		mav.setViewName("depart/departInfo");
		return mav;
	}
	
}
