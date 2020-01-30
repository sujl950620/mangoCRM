package com.smart.mango.web.out.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.smart.mango.web.out.service.IAnalyzeService;

@Controller
public class AnalyzeController {
	
	@Autowired
	public IAnalyzeService iAnalyzeService;
	
	//대상선정 페이지
	@RequestMapping(value = "/perfAnalyze")
	public ModelAndView perfAnalyze(ModelAndView mav) {

		mav.setViewName("perfAnalyze/perfAnalyze");

		return mav;
	}
}
