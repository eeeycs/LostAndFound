package com.ycs.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import com.ycs.model.domain.Studentcrawler;

@Component
public class JiaoWuSearcher extends JiaoWu{
	@Override
	public String getData(String selectId) {
		WebElement webElement = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/center/table[3]/tbody/tr[2]/td[2]/a"));
		jse.executeScript("document.getElementsByClassName('g_body')[1].setAttribute('href',\""+ convertStr(selectId) + "\")");
		webElement.click();
		System.out.print(selectId+"\t");
//		SeleniumUtil.printScrenn((TakesScreenshot) driver, selectId+".png");
		try {
			Studentcrawler studentcrawler=new Studentcrawler();
			studentcrawler.setSelectId(selectId);
			studentcrawler.setExamId(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[1]/td[2]")).getText());
			String studyId = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[2]/td[2]")).getText();
			studentcrawler.setStudyId(studyId);
			studentcrawler.setImg("http://jiaowu.sicau.edu.cn/photo/"+studyId+".jpg");
			
			studentcrawler.setName(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[3]/td[2]")).getText());
			studentcrawler.setSex(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[4]/td[2]")).getText());
			studentcrawler.setXibie(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[5]/td[2]")).getText());
			studentcrawler.setZhuanye(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[6]/td[2]")).getText());
			studentcrawler.setXuezi(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[7]/td[2]")).getText());
			studentcrawler.setPeiyangcengci(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[8]/td[2]")).getText());
			studentcrawler.setNianji(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[9]/td[2]")).getText());
			studentcrawler.setBanji(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[10]/td[2]")).getText());
			studentcrawler.setXinzhuanye(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[11]/td[2]")).getText());
			studentcrawler.setXinbanji(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[12]/td[2]")).getText());
			studentcrawler.setXuejizhuangtai(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[13]/td[2]")).getText());
			studentcrawler.setRuxueriqi(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[14]/td[2]")).getText());
			studentcrawler.setShenfenzhenghaoma(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[15]/td[2]")).getText());
			studentcrawler.setChushengnianyueri(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[16]/td[2]")).getText());
			studentcrawler.setMinzu(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[17]/td[2]")).getText());
			studentcrawler.setZhengzhimianmao(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[18]/td[2]")).getText());
			studentcrawler.setAddress(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[19]/td[2]")).getText());
			studentcrawler.setHuochezhandian(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[20]/td[2]")).getText());
			studentcrawler.setFumuxingming(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[21]/td[2]")).getText());
			studentcrawler.setGerendianhua(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[22]/td[2]/input")).getAttribute("value"));
			studentcrawler.setJiatingdianhua(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[23]/td[2]/input")).getAttribute("value"));
			studentcrawler.setTechang(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[24]/td[2]/input")).getAttribute("value"));
			studentcrawler.setShifoubenrenzhaopian(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[25]/td[2]")).getText());
			studentcrawler.setSuodingxinxi(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[26]/td[2]")).getText());
			
			
			System.out.println(studyId);
			System.out.println(studentcrawler);
			
			driver.navigate().back();
			return studyId;
		} catch (Exception e) {
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
		driver.navigate().back();
		return "null";
	}
}
