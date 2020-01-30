package com.smart.mango.web.out.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AnalyzeDao implements IAnalyzeDao {
	
	@Autowired
	public SqlSession sqlSession;
}
