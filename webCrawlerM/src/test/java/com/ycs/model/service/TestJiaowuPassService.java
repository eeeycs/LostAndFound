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
import com.ycs.selenium.JiaoWuPass;
import com.ycs.util.MyUtil;

public class TestJiaowuPassService extends BasiceTestService{
	@Resource
	private JiaoWuPass jiaoWuPass;
	
	@Test
	public void testSelectFirst(){
		jiaoWuPass.startPass(1, "1");
	}
}
