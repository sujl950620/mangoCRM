package com.smart.mango.common.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class ObjectMapperBean {
	 
		@Bean ObjectMapper objectMapper() { return new ObjectMapper(); } 

}
