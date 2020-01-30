package com.smart.mango.web.inside.service;

import java.util.HashMap;
import java.util.List;

public interface IProdService {

	List<HashMap<String, String>> getServiceList(HashMap<String, String> params)throws Throwable;

	List<HashMap<String, String>> getGoodsList(HashMap<String, String> params)throws Throwable;;

}
