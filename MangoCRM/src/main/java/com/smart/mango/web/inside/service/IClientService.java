package com.smart.mango.web.inside.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IClientService {
	
	/* 고객 등록 */
	void clientInsertData(Map<String, String> params) throws Throwable;

	List<Map<String, String>> getClientGrade(Map<String, String> params)  throws Throwable;

	int getEmpCnt(Map<String, String> params) throws Throwable;

	List<Map<String, String>> getEmpList(Map<String, String> params) throws Throwable;

	int getCompCnt(Map<String, String> params) throws Throwable;

	List<Map<String, String>> getCompList(Map<String, String> params) throws Throwable;

	int getclientCnt(Map<String, String> params) throws Throwable;

	List<Map<String, String>> getclientList(Map<String, String> params) throws Throwable;

	Map<String, String> getClientData(Map<String, String> params) throws Throwable;

	List<Map<String, String>> getClientOpin(Map<String, String> params) throws Throwable;

	int getClientOpinCnt(Map<String, String> params) throws Throwable;

	void insertClientOpin(Map<String, String> params)  throws Throwable;

	void delClientOpin(Map<String, String> params) throws Throwable;

	List<Map<String, String>> getClientMemo(Map<String, String> params) throws Throwable;

	int getClientMemoCnt(Map<String, String> params) throws Throwable;

	void insertClientMemo(Map<String, String> params) throws Throwable;

	void delClientMemo(Map<String, String> params) throws Throwable;

	void clientDel(Map<String, String> params) throws Throwable;

	void clientUpdateData(Map<String, String> params) throws Throwable;

	List<Map<String, String>> getClientSche(Map<String, String> params) throws Throwable;

}
