package com.smart.mango.web.out.dao;

import java.util.HashMap;
import java.util.List;

public interface IAppDao {

	public int listCnt(HashMap<String, String> params)throws Throwable;

	public List<HashMap<String, String>> getlist(HashMap<String, String> params)throws Throwable;

	public void Appday(HashMap<String, String> params)throws Throwable;

	

}
