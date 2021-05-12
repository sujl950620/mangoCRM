package com.smart.mango.web.inside.dao;

import java.util.Map;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDao implements IClientDao {
	@Autowired
	public SqlSession sqlSession;

	@Override
	public void clientInsertData(Map<String, String> params) throws Throwable {
		sqlSession.insert("Client.clientinsertData",params);
	}

	@Override
	public List<Map<String, String>> getClientGrade(Map<String, String> params) throws Throwable {
		return sqlSession.selectList("Client.getClientGrade",params);
	}

	@Override
	public int getEmpCnt(Map<String, String> params) throws Throwable {
		return sqlSession.selectOne("Client.getEmpCnt",params);
	}

	@Override
	public List<Map<String, String>> getEmpList(Map<String, String> params) throws Throwable {
		return sqlSession.selectList("Client.getEmpList",params);
	}

	@Override
	public int getCompCnt(Map<String, String> params) throws Throwable {
		return sqlSession.selectOne("Client.getCompCnt",params);
	}

	@Override
	public List<Map<String, String>> getCompList(Map<String, String> params) throws Throwable {
		return sqlSession.selectList("Client.getCompList",params);
	}

	@Override
	public int getClientCnt(Map<String, String> params) throws Throwable {
		return sqlSession.selectOne("Client.getclientCnt",params);
	}

	@Override
	public List<Map<String, String>> getClientList(Map<String, String> params) throws Throwable {
		return sqlSession.selectList("Client.getclientList",params);
	}

	@Override
	public Map<String, String> getClientData(Map<String, String> params) throws Throwable {
		return sqlSession.selectOne("Client.getClientData",params);
	}

	@Override
	public List<Map<String, String>> getClientOpin(Map<String, String> params) throws Throwable {
		return sqlSession.selectList("Client.getClientOpin",params);
	}

	@Override
	public int getClientOpinCnt(Map<String, String> params) throws Throwable {
		return sqlSession.selectOne("Client.getClientOpinCnt",params);
	}

	@Override
	public void insertClientOpin(Map<String, String> params) throws Throwable {
		sqlSession.insert("Client.insertClientOpin",params);
	}

	@Override
	public void delClientOpin(Map<String, String> params) throws Throwable {
		sqlSession.delete("Client.delClientOpin",params);
	}

	@Override
	public List<Map<String, String>> getClientMemo(Map<String, String> params) throws Throwable {
		return sqlSession.selectList("Client.getClientMemo",params);
	}

	@Override
	public int getClientMemoCnt(Map<String, String> params) throws Throwable {
		return sqlSession.selectOne("Client.getClientMemoCnt",params);
	}

	@Override
	public void insertClientMemo(Map<String, String> params) throws Throwable {
		sqlSession.insert("Client.insertClientMemo",params);
	}

	@Override
	public void delClientMemo(Map<String, String> params) throws Throwable {
		sqlSession.delete("Client.delClientMemo",params);
	}

	@Override
	public void clientDel(Map<String, String> params) throws Throwable {
		sqlSession.delete("Client.clientdel",params);
	}

	@Override
	public void clientUpdateData(Map<String, String> params) throws Throwable {
		sqlSession.update("Client.clientupdateData",params);
	}

	@Override
	public List<Map<String, String>> getClientSche(Map<String, String> params) throws Throwable {
		return sqlSession.selectList("Client.getClientSche",params);
	}
}
