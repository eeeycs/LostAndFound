package com.ycs.selenium;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Rollback;

import com.ycs.model.domain.StudentInfo;
import com.ycs.model.domain.Ybinfo;
import com.ycs.model.service.BasiceTestService;
import com.ycs.model.service.StudentInfoService;
import com.ycs.model.service.YbinfoService;
import com.ycs.util.CodeUtil;
import com.ycs.util.MyUtil;
import com.ycs.util.SeleniumUtil;

@Component
public class YB extends BasiceTestService{
	@Resource
	private YbinfoService ybinfoService;
	@Resource
	private StudentInfoService studentInfoService;
	private WebDriver driver;
	private JavascriptExecutor jse;
	
	public void start() {
		System.out.println("start");
		driver = SeleniumUtil.getChromeDriver();
		jse = (JavascriptExecutor) driver;
//		driver.manage().window().setSize(new Dimension(200, 500));
//		driver.manage().window().setPosition(new Point(-2000, 0));
	}
	public void shutdown(){
		System.out.println("shutdown");
		driver.quit();
	}
	public void restart(){
		System.out.println("restart");
		SeleniumUtil.fileWrite("chromedriver.txt",MyUtil.getFormatDate(""));
		shutdown();
		start();
	}
	@Rollback(false)
	@Test
	public void startYbForElse(){
		start();
		String restartPre="";
		String userName="";
		String userPass="";
		List<StudentInfo>studentInfos=studentInfoService.getYBForElse();
		for(StudentInfo studentInfo:studentInfos){
//			StudentInfo studentInfo=studentInfoService.getYB(id);
			System.out.println(studentInfo.getId());
			if(studentInfo!=null){
				System.out.println(studentInfo.getStudyId()+","+studentInfo.getPwd());
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				
				try {
					userName=studentInfo.getStudyId();
					userPass=studentInfo.getPwd();
//					if(userPass.length()==18){
//						userPass=userPass.substring(10,16);
//					}else{
//						userPass="123456";
//					}
					System.out.println(userName+"\t"+userPass);
					yb(studentInfo.getId(),userName,userPass);
					//浏览器重启机制
					if(MyUtil.getFormatDate("mm").equals("00")||MyUtil.getFormatDate("mm").equals("30")){
						if(!MyUtil.getFormatDate("mm").equals(restartPre)){
							restart();
							restartPre=MyUtil.getFormatDate("mm");
						}
					}
					
				} catch (Exception e) {
					e.printStackTrace();
					break;
				}
			}
		}
		shutdown();
	}
	
	public void startYb(int min){
		start();
		int max=min+40000;
		String restartPre="";
		String userName="";
		String userPass="";
		for(int id=min;id<max;id++){
			StudentInfo studentInfo=studentInfoService.getYB(id);
			System.out.println(id);
			if(studentInfo!=null){
				System.out.println(studentInfo.getStudyId()+","+studentInfo.getShenfenzhenghaoma().substring(10,16));
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

				try {
					userName=studentInfo.getStudyId();
					userPass=studentInfo.getShenfenzhenghaoma();
					if(userPass.length()==18){
						userPass=userPass.substring(10,16);
					}else{
						userPass="123456";
					}
					System.out.println(userName+"\t"+userPass);
					yb(studentInfo.getId(),userName,userPass);
					//浏览器重启机制
					if(MyUtil.getFormatDate("mm").equals("00")||MyUtil.getFormatDate("mm").equals("30")){
						if(!MyUtil.getFormatDate("mm").equals(restartPre)){
							restart();
							restartPre=MyUtil.getFormatDate("mm");
						}
					}
					
				} catch (Exception e) {
					e.printStackTrace();
					break;
				}
			}
		}
		shutdown();
	}

	public void yb(int id,String userName,String userPass) throws Exception{
			if(login(id,userName,userPass)){
				if(getBaseInfo(id,userPass)){				
					if(toRegisterInfo()){
						getRegisterInfoHtml(id,userName);
						SeleniumUtil.fileWrite("yb.txt", id+"_"+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss")+":\t"+"getRegisterInfo*********************************");
						System.out.println("获得了登记信息==================================================================记录");
					}else{
						SeleniumUtil.fileWrite("yb.txt", id+"_"+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss"));
						System.out.println("常规==================================================================记录");
					}
				}else{
					SeleniumUtil.fileWrite("yb.txt", id+"_"+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss")+":\t"+"no getBaseInfo$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println("没有获取到基本信息==================================================================记录");
				}
			}
			logout();
	}
	

	public void logout(){
		driver.get("http://113.54.11.26/sys/SystemForm/ExitWindows.aspx");
		System.out.println("退出当前登录");
	}
	
	public boolean login(int id,String userName,String userPass ) throws InterruptedException{
		String main="http://113.54.11.26/sys/SystemForm/main.htm";
		String info="http://113.54.11.26/sys/SystemForm/Class/MyStudent.aspx";
		
		String str=clickLogin(userName, userPass);
		System.out.println(str);
		if(str.equals("用户名或密码错误！")||str.equals("用户名不存在！")||str.equals("null")||str.equals("用户未激活,系统将为你自动跳转到激活页面！")){
			if(str.equals("用户名或密码错误！")){
				SeleniumUtil.fileWrite("yb.txt", id+"_"+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss")+":\t"+"userName Or userPass Error###############################");
				System.out.println("用户名或密码错误==================================================================记录");
			}	
			if(str.equals("用户名不存在！")){
				SeleniumUtil.fileWrite("yb.txt", id+"_"+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss")+":\t"+"userName Exist----------------------------");
				System.out.println("用户名不存在！==================================================================记录");
			}
			if(str.equals("null")){
				SeleniumUtil.fileWrite("yb.txt", id+"_"+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss")+":\t"+"null error!!!!!!!!!!!!!!!!!!----------------");
				System.out.println("空错误！==================================================================记录");
			}
			if(str.equals("用户未激活,系统将为你自动跳转到激活页面！")){
				SeleniumUtil.fileWrite("yb.txt", id+"_"+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss")+":\t"+"userName Havent Live!!!!!!!!!!!!!!!!!!----------------");
				System.out.println("用户未激活！==================================================================记录");
			}
		}else{
			int countLogin=0;
			int loginFlag=0;
			while(!str.equals("ok")){
				countLogin++;
				if(countLogin==15){
//					restart();
					loginFlag=1;
				}
				if(countLogin>30) {
					SeleniumUtil.fileWrite("yb.txt", id+"_"+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss")+":\t"+"visit error!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println("访问错误==================================================================记录");
					break;
				}
				System.out.println("countLogin@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@^^^^^^^^^^^^^^^^^^^^^^"+countLogin*100);
				if(loginFlag==1){
					Thread.sleep((countLogin-14)*100);
				}else{
					Thread.sleep(countLogin*100);
				}

				System.out.println("登录不成功错误，重新登录");
				str=clickLogin(userName, userPass);
				System.out.println(str);
				
				if(str.equals("用户名或密码错误！")||str.equals("用户名不存在！")||str.equals("null")||str.equals("用户未激活,系统将为你自动跳转到激活页面！")){
					if(str.equals("用户名或密码错误！")){
						SeleniumUtil.fileWrite("yb.txt", id+"_"+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss")+":\t"+"userName Or userPass Error###############################");
						System.out.println("用户名或密码错误==================================================================记录");
					}	
					if(str.equals("用户名不存在！")){
						SeleniumUtil.fileWrite("yb.txt", id+"_"+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss")+":\t"+"userName Exist----------------------------");
						System.out.println("用户名不存在！==================================================================记录");
					}
					if(str.equals("null")){
						SeleniumUtil.fileWrite("yb.txt", id+"_"+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss")+":\t"+"null error!!!!!!!!!!!!!!!!!!----------------");
						System.out.println("空错误！==================================================================记录");
					}
					if(str.equals("用户未激活,系统将为你自动跳转到激活页面！")){
						SeleniumUtil.fileWrite("yb.txt", id+"_"+userName+"_"+userPass+MyUtil.getFormatDate("-dd_HH:mm:ss")+":\t"+"userName Havent Live!!!!!!!!!!!!!!!!!!----------------");
						System.out.println("用户未激活！==================================================================记录");
					}
					break;
				}
			}
			
		}
		
		
		if(driver.getCurrentUrl().equals(main)){
			System.out.println("登录成功，准备跳转到基本信息页面");
			driver.get(info);
		}
		if(driver.getCurrentUrl().equals(info)){
			System.out.println("基本信息页面");
			return true;
		}
		return false;
	}
	
	public String clickLogin(String userName,String userPass ) throws InterruptedException{
		String url = "http://113.54.11.26/sys/UserLogin.aspx";
		String main="http://113.54.11.26/sys/SystemForm/main.htm";
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id=\"UserPass\"]")).sendKeys(userPass);
		//写验证码
		WebElement webElement = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div[2]/div[3]/div[2]/img"));
		String code=CodeUtil.getCode(driver, webElement,userName);
		if(code.equals("")){
			return "code";
		}
		System.out.println(code);
		driver.findElement(By.xpath("//*[@id=\"CheckCode\"]")).sendKeys(code);
		driver.findElement(By.xpath("//*[@id=\"Btn_OK\"]")).click();
		try {
			Thread.sleep(100);
			Alert alert=driver.switchTo().alert();
			String str=alert.getText();
			System.out.println("弹出了alert");
			System.out.println(str);
			alert.dismiss();
			return str;
		} catch (Exception e) {
			System.out.println("没有弹出alert");
		}
		
		if(driver.getCurrentUrl().equals(main)){
			System.out.println("登录成功");	
			return "ok";
		}
		
		return "null";
	}

	
	
	
	public boolean toRegisterInfo(){
		try {
			WebElement webElement=driver.findElement(By.id("RegisterBtn"));
			webElement.click();
			System.out.println("跳转到登记信息");			
			return true;
		} catch (Exception e) {
			System.out.println("没有登记信息");
			return false;
		}
	}
	public void getRegisterInfoHtml(int id,String userName) throws InterruptedException{
		String info="http://113.54.11.26/sys/SystemForm/Class/MyStudent.aspx";
		int countGetRegisterInfoHtml=0;
		while(driver.getCurrentUrl().equals(info)){
			countGetRegisterInfoHtml++;
			if(countGetRegisterInfoHtml>10) break;
			System.out.println("countGetRegisterInfoHtml@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+countGetRegisterInfoHtml*100);
			Thread.sleep(countGetRegisterInfoHtml*100);
		}
		String registerInfo=driver.getPageSource();
		Ybinfo ybinfo=(Ybinfo) ybinfoService.queryUniqueLast("from Ybinfo", null);
//		ybinfo.setRegisterInfo(registerInfo);
		ybinfoService.update(ybinfo);
		System.out.println("获得registerInfo");
		
	}

	public boolean getBaseInfo(int selectId,String studentPass){
		System.out.println("获取基本信息");

		String photo=driver.findElement(By.id("Student11_photo")).getAttribute("src");
		String studentNo=driver.findElement(By.name("Student11$StudentNo")).getAttribute("value");		
		String studentName=driver.findElement(By.name("Student11$StudentName")).getAttribute("value");
		String namePY=driver.findElement(By.name("Student11$NamePY")).getAttribute("value");
		String sex=driver.findElement(By.name("Student11$Sex")).getAttribute("value");
		String birthDay=driver.findElement(By.name("Student11$BirthDay")).getAttribute("value");
		String national=driver.findElement(By.name("Student11$National")).getAttribute("value");
		String polity=driver.findElement(By.name("Student11$Polity")).getAttribute("value");
		String inTime=driver.findElement(By.name("Student11$InTime")).getAttribute("value");
		String nativePlace=driver.findElement(By.name("Student11$NativePlace")).getAttribute("value");
		String province=driver.findElement(By.name("province")).getAttribute("value");
		String city=driver.findElement(By.name("city")).getAttribute("value");
		String county=driver.findElement(By.name("county")).getAttribute("value");
		String idCard=driver.findElement(By.name("Student21$IdCard")).getAttribute("value");
		String famillyReg=driver.findElement(By.name("Student21$FamillyReg")).getAttribute("value");
		String examineeType=driver.findElement(By.name("Student21$ExamineeType")).getAttribute("value");
		String getType1=driver.findElement(By.name("Student21$GetType1")).getAttribute("value");
		String examineeNo=driver.findElement(By.name("Student21$ExamineeNo")).getAttribute("value");
		String unitSchool=driver.findElement(By.name("Student21$UnitSchool")).getAttribute("value");
		String oneCard=driver.findElement(By.name("Student21$OneCard")).getAttribute("value");
		String doctorNo=driver.findElement(By.name("Student21$DoctorNo")).getAttribute("value");
		String bankName=driver.findElement(By.name("Student21$BankName")).getAttribute("value");
		String bankNo=driver.findElement(By.name("Student21$BankNo")).getAttribute("value");
		String bankAddress=driver.findElement(By.name("Student21$BankAddress")).getAttribute("value");
		String unionpayNo=driver.findElement(By.name("Student21$UnionpayNo")).getAttribute("value");
		String moveTel=driver.findElement(By.name("Student31$MoveTel")).getAttribute("value");
		String email=driver.findElement(By.name("Student31$Email")).getAttribute("value");
		String QQCard=driver.findElement(By.name("Student31$QQCard")).getAttribute("value");
		String WXQCard=driver.findElement(By.name("Student31$WXQCard")).getAttribute("value");
		String familyFlat=driver.findElement(By.name("Student41$FamilyFlat")).getAttribute("value");
		String guardianName=driver.findElement(By.name("Student41$GuardianName")).getAttribute("value");
		String guardianRelationship=driver.findElement(By.name("Student41$GuardianRelationship")).getAttribute("value");
		String guardianHarmony=driver.findElement(By.name("Student41$GuardianHarmony")).getAttribute("value");
		String guardianTel=driver.findElement(By.name("Student41$GuardianTel")).getAttribute("value");
		String guardianUnit=driver.findElement(By.name("Student41$GuardianUnit")).getAttribute("value");
		String guardianName2=driver.findElement(By.name("Student41$GuardianName2")).getAttribute("value");
		String guardianRelationship2=driver.findElement(By.name("Student41$GuardianRelationship2")).getAttribute("value");
		String guardianHarmony2=driver.findElement(By.name("Student41$GuardianHarmony2")).getAttribute("value");
		String guardianTel2=driver.findElement(By.name("Student41$GuardianTel2")).getAttribute("value");
		String guardianUnit2=driver.findElement(By.name("Student41$GuardianUnit2")).getAttribute("value");
		String familyAddress=driver.findElement(By.name("Student41$FamilyAddress")).getAttribute("value");
		String famillyPost=driver.findElement(By.name("Student41$FamillyPost")).getAttribute("value");
		String famillyTel=driver.findElement(By.name("Student41$FamillyTel")).getAttribute("value");
		String campus=driver.findElement(By.name("Student51$Campus")).getAttribute("value");
		String speType=driver.findElement(By.name("Student51$SpeType")).getAttribute("value");
		String inStatus=driver.findElement(By.name("Student51$InStatus")).getAttribute("value");
		String collegeNo=driver.findElement(By.name("Student51$CollegeNo")).getAttribute("value");
		String specialtyNo=driver.findElement(By.name("Student51$SpecialtyNo")).getAttribute("value");
		String grade=driver.findElement(By.name("Student51$Grade")).getAttribute("value");
		String classNo=driver.findElement(By.name("Student51$ClassNo")).getAttribute("value");
		String schoolYard=driver.findElement(By.name("Student51$SchoolYard")).getAttribute("value");
		String floorNo=driver.findElement(By.name("Student51$FloorNo")).getAttribute("value");
		String dormAddress=driver.findElement(By.name("Student51$DormAddress")).getAttribute("value");
		String ifDorm=driver.findElement(By.name("Student51$IfDorm")).getAttribute("value");
		String outSchoolAdd=driver.findElement(By.name("Student51$OutSchoolAdd")).getAttribute("value");
		String schoolMoney=driver.findElement(By.name("Student51$SchoolMoney")).getAttribute("value");
		String houseMoney=driver.findElement(By.name("Student51$HouseMoney")).getAttribute("value");
		String CETNum=driver.findElement(By.name("Student51$CETNum")).getAttribute("value");
		String NCRENum=driver.findElement(By.name("Student51$NCRENum")).getAttribute("value");
		String gridView5=driver.findElement(By.id("InitBasic1_GridView5")).getText();
		String gridView1=driver.findElement(By.id("InitBasic1_GridView1")).getText();
		String gridView3=driver.findElement(By.id("InitBasic1_GridView3")).getText();
		String gridView6=driver.findElement(By.id("InitBasic1_GridView6")).getText();
		String gridView10=driver.findElement(By.id("InitBasic1_GridView10")).getText();
		String gridView11=driver.findElement(By.id("InitBasic1_GridView11")).getText();
		String gridView4=driver.findElement(By.id("InitBasic1_GridView4")).getText();
		String gridView7=driver.findElement(By.id("InitBasic1_GridView7")).getText();
		String gridView16=driver.findElement(By.id("InitBasic1_GridView16")).getText();
		String gridView14=driver.findElement(By.id("InitBasic1_GridView14")).getText();
		String gridView2=driver.findElement(By.id("InitBasic1_GridView2")).getText();
		String otherThing=driver.findElement(By.name("Student61$OtherThing")).getText();
		String highHistory=driver.findElement(By.name("Student71$HighHistory")).getText();
		
		Ybinfo ybinfo=new Ybinfo();
		ybinfo.setSelectId(selectId);
		ybinfo.setPhoto(photo);
		ybinfo.setStudyId(studentNo);
		ybinfo.setStudentPass(studentPass);
		ybinfo.setStudentName(studentName);
		ybinfo.setNamePy(namePY);
		ybinfo.setSex(sex);
		ybinfo.setBirthDay(birthDay);
		ybinfo.setNational(national);
		ybinfo.setPolity(polity);
		ybinfo.setInTime(inTime);
		ybinfo.setNativePlace(nativePlace);
		ybinfo.setProvince(province);
		ybinfo.setCity(city);
		ybinfo.setCounty(county);
		ybinfo.setIdCard(idCard);
		ybinfo.setFamillyReg(famillyReg);
		ybinfo.setExamineeType(examineeType);
		ybinfo.setGetType1(getType1);
		ybinfo.setExamineeNo(examineeNo);
		ybinfo.setUnitSchool(unitSchool);
		ybinfo.setOneCard(oneCard);
		ybinfo.setDoctorNo(doctorNo);
		ybinfo.setBankName(bankName);
		ybinfo.setBankNo(bankNo);
		ybinfo.setBankAddress(bankAddress);
		ybinfo.setUnionpayNo(unionpayNo);
		ybinfo.setMoveTel(moveTel);
		ybinfo.setEmail(email);
		ybinfo.setQqcard(QQCard);
		ybinfo.setWxqcard(WXQCard);
		ybinfo.setFamilyFlat(familyFlat);
		ybinfo.setGuardianName(guardianName);
		ybinfo.setGuardianRelationship(guardianRelationship);
		ybinfo.setGuardianHarmony(guardianHarmony);
		ybinfo.setGuardianTel(guardianTel);
		ybinfo.setGuardianUnit(guardianUnit);
		ybinfo.setGuardianName2(guardianName2);
		ybinfo.setGuardianRelationship2(guardianRelationship2);
		ybinfo.setGuardianHarmony2(guardianHarmony2);
		ybinfo.setGuardianTel2(guardianTel2);
		ybinfo.setGuardianUnit2(guardianUnit2);
		ybinfo.setFamilyAddress(familyAddress);
		ybinfo.setFamillyPost(famillyPost);
		ybinfo.setFamillyTel(famillyTel);
		ybinfo.setCampus(campus);
		ybinfo.setSpeType(speType);
		ybinfo.setInStatus(inStatus);
		ybinfo.setCollegeNo(collegeNo);
		ybinfo.setSpecialtyNo(specialtyNo);
		ybinfo.setGrade(grade);
		ybinfo.setClassNo(classNo);
		ybinfo.setSchoolYard(schoolYard);
		ybinfo.setFloorNo(floorNo);
		ybinfo.setDormAddress(dormAddress);
		ybinfo.setIfDorm(ifDorm);
		ybinfo.setOutSchoolAdd(outSchoolAdd);
		ybinfo.setSchoolMoney(schoolMoney);
		ybinfo.setHouseMoney(houseMoney);
		ybinfo.setCetnum(CETNum);
		ybinfo.setNcrenum(NCRENum);
		ybinfo.setGridView5(gridView5);
		ybinfo.setGridView1(gridView1);
		ybinfo.setGridView3(gridView3);
		ybinfo.setGridView6(gridView6);
		ybinfo.setGridView10(gridView10);
		ybinfo.setGridView11(gridView11);
		ybinfo.setGridView4(gridView4);
		ybinfo.setGridView7(gridView7);
		ybinfo.setGridView16(gridView16);
		ybinfo.setGridView14(gridView14);
		ybinfo.setGridView2(gridView2);
		ybinfo.setOtherThing(otherThing);
		ybinfo.setHighHistory(highHistory);
		
		
//		System.out.println(ybinfo);
		ybinfoService.save(ybinfo);
		
		
		if(!studentNo.equals("")){
			return true;
		}else{
			return false;
		}
		
	}
	
	
}
