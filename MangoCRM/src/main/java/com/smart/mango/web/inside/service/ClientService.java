package com.smart.mango.web.inside.service;

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
	public void clientInsertData(Map<String, String> params) throws Throwable {
		iClientDao.clientInsertData(params);
	}


	@Override
	public List<Map<String, String>> getClientGrade(Map<String, String> params) throws Throwable {
		return iClientDao.getClientGrade(params);
	}


	@Override
	public int getEmpCnt(Map<String, String> params) throws Throwable {
		return iClientDao.getEmpCnt(params);
	}


	@Override
	public List<Map<String, String>> getEmpList(Map<String, String> params) throws Throwable {
		return iClientDao.getEmpList(params);
	}


	@Override
	public int getCompCnt(Map<String, String> params) throws Throwable {
		return iClientDao.getCompCnt(params);
	}


	@Override
	public List<Map<String, String>> getCompList(Map<String, String> params) throws Throwable {
		return iClientDao.getCompList(params);
	}


	@Override
	public int getclientCnt(Map<String, String> params) throws Throwable {
		return iClientDao.getClientCnt(params);
	}


	@Override
	public List<Map<String, String>> getclientList(Map<String, String> params) throws Throwable {
		return iClientDao.getClientList(params);
	}


	@Override
	public Map<String, String> getClientData(Map<String, String> params) throws Throwable {
		return iClientDao.getClientData(params);
	}


	@Override
	public List<Map<String, String>> getClientOpin(Map<String, String> params) throws Throwable {
		return iClientDao.getClientOpin(params);
	}


	@Override
	public int getClientOpinCnt(Map<String, String> params) throws Throwable {
		return iClientDao.getClientOpinCnt(params);
	}


	@Override
	public void insertClientOpin(Map<String, String> params) throws Throwable {
		iClientDao.insertClientOpin(params);
	}


	@Override
	public void delClientOpin(Map<String, String> params) throws Throwable {
		iClientDao.delClientOpin(params);
	}


	@Override
	public List<Map<String, String>> getClientMemo(Map<String, String> params) throws Throwable {
		return iClientDao.getClientMemo(params);
	}


	@Override
	public int getClientMemoCnt(Map<String, String> params) throws Throwable {
		return iClientDao.getClientMemoCnt(params);
	}


	@Override
	public void insertClientMemo(Map<String, String> params) throws Throwable {
		iClientDao.insertClientMemo(params);
	}


	@Override
	public void delClientMemo(Map<String, String> params) throws Throwable {
		iClientDao.delClientMemo(params);
	}


	@Override
	public void clientDel(Map<String, String> params) throws Throwable {
		iClientDao.clientDel(params);
	}


	@Override
	public void clientUpdateData(Map<String, String> params) throws Throwable {
		iClientDao.clientUpdateData(params);
	}


	@Override
	public List<Map<String, String>> getClientSche(Map<String, String> params) throws Throwable {
		return iClientDao.getClientSche(params);
	}
	
	public Map<String, String> pageSet(Map<String, String> params) {
		params.putIfAbsent("page", "1");
		return params;
	}

	public PagingBean startEndPage(int cnt, Map<String, String> params) {
		PagingBean pb = iPagingService.getPagingBean(Integer.parseInt(params.get("page")), cnt, 10, 5);
		params.put("startCnt", Integer.toString(pb.getStartCount()));
		params.put("endCnt", Integer.toString(pb.getEndCount()));
		return pb;
	}
	
}
