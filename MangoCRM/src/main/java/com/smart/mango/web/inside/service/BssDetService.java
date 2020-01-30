package com.smart.mango.web.inside.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.mango.web.inside.dao.IBssDetDao;

@Service
public class BssDetService implements IBssDetService {
	@Autowired
	public IBssDetDao iBssDetDao;

	@Override
	public HashMap<String, String> getChn(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		return iBssDetDao.getChn(params);
	}

	@Override
	public List<HashMap<String, String>> getBssType(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		return iBssDetDao.getBssType(params);
	}

	@Override
	public List<HashMap<String, String>> getBssSalesDiv(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		return iBssDetDao.getBssSalesDiv(params);
	}

	@Override
	public int getEmpCnt(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		return iBssDetDao.getEmpCnt(params);
	}

	@Override
	public List<HashMap<String, String>> getEmpList(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		return iBssDetDao.getEmpList(params);
	}

	@Override
	public List<HashMap<String, String>> getSelectProdDiv(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		return iBssDetDao.getSelectProdDiv(params);
	}

	@Override
	public List<HashMap<String, String>> getSelectProdType(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		return iBssDetDao.getSelectProdType(params);
	}
	
	@Override
	public List<HashMap<String, String>> getBssOpin(HashMap<String, String> params) throws Throwable {
		return iBssDetDao.getBssOpin(params);
	}

	@Override
	public int getBssOpinCnt(HashMap<String, String> params) throws Throwable {
		return iBssDetDao.getBssOpinCnt(params);
	}

	@Override
	public void insertBssOpin(HashMap<String, String> params) throws Throwable {
		iBssDetDao.insertBssOpin(params);
	}

	@Override
	public void delBssOpin(HashMap<String, String> params) throws Throwable {
		iBssDetDao.delBssOpin(params);
	}
}
