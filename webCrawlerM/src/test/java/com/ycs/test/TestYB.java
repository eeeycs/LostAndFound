package com.ycs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

import org.junit.Test;

import com.ycs.model.domain.StudentInfo;
import com.ycs.model.domain.Studentcrawler;
import com.ycs.model.service.StudentCrawlerService;
import com.ycs.model.service.StudentInfoService;
import com.ycs.selenium.JiaoWuSearcher;
import com.ycs.selenium.YB;
import com.ycs.util.DateUtil;
import com.ycs.util.MyUtil;
import com.ycs.util.SeleniumUtil;

public class TestYB {
	
	@Test
	public void testService() throws Exception {
		System.out.println(DateUtil.lunarToSolarString("19960231"));
	}

}
