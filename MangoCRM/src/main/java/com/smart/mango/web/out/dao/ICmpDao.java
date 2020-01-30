package com.smart.mango.web.out.dao;

import java.util.HashMap;
import java.util.List;

public interface ICmpDao {

	public int clientCnt(HashMap<String, String> params) throws Throwable;

	public List<HashMap<String, String>> getClientList(HashMap<String, String> term) throws Throwable;

	public int getCmpCnt(HashMap<String, String> params) throws Throwable;

	public List<HashMap<String, String>> getCmpList(HashMap<String, String> params) throws Throwable;

	public void channelSelect(HashMap<String, String> params) throws Throwable;
}
