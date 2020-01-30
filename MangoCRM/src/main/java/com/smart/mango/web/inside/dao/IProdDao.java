package com.smart.mango.web.inside.dao;

import java.util.HashMap;
import java.util.List;

public interface IProdDao {

	List<HashMap<String, String>> getServiceList(HashMap<String, String> params)throws Throwable;

	List<HashMap<String, String>> getGoodsList(HashMap<String, String> params)throws Throwable;

}
