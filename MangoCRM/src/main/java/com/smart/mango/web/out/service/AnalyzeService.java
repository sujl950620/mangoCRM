package com.smart.mango.web.out.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.mango.web.out.dao.IAnalyzeDao;

@Service
public class AnalyzeService implements IAnalyzeService {
	
	@Autowired
	public IAnalyzeDao iAnalyzeDao;
}
