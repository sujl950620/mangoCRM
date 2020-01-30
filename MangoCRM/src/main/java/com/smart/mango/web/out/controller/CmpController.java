package com.smart.mango.web.out.controller;

import java.util.HashMap;
import java.util.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.smart.mango.web.out.service.ICmpService;

@Controller
public class CmpController {

	@Autowired
	public ICmpService icmpservice;

	@Autowired
	public IPagingService iPagingService;

	// 대상선정 페이지
	@RequestMapping(value = "/targetSelect")
	public ModelAndView targetSelect(ModelAndView mav) {

		mav.setViewName("cmp/targetSelect");

		return mav;
	}

	// 대상선정페이지 ajax
	@RequestMapping(value = "/targetAjax", method = RequestMethod.POST, produces = "text/json;charset=UTF-8")

	@ResponseBody
	public String targetAjax(@RequestParam(required = false) String[] boxx,
							 @RequestParam(required = false) String[] chh, 
							 @RequestParam HashMap<String, String> params,
			ModelAndView mav) throws Throwable {

		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();

		try {
			int cnt = icmpservice.clientCnt(params);

			PagingBean pb = iPagingService.getPagingBean(Integer.parseInt(params.get("page")), cnt, 10, 10);

			params.put("startCnt", Integer.toString(pb.getStartCount()));
			params.put("endCnt", Integer.toString(pb.getEndCount()));

			HashMap<String, String> term = icmpservice.getTarget(boxx, chh, params);
			System.out.println(term);
			List<HashMap<String, String>> list = icmpservice.getClientList(term);
			modelMap.put("list", list);
			modelMap.put("pb", pb);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mapper.writeValueAsString(modelMap);
	}

	// 캠페인리스트 페이지
	@RequestMapping(value = "/cmpList")
	public ModelAndView cmpList(ModelAndView mav) {

		mav.setViewName("cmp/cmpList");

		return mav;
	}

	// cmpListAjax
	@RequestMapping(value = "/cmpListAjax", 
					method = RequestMethod.POST, 
					produces = "text/json;charset=UTF-8")

	@ResponseBody
	public String cmpListAjax(@RequestParam HashMap<String, String> params,	ModelAndView mav) throws Throwable {

		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();

		try {
			int cnt = icmpservice.getCmpCnt(params);
			System.out.println(params);
				PagingBean pb = iPagingService.getPagingBean(Integer.parseInt(params.get("page")), cnt , 10 ,10); 
				params.put("startCnt", Integer.toString(pb.getStartCount()));
				params.put("endCnt", Integer.toString(pb.getEndCount()));

			List<HashMap<String, String>> list = icmpservice.getCmpList(params);
			modelMap.put("list", list);
			modelMap.put("pb", pb);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mapper.writeValueAsString(modelMap);
	}
	
	
	// 캠페인 등록(기본정보 입력)
	@RequestMapping(value = "/cmpAdd")
	public ModelAndView cmpAdd(ModelAndView mav) {

		mav.setViewName("cmp/cmpAdd");

		return mav;
	}

	// 시뮬레이션결과
	@RequestMapping(value = "/simResult")
	public ModelAndView Sim_result(ModelAndView mav) {

		mav.setViewName("cmp/simResult");

		return mav;
	}
	
	//채널선정
	@RequestMapping(value = "/channelSelect")
	public ModelAndView channelSelect(ModelAndView mav) {

		mav.setViewName("cmp/channelSelect");

		return mav;
	}
	
	@RequestMapping(value = "/SaveAjax",
			method = RequestMethod.POST,
			produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String SaveAjax(@RequestParam HashMap<String, String> params,
							ModelAndView modelAndView)
	throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();
		
			icmpservice.channelSelect(params);
			modelMap.put("res", "SUCCESS");

		//writeValueAsString -> Map의 데이터를 문자열(JSON)으로 변환처리
		return mapper.writeValueAsString(modelMap);
	}
}
