package com.smart.mango.web.inside.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.mango.web.inside.dao.IDepartDao;

@Service
public class DepartService implements IDepartService {
	@Autowired
	public IDepartDao iDepartDao;

	@Override
	public List<HashMap<String, String>> getSuch(HashMap<String, String> params) throws Throwable {
		return iDepartDao.getSuch(params);
	}
	@Override
	public List<HashMap<String, String>> getDepartList(HashMap<String, String> params) throws Throwable {
		return iDepartDao.getDepartList(params);
	}
	@Override
	public List<HashMap<String, String>> getTeamList(HashMap<String, String> params) throws Throwable {
		return iDepartDao.getTeamList(params);
	}
	@Override
	public HashMap<String, String> getDepartInfo(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		return iDepartDao.getDepartInfo(params);
	}
	@Override
	public void insertDepart(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		iDepartDao.insertDepart(params);
	}
	@Override
	public void updateDepart(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		iDepartDao.updateDepart(params);
	}
	
}


