package com.smart.mango.web.out.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.mango.web.out.dao.IMsgDao;

@Service
public class MsgService implements IMsgService{
	
	@Autowired
	public IMsgDao iMsgDao;

	@Override
	public List<HashMap<String, String>> getMsgInviteList(HashMap<String, String> params) throws Throwable {
		return iMsgDao.getMsgInviteList(params);
	}
	
}
