package com.ycs.controller;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml","classpath:springmvc.xml"})
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class BasiceTestController {
	@Resource
	protected WebApplicationContext webApplicationContext;
	protected MockMvc mockMvc;
	
	@Before
	public void setUp(){
		this.mockMvc=webAppContextSetup(webApplicationContext).build();
	}
}
