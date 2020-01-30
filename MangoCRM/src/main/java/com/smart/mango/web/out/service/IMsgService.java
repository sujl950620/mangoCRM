package com.smart.mango.web.out.service;

import java.util.HashMap;
import java.util.List;

public interface IMsgService {

	public List<HashMap<String, String>> getMsgInviteList(HashMap<String, String> params) throws Throwable;

}
