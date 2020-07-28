package com.smart.mango.web.inside.service;

import java.util.HashMap;
import java.util.List;

public interface IClientService {
	
	/* 고객 등록 */
	void clientInsertData(HashMap<String, String> params) throws Throwable;

	List<HashMap<String, String>> getClientGrade(HashMap<String, String> params)  throws Throwable;

	int getEmpCnt(HashMap<String, String> params) throws Throwable;

	List<HashMap<String, String>> getEmpList(HashMap<String, String> params) throws Throwable;

	int getCompCnt(HashMap<String, String> params) throws Throwable;

	List<HashMap<String, String>> getCompList(HashMap<String, String> params) throws Throwable;

	int getclientCnt(HashMap<String, String> params) throws Throwable;

	List<HashMap<String, String>> getclientList(HashMap<String, String> params) throws Throwable;

	HashMap<String, String> getClientData(HashMap<String, String> params) throws Throwable;

	List<HashMap<String, String>> getClientOpin(HashMap<String, String> params) throws Throwable;

	int getClientOpinCnt(HashMap<String, String> params) throws Throwable;

	void insertClientOpin(HashMap<String, String> params)  throws Throwable;

	void delClientOpin(HashMap<String, String> params) throws Throwable;

	List<HashMap<String, String>> getClientMemo(HashMap<String, String> params) throws Throwable;

	int getClientMemoCnt(HashMap<String, String> params) throws Throwable;

	void insertClientMemo(HashMap<String, String> params) throws Throwable;

	void delClientMemo(HashMap<String, String> params) throws Throwable;

	void clientDel(HashMap<String, String> params) throws Throwable;

	void clientUpdateData(HashMap<String, String> params) throws Throwable;

	List<HashMap<String, String>> getClientSche(HashMap<String, String> params) throws Throwable;

}
