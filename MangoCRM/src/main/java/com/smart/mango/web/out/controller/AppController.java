package com.smart.mango.web.out.controller;

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
import com.smart.mango.web.out.service.IAppService;

@Controller
public class AppController {
	
	@Autowired
	public IAppService iAppService;
	
	@Autowired
	public IPagingService iPagingService;
	
	//결재 페이지
	@RequestMapping(value = "/app")
	public ModelAndView app(ModelAndView mav) {
		mav.setViewName("cmp/app");
		return mav;
	}

	//결재목록 페이지
	@RequestMapping(value = "/approval")
	public ModelAndView applist(ModelAndView mav) {
		mav.setViewName("cmp/approval");
		return mav;
	}
	//결재목록 페이지 Ajax
	@RequestMapping(value = "/applistAjax", method = RequestMethod.POST, produces = "test/json; charset=UTF-8")
	@ResponseBody
	public String applistAjax(@RequestParam HashMap<String, String> params, ModelAndView modelAndView) throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();
		try {
			int cnt = iAppService.listCnt(params);
			PagingBean pb = iPagingService.getPagingBean(Integer.parseInt(params.get("page")), cnt, 10, 5);

			params.put("startCnt", Integer.toString(pb.getStartCount()));
			params.put("endCnt", Integer.toString(pb.getEndCount()));

			List<HashMap<String, String>> list = iAppService.getlist(params);
			modelMap.put("list", list);
			modelMap.put("pb", pb);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return mapper.writeValueAsString(modelMap);
	}
	//결재페이지 결재버튼
	@RequestMapping(value = "/appbtnAjax", method = RequestMethod.POST, produces = "test/json; charset=UTF-8")
	@ResponseBody // spring은 View를 활용하여 구현하게 되어 있어 View인것으로 인식시켜 넘어가게 하는 어노테이션
	public String appbtnAjax(@RequestParam HashMap<String, String> params, HttpSession session,
			ModelAndView modelAndView) throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();
		try {
			iAppService.Appday(params);
			modelMap.put("res", "SUCCESS");
		} catch (Exception e) {
			e.printStackTrace();
			modelMap.put("res", "FAILED");
		}

		return mapper.writeValueAsString(modelMap);
	}
	
}
