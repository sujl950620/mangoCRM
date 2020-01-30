package com.smart.mango.web.inside.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProdDao implements IProdDao{
	@Autowired
	public SqlSession sqlSession;

	@Override
	public List<HashMap<String, String>> getServiceList(HashMap<String, String> params) throws Throwable {
		return sqlSession.selectList("prod.getServiceList", params);
	}

	@Override
	public List<HashMap<String, String>> getGoodsList(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		return sqlSession.selectList("prod.getGoodsList", params);
	} 
	

}
