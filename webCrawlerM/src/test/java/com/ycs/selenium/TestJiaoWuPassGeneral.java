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
import com.ycs.model.domain.Studentcrawler;
import com.ycs.model.service.BasiceTestService;
import com.ycs.util.SeleniumUtil;

public class TestJiaoWuPassGeneral extends BasiceTestService{
	@Resource
	private JiaoWuPass jiaoWuPassGeneral;
	
//	@Rollback(false)
	@Test
	public void testJiaowuPassGeneral(){
	}
	

}
