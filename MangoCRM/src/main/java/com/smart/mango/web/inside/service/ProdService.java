package com.smart.mango.web.inside.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.mango.web.common.dao.ICommonDao;
import com.smart.mango.web.inside.dao.IProdDao;

@Service
public class ProdService implements IProdService{
	@Autowired
	public IProdDao iProdDao;
	@Autowired
	public ICommonDao iCommonDao;
	@Override
	public List<HashMap<String, String>> getServiceList(HashMap<String, String> params) throws Throwable {
		return iProdDao.getServiceList(params);
	}
	@Override
	public List<HashMap<String, String>> getGoodsList(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		return iProdDao.getGoodsList(params);
	}
}
