package com.smart.mango.web.out.controller;

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
import com.smart.mango.web.out.service.IMsgService;

@Controller
public class MsgController {
	
	@Autowired
	public IMsgService iMsgService;
	
	//채팅방 페이지
	@RequestMapping(value = "/msgChat")
	public ModelAndView msgChat(ModelAndView mav) {
		mav.setViewName("msg/msgChat");
		
		return mav;
	}
	
	//채팅방 초대하기 페이지
		@RequestMapping(value = "/msgInvite")
		public ModelAndView msgInvite(ModelAndView mav) {
			mav.setViewName("msg/msgInvite");
                                                           			
			return mav;
		}
	
	//업체목록
	@RequestMapping(value="/getMsgInviteListAjax",
			method = RequestMethod.POST,
			produces = "text/json;charset=UTF-8")
	@ResponseBody 
	public String getMsgInviteListAjax(@RequestParam HashMap<String,String> params,
									ModelAndView mav) throws Throwable{
	
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> modelMap = new HashMap<String, Object>();
		
		List<HashMap<String,String>> list = iMsgService.getMsgInviteList(params);
		
		modelMap.put("list", list);
		
		return mapper.writeValueAsString(modelMap);
	}
		
	//채팅방 목록 페이지
	@RequestMapping(value = "/msgList")
	public ModelAndView msgList(ModelAndView mav) {
		mav.setViewName("msg/msgList");
		
		return mav;
	}
}
