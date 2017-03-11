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

import com.ycs.model.domain.StudentInfo;
import com.ycs.model.domain.Studentcrawler;
import com.ycs.model.domain.Ybinfo;
import com.ycs.util.MyUtil;

public class TestYbinfoService extends BasiceTestService{
	@Resource
	StudentInfoService studentInfoService;	
	@Resource
	YbinfoService ybinfoService;
	@Test
	public void testForElse(){
		List<StudentInfo>studentInfos=studentInfoService.getYBForElse();
		int c=0;
		for(StudentInfo studentInfo:studentInfos){
			System.out.println(studentInfo.getId());
			c++;
		}
		System.out.println(c);
	}
	
//	@Test
	public void testSelectFirst(){
		
		Ybinfo ybinfo=(Ybinfo) ybinfoService.queryUniqueLast("from Ybinfo", null);
		System.out.println(ybinfo);
	}
}
