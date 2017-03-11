package com.ycs.selenium;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.annotation.Resource;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.test.annotation.Rollback;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.linux.GetDriver;
import com.ycs.model.domain.StudentInfo;
import com.ycs.model.domain.Studentcrawler;
import com.ycs.model.service.BasiceTestService;
import com.ycs.model.service.StudentInfoService;
import com.ycs.util.SeleniumUtil;

public class TestYB extends BasiceTestService{
	@Resource
	private YB yb;
	@Resource
	StudentInfoService studentInfoService;
	@Rollback(false)
	@Test
	public void testService() throws Exception {
		yb.start();
		
		int min=28518;
		int max=min+3;
		for(int id=min;id<max;id++){			
			StudentInfo studentInfo=studentInfoService.getYB(id);
			System.out.println(id);
			if(studentInfo!=null){
				System.out.println(studentInfo.getStudyId()+","+studentInfo.getShenfenzhenghaoma().substring(10,16));
				yb.yb(studentInfo.getId(),studentInfo.getStudyId(),studentInfo.getShenfenzhenghaoma().substring(10,16));
			}
			
		}
		
		Thread.sleep(5000);
		yb.shutdown();
	}
	


}
