package com.smart.mango.web.out.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MsgDao implements IMsgDao{
	
	@Autowired
	public SqlSession sqlSession;

	@Override
	public List<HashMap<String, String>> getMsgInviteList(HashMap<String, String> params) throws Throwable {
		return sqlSession.selectList("msg.getMsgInviteList", params);
	}
}
