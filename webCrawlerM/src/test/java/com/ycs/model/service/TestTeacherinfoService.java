package com.ycs.model.service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.io.filefilter.FalseFileFilter;
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

public class TestTeacherinfoService extends BasiceTestService{
	@Resource
	protected TeacherinfoService teacherinfoService;
	
	@Rollback(false)
	@Test
	public void testGetPass(){
		String[] strings=teacherinfoService.getPass(1);
		System.out.println(strings[0]+","+strings[1].substring(8,8+6));
		
//		teacherinfoService.updatePass(1, "123456");
	}
	
}
