package com.ycs.selenium;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import org.junit.Test;

@Component
public class TeacherJiaoWuSearcher extends TeacherJiaoWu{
	
	@Test
	public void test(){
		startTeacher("add", 99, 0);
	}
	
	
	public String getData(String selectId){
		String teacherId="";
		try {
			teacherId=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[1]/td[4]")).getText();

			System.out.println(teacherId);
//			teacherinfoService.save(teacherinfo);
		
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("getDate Exception------------------------------------------------------------");
			driver.navigate().back();
			return "";
		}
		driver.navigate().back();
		return teacherId;
	}
	
	
	




}
