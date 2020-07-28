package com.smart.mango.web.inside.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.mango.common.bean.PagingBean;
import com.smart.mango.common.service.IPagingService;
import com.smart.mango.web.common.dao.ICommonDao;
import com.smart.mango.web.inside.dao.IClientDao;

@Service
public class ClientService implements IClientService {
	@Autowired
	public IClientDao iClientDao;
	
	@Autowired
	public ICommonDao iCommonDao;
	
	@Autowired
	public IPagingService iPagingService;
	
	@Autowired
	public IClientService iClientService;
	
	/* 고객 등록 */
	@Override
	public void clientInsertData(HashMap<String, String> params) throws Throwable {
		iClientDao.clientinsertData(params);
	}


	@Override
	public List<HashMap<String, String>> getClientGrade(HashMap<String, String> params) throws Throwable {
		return iClientDao.getClientGrade(params);
	}


	@Override
	public int getEmpCnt(HashMap<String, String> params) throws Throwable {
		return iClientDao.getEmpCnt(params);
	}


	@Override
	public List<HashMap<String, String>> getEmpList(HashMap<String, String> params) throws Throwable {
		return iClientDao.getEmpList(params);
	}


	@Override
	public int getCompCnt(HashMap<String, String> params) throws Throwable {
		return iClientDao.getCompCnt(params);
	}


	@Override
	public List<HashMap<String, String>> getCompList(HashMap<String, String> params) throws Throwable {
		return iClientDao.getCompList(params);
	}


	@Override
	public int getclientCnt(HashMap<String, String> params) throws Throwable {
		return iClientDao.getclientCnt(params);
	}


	@Override
	public List<HashMap<String, String>> getclientList(HashMap<String, String> params) throws Throwable {
		return iClientDao.getclientList(params);
	}


	@Override
	public HashMap<String, String> getClientData(HashMap<String, String> params) throws Throwable {
		return iClientDao.getClientData(params);
	}


	@Override
	public List<HashMap<String, String>> getClientOpin(HashMap<String, String> params) throws Throwable {
		return iClientDao.getClientOpin(params);
	}


	@Override
	public int getClientOpinCnt(HashMap<String, String> params) throws Throwable {
		return iClientDao.getClientOpinCnt(params);
	}


	@Override
	public void insertClientOpin(HashMap<String, String> params) throws Throwable {
		iClientDao.insertClientOpin(params);
	}


	@Override
	public void delClientOpin(HashMap<String, String> params) throws Throwable {
		iClientDao.delClientOpin(params);
	}


	@Override
	public List<HashMap<String, String>> getClientMemo(HashMap<String, String> params) throws Throwable {
		return iClientDao.getClientMemo(params);
	}


	@Override
	public int getClientMemoCnt(HashMap<String, String> params) throws Throwable {
		return iClientDao.getClientMemoCnt(params);
	}


	@Override
	public void insertClientMemo(HashMap<String, String> params) throws Throwable {
		iClientDao.insertClientMemo(params);
	}


	@Override
	public void delClientMemo(HashMap<String, String> params) throws Throwable {
		iClientDao.delClientMemo(params);
	}


	@Override
	public void clientDel(HashMap<String, String> params) throws Throwable {
		iClientDao.clientdel(params);
	}


	@Override
	public void clientUpdateData(HashMap<String, String> params) throws Throwable {
		iClientDao.clientupdateData(params);
	}


	@Override
	public List<HashMap<String, String>> getClientSche(HashMap<String, String> params) throws Throwable {
		return iClientDao.getClientSche(params);
	}
	
	public HashMap<String, String> pageSet(HashMap<String, String> params) {
		if(params.get("page") == null) {
			params.put("page", "1");
		}	
		return params;
	}
	
	public PagingBean startEndPage(int cnt,HashMap<String, String> params ) {
		System.out.println("ckin");
		PagingBean pb = iPagingService.getPagingBean(Integer.parseInt(params.get("page")), cnt, 10, 5);
		System.out.println("ck ---------------"+pb);
		params.put("startCnt", Integer.toString(pb.getStartCount()));
		params.put("endCnt", Integer.toString(pb.getEndCount()));
		return pb;
	}
	
}
