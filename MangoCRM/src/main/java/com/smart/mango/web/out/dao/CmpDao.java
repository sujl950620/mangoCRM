package com.smart.mango.web.out.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CmpDao implements ICmpDao {

	@Autowired
	public SqlSession sqlSession;

	@Override
	public int clientCnt(HashMap<String, String> params) throws Throwable {
		return sqlSession.selectOne("cmp.clientCnt", params);
	}

	@Override
	public List<HashMap<String, String>> getClientList(HashMap<String, String> term) throws Throwable {
		return sqlSession.selectList("cmp.getClientList", term);
	}

	@Override
	public void channelSelect(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		sqlSession.insert("cmp.channelSelect", params);
	}

	@Override
	public int getCmpCnt(HashMap<String, String> params) throws Throwable {
		return sqlSession.selectOne("cmp.getCmpCnt", params);
	}

	@Override
	public List<HashMap<String, String>> getCmpList(HashMap<String, String> params) throws Throwable {
		return sqlSession.selectList("cmp.getCmpList", params);
	}
	


	
}
