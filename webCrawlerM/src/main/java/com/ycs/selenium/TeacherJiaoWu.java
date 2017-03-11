package com.ycs.selenium;

import javax.annotation.Resource;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Rollback;
import org.junit.Test;

import com.ycs.model.domain.Teacherinfo;
import com.ycs.model.service.TeacherinfoService;
import com.ycs.util.MyUtil;
import com.ycs.util.SeleniumUtil;

@Component
public class TeacherJiaoWu {
	@Resource
	protected TeacherinfoService teacherinfoService;
	protected WebDriver driver;
	protected JavascriptExecutor jse;
	
	public void start() {
		System.out.println("start");
//		driver=GetDriver.getDriver();
		driver=SeleniumUtil.getChromeDriver();
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
		startTeacher("add", 1, 31877);
	}
	
	public void startTeacher(String flag,Integer step,Integer base){
		String teacherId="";
		Integer selectId=base;
		String mm="";
		String restartPre="";

		start();		
		login();
		for(int i=0;i<90000;i=i+step ){
			try {
				//selectId变化
				if(flag.equals("add")){
					selectId=base+i;
				}
				if(flag.equals("sub")){
					selectId=base-i;
				}
				//开始获取
				enter(selectId+"");
				teacherId=getData(selectId+"");
				if(!teacherId.equals("")){
					SeleniumUtil.fileWrite("teacher.txt",selectId+","+teacherId+MyUtil.getFormatDate("-dd_HH:mm:ss")+"\tYES"+"*****************");
					System.out.println(selectId+","+teacherId+MyUtil.getFormatDate("-dd_HH:mm:ss")+"\tYES"+"*****************");
				}else{
					SeleniumUtil.fileWrite("teacher.txt",selectId+","+teacherId+MyUtil.getFormatDate("-dd_HH:mm:ss")+"\tNO"+"-----------------");
					System.out.println(selectId+","+teacherId+MyUtil.getFormatDate("-dd_HH:mm:ss")+"\tNO"+"-----------------");
				}
				//登录重复机制
				mm=MyUtil.getFormatDate("mm");
				if(mm.equals("00")||mm.equals("15")||mm.equals("30")||mm.equals("45")){
					if(!mm.equals(restartPre)){
						login();
						restartPre=mm;
					}
				}
			} catch (Exception e) {
				System.out.println("phantomjs Throw Exception，restart Right Now++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				i=i-step;
				restart();
				continue;
			}
		}
		
		
		
		
		shutdown();
	}
	
	public boolean login(){
		String url ="http://jiaowu.sicau.edu.cn/web/web/web/index.asp";
		String url2="http://jiaowu.sicau.edu.cn/jiaoshi/shizi/shizi_js/jiaoshixiang.asp?pid=";
		//登录
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("12349");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("751106");
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div[2]/fieldset/form/p[3]/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		//进入获取开始页面
		driver.findElement(By.xpath("/html/body/div/table[2]/tbody/tr/td[1]/a")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/center/table[3]/tbody/tr[2]/td[24]/a")).click();
		//判断登录是否成功
		boolean flag=false;
		try {
			flag=driver.getCurrentUrl().substring(0, 71).equals(url2);
		} catch (Exception e) {
			System.out.println("login substring exception");
			flag=false;
		}
		System.out.println("login status:"+flag);
		return flag;
	}

	public boolean enter(String selectId){
		//转换修改url
		String str1="http://jiaowu.sicau.edu.cn/jiaoshi/shizi/shizi_js/wenzhaigai.asp?pid=";
		String str2=str1+selectId;		
		//获取元素并修改url
		WebElement update=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div/a[1]"));
		jse.executeScript("document.getElementsByClassName('style4')[0].setAttribute('href',\""+ str2+ "\")");
		//修改后跳转到修改页面
		update.click();
		//判断进入是否成功
		boolean flag=false;
		try {
			flag=driver.getCurrentUrl().substring(0, 69).equals(str1);
		} catch (Exception e) {
			System.out.println("enter substring exception");
			flag=false;
		}
		System.out.println("enter status:"+flag);
		return flag;
	}
	
	public String getData(String selectId){
		String teacherId="";
		try {
			String name=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[1]/td[2]")).getText();
			teacherId=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[1]/td[4]")).getText();
			String img=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[1]/td[5]/img")).getAttribute("src");
			String xiaoqu=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[2]/td[2]")).getText();
			String bumen=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[2]/td[4]")).getText();
			String bianzhiType=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[3]/td[2]")).getText();
			String idcard=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[3]/td[4]")).getText();
			String jiguan=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[4]/td[2]")).getText();
			String minzu=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[4]/td[4]")).getText();
			String xueli=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[5]/td[2]")).getText();
			String xuewei=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[5]/td[4]")).getText();
			String zhicheng=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[6]/td[2]")).getText();
			String zhichengType=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[6]/td[4]")).getText();
			String chushengnianyue=driver.findElement(By.xpath("//*[@id=\"csrq\"]")).getAttribute("value");
			String dangzhengzhiwu=driver.findElement(By.xpath("//*[@id=\"zw\"]")).getAttribute("value");
			String renkedanwei=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[8]/td[2]/select")).getAttribute("value");
			String suoshuxishi=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[8]/td[4]/select")).getAttribute("value");
			String biyexuexiao=driver.findElement(By.xpath("//*[@id=\"byyx\"]")).getAttribute("value");
			String biyezhuanye=driver.findElement(By.xpath("//*[@id=\"byzy\"]")).getAttribute("value");
			String biyeDate=driver.findElement(By.xpath("//*[@id=\"bysj\"]")).getAttribute("value");
			String laixiaoDate=driver.findElement(By.xpath("//*[@id=\"gzsj\"]")).getAttribute("value");
			String bangongPhone=driver.findElement(By.xpath("//*[@id=\"bgsdh\"]")).getAttribute("value");
			String yidongPhone=driver.findElement(By.xpath("//*[@id=\"yddh\"]")).getAttribute("value");
			String yidongPhonePublic=driver.findElement(By.cssSelector("[name='radiobutton1'][checked]")).getAttribute("value");
			String bangongAddress=driver.findElement(By.xpath("//*[@id=\"bgdz\"]")).getAttribute("value");
			String qqNumber=driver.findElement(By.xpath("//*[@id=\"qqhm\"]")).getAttribute("value");
			String qqNumberPublic=driver.findElement(By.cssSelector("[name='radiobutton2'][checked]")).getAttribute("value");
			String zhuanzhiTeacher=driver.findElement(By.cssSelector("[name='radiobutton3'][checked]")).getAttribute("value");
			String shifouzaixiao=driver.findElement(By.cssSelector("[name='radiobutton4'][checked]")).getAttribute("value");
			String shangke=driver.findElement(By.name("checkbox1")).getAttribute("checked");
			String daoshi=driver.findElement(By.name("checkbox2")).getAttribute("checked");
			String shiyan=driver.findElement(By.name("checkbox3")).getAttribute("checked");
			String jiankao=driver.findElement(By.name("checkbox4")).getAttribute("checked");
			String email=driver.findElement(By.xpath("//*[@id=\"dzyj\"]")).getAttribute("value");
			String mainkecheng=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[16]/td[2]/textarea")).getText();
			String yanjiufangxiang=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[17]/td[2]/textarea")).getText();
			String mainAchievementAward=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[18]/td[2]/textarea")).getText();
			String teacherjiyu=driver.findElement(By.xpath("//*[@id=\"jsjy\"]")).getAttribute("value");
			String status=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/center/table/tbody/tr[20]/td/div")).getText();

			Teacherinfo teacherinfo=new Teacherinfo();
			teacherinfo.setSelectId(selectId);
			teacherinfo.setName(name);
			teacherinfo.setTeacherId(teacherId);
			teacherinfo.setImg(img);
			teacherinfo.setXiaoqu(xiaoqu);
			teacherinfo.setBumen(bumen);
			teacherinfo.setBianzhiType(bianzhiType);
			teacherinfo.setIdcard(idcard);
			teacherinfo.setJiguan(jiguan);
			teacherinfo.setMinzu(minzu);
			teacherinfo.setXueli(xueli);
			teacherinfo.setXuewei(xuewei);
			teacherinfo.setZhicheng(zhicheng);
			teacherinfo.setZhichengType(zhichengType);
			teacherinfo.setChushengnianyue(chushengnianyue);
			teacherinfo.setDangzhengzhiwu(dangzhengzhiwu);
			teacherinfo.setRenkedanwei(renkedanwei);
			teacherinfo.setSuoshuxishi(suoshuxishi);
			teacherinfo.setBiyexuexiao(biyexuexiao);
			teacherinfo.setBiyezhuanye(biyezhuanye);
			teacherinfo.setBiyeDate(biyeDate);
			teacherinfo.setLaixiaoDate(laixiaoDate);
			teacherinfo.setBangongPhone(bangongPhone);
			teacherinfo.setYidongPhone(yidongPhone);
			teacherinfo.setYidongPhonePublic(yidongPhonePublic);
			teacherinfo.setBangongAddress(bangongAddress);
			teacherinfo.setQqNumber(qqNumber);
			teacherinfo.setQqNumberPublic(qqNumberPublic);
			teacherinfo.setZhuanzhiTeacher(zhuanzhiTeacher);
			teacherinfo.setShifouzaixiao(shifouzaixiao);
			teacherinfo.setShangke(shangke);
			teacherinfo.setDaoshi(daoshi);
			teacherinfo.setShiyan(shiyan);
			teacherinfo.setJiankao(jiankao);
			teacherinfo.setEmail(email);
			teacherinfo.setMainkecheng(mainkecheng);
			teacherinfo.setYanjiufangxiang(yanjiufangxiang);
			teacherinfo.setMainAchievementAward(mainAchievementAward);
			teacherinfo.setTeacherjiyu(teacherjiyu);
			teacherinfo.setStatus(status);

//			System.out.println(teacherinfo);
			teacherinfoService.save(teacherinfo);
		
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
