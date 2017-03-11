package com.ycs.model.service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.ycs.model.domain.Studentcrawler;
import com.ycs.model.domain.Ybinfo;
import com.ycs.util.DateUtil;
import com.ycs.util.MyUtil;

public class TestStudentInfoService extends BasiceTestService{
	@Resource
	StudentInfoService studentInfoService;
//	@Test
	public void testGetJiaowuPass(){
		String[] strs=studentInfoService.getJiaowuPass(25004);
		String pass=strs[1];
		System.out.println(strs[0]+","+"123456");
		System.out.println(strs[0]+","+pass.substring(2));
		System.out.println(strs[0]+","+DateUtil.solarToLunarString(pass).substring(2));
		System.out.println(strs[0]+","+DateUtil.lunarToSolarString(pass).substring(2));
		
	}
	
//	@Rollback(false)
	@Test
	public void testSetJiaowuPass(){
		
	}
}
