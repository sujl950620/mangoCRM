package com.smart.mango.web.inside.service;

import java.util.HashMap;
import java.util.List;

public interface IDepartService {

	public List<HashMap<String, String>> getSuch(HashMap<String, String> params) throws Throwable;

	public List<HashMap<String, String>> getDepartList(HashMap<String, String> params) throws Throwable;

	public List<HashMap<String, String>> getTeamList(HashMap<String, String> params) throws Throwable;

	public HashMap<String, String> getDepartInfo(HashMap<String, String> params) throws Throwable;

	public void insertDepart(HashMap<String, String> params) throws Throwable;

	public void updateDepart(HashMap<String, String> params) throws Throwable;



}
