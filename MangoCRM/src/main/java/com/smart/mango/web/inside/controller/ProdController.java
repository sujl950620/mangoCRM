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
import com.smart.mango.util.Utils;
import com.smart.mango.web.common.service.ICommonService;
import com.smart.mango.web.inside.service.IProdService;

@Controller
public class ProdController {
	@Autowired
	public IProdService iProdService;
	@Autowired
	public ICommonService iCommonService;
	@Autowired
	public IPagingService iPagingService;
	
	@RequestMapping(value = "/prodList")
	public ModelAndView empMgtList(ModelAndView mav) {

		mav.setViewName("prod/prodList");
		return mav;
	}
	@RequestMapping(value = "/goodsAdd")
	public ModelAndView goodsAdd(ModelAndView mav) {
		
		mav.setViewName("prod/goodsAdd");
		return mav;
	}
	@RequestMapping(value = "/goodsDet")
	public ModelAndView goodsDet(ModelAndView mav) {
		
		mav.setViewName("prod/goodsDet");
		return mav;
	}
	//상품 -> 서비스 리스트
	@RequestMapping(value="/ServicelistAjax", method=RequestMethod.POST, produces="text/json;charset=UTF-8")
	@ResponseBody
	public String ServicelistAjax(@RequestParam HashMap<String, String> params, ModelAndView mav) throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();
		
	//	int cnt = iEmpService.getserviceCnt(params);
		
	//	PagingBean pb = iPagingService.getPagingBean(Integer.parseInt(params.get("page")), cnt, 10, 5);
	//	params.put("startCnt", Integer.toString(pb.getStartCount()));
	//	params.put("endCnt", Integer.toString(pb.getEndCount()));
		
		List<HashMap<String, String>> Service = iProdService.getServiceList(params);
		
		modelMap.put("Service", Service);
	//	modelMap.put("pb", pb);
	
		return mapper.writeValueAsString(modelMap);
	}
	
	//상품 -> 제품f 리스트
	@RequestMapping(value="/GoodslistAjax", method=RequestMethod.POST, produces="text/json;charset=UTF-8")
	@ResponseBody
	public String GoodslistAjax(@RequestParam HashMap<String, String> params, ModelAndView mav) throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();
		
		//	int cnt = iEmpService.getEmpCnt(params);
		
		//	PagingBean pb = iPagingService.getPagingBean(Integer.parseInt(params.get("page")), cnt, 10, 5);
		//	params.put("startCnt", Integer.toString(pb.getStartCount()));
		//	params.put("endCnt", Integer.toString(pb.getEndCount()));
		
		List<HashMap<String, String>> Goods = iProdService.getGoodsList(params);
		
		modelMap.put("Goods", Goods);
		//	modelMap.put("pb", pb);
		
		return mapper.writeValueAsString(modelMap);
	}










}