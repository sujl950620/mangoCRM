package com.smart.mango.web.inside.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartDao implements IDepartDao {
	@Autowired
	public SqlSession sqlSession;

	@Override
	public List<HashMap<String, String>> getSuch(HashMap<String, String> params) throws Throwable {
		return sqlSession.selectList("depart.getSuch",params);
	}
	@Override
	public List<HashMap<String, String>> getDepartList(HashMap<String, String> params) throws Throwable {
		return sqlSession.selectList("depart.getDepartList",params);
	}
	@Override
	public List<HashMap<String, String>> getTeamList(HashMap<String, String> params) throws Throwable {
		return sqlSession.selectList("depart.getTeamList",params);
	}
	@Override
	public HashMap<String, String> getDepartInfo(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("depart.getDepartInfo",params);
	}
	@Override
	public void insertDepart(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		sqlSession.insert("depart.insertDepart",params);
	}
	@Override
	public void updateDepart(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		sqlSession.update("depart.updateDepart",params);
	}

}