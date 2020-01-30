package com.smart.mango.web.out.dao;

import java.util.HashMap;
import java.util.List;

public interface IMsgDao {

	public List<HashMap<String, String>> getMsgInviteList(HashMap<String, String> params) throws Throwable;

}
