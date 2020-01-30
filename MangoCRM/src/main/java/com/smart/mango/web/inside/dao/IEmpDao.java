package com.smart.mango.web.inside.dao;

import java.util.HashMap;
import java.util.List;

public interface IEmpDao {

	public List<HashMap<String, String>> getEmpList(HashMap<String, String> params) throws Throwable;
	public int getEmpCnt(HashMap<String, String> params) throws Throwable;
	public List<HashMap<String, String>> getPosiList() throws Throwable;
	public List<HashMap<String, String>> getFormList() throws Throwable;
	public List<HashMap<String, String>> getDepartList() throws Throwable;
	public List<HashMap<String, String>> getAuthorList() throws Throwable;
	public List<HashMap<String, String>> getTeamList(HashMap<String, String> params) throws Throwable;
	public void insertEmp(HashMap<String, String> params) throws Throwable;
	public HashMap<String, String> setEmpData(HashMap<String, String> params) throws Throwable;
	public int getTeamEmpCnt(HashMap<String, String> params) throws Throwable;
	public List<HashMap<String, String>> getTeamEmp(HashMap<String, String> params) throws Throwable;
	public int checkEmail(HashMap<String, String> params) throws Throwable;
	public int checkEmpId(HashMap<String, String> params) throws Throwable;
	public void updateEmp(HashMap<String, String> params) throws Throwable;
	public void deleteEmp(HashMap<String, String> params) throws Throwable;

}
