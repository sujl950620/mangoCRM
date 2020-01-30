package com.smart.mango.web.inside.dao;

import java.util.HashMap;
import java.util.List;

public interface IBssDetDao {

	public HashMap<String, String> getChn(HashMap<String, String> params) throws Throwable;

	public List<HashMap<String, String>> getBssType(HashMap<String, String> params) throws Throwable;

	public List<HashMap<String, String>> getBssSalesDiv(HashMap<String, String> params) throws Throwable;

	public int getEmpCnt(HashMap<String, String> params) throws Throwable;

	public List<HashMap<String, String>> getEmpList(HashMap<String, String> params) throws Throwable;

	public List<HashMap<String, String>> getSelectProdDiv(HashMap<String, String> params) throws Throwable;

	public List<HashMap<String, String>> getSelectProdType(HashMap<String, String> params) throws Throwable;

	public List<HashMap<String, String>> getBssOpin(HashMap<String, String> params) throws Throwable;

	public int getBssOpinCnt(HashMap<String, String> params) throws Throwable;

	public void insertBssOpin(HashMap<String, String> params) throws Throwable;

	public void delBssOpin(HashMap<String, String> params) throws Throwable;
}
