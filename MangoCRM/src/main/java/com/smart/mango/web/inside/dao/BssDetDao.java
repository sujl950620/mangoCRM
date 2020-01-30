package com.smart.mango.web.inside.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BssDetDao implements IBssDetDao {
	@Autowired
	public SqlSession sqlSession;

	@Override
	public HashMap<String, String> getChn(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("bssDet.getChn", params);
	}

	@Override
	public List<HashMap<String, String>> getBssType(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		return sqlSession.selectList("bssDet.getBssType", params);
	}

	@Override
	public List<HashMap<String, String>> getBssSalesDiv(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		return sqlSession.selectList("bssDet.getBssSalesDiv", params);
	}

	@Override
	public int getEmpCnt(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("bssDet.getEmpCnt", params);
	}

	@Override
	public List<HashMap<String, String>> getEmpList(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		return sqlSession.selectList("bssDet.getEmpList", params);
	}

	@Override
	public List<HashMap<String, String>> getSelectProdDiv(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		return sqlSession.selectList("bssDet.getSelectProdDiv", params);
	}

	@Override
	public List<HashMap<String, String>> getSelectProdType(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		return sqlSession.selectList("bssDet.getSelectProdType", params);
	}
	
	@Override
	public List<HashMap<String, String>> getBssOpin(HashMap<String, String> params) throws Throwable {
		return sqlSession.selectList("bssDet.getBssOpin", params);
	}

	@Override
	public int getBssOpinCnt(HashMap<String, String> params) throws Throwable {
		return sqlSession.selectOne("bssDet.getBssOpinCnt", params);
	}

	@Override
	public void insertBssOpin(HashMap<String, String> params) throws Throwable {
		sqlSession.insert("bssDet.insertBssOpin", params);
	}

	@Override
	public void delBssOpin(HashMap<String, String> params) throws Throwable {
		sqlSession.update("bssDet.delBssOpin", params);
	}
}
