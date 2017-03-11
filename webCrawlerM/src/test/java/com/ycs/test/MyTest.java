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

public class MyTest {
	
	public String yearPass(int year,int month,int day){
		int yearDay=372;
		String now="";
		String yearStr="";
		String monthStr="";
		String dayStr="";
		for(int i=0;i<yearDay;i++){
			yearStr=year+"";
			monthStr=month+"";
			dayStr=day+"";
			if(monthStr.length()==1){
				monthStr="0"+monthStr;
			}
			if(dayStr.length()==1){
				dayStr="0"+dayStr;
			}
			now=yearStr+monthStr+dayStr;
			if(day>=31){
				day=1;
				if(month>=12){
					month=1;
					year++;
				}else{
					month++;
				}
			}else{
				day++;
			}
			System.out.println(now);
		}
		return now;
	}
    
	
	
	@Test
	public void TestDate(){
//		String date="19960418";
//		String solar=DateUtil.lunarToSolarString(date);
//		String lunar=DateUtil.solarToLunarString(date);
//		System.out.println(solar+"\t"+lunar);
		yearPass(2016, 1, 1);
		
	
		
		}
		
//	@Test
	public void TestMy(){
		SeleniumUtil.fileWrite("chromedriver.txt",MyUtil.getFormatDate(""));
		System.out.println(MyUtil.getFormatDate("mm"));
	}

//	 @Test
	public void TestJiaowu() throws IOException {
		JiaoWuSearcher jiaoWuSearcher = new JiaoWuSearcher();
		jiaoWuSearcher.startJiaowu("sub", 1, 3077974);

	}

}
