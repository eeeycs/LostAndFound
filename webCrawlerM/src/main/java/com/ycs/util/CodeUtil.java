package com.ycs.util;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;

public class CodeUtil {

	public static String getCode(WebDriver driver, WebElement webElement,String imageName) {
		String str = "";
		try {
			delFile(imageName+".png");
			delFile(imageName+".txt");
			
			createElementImage(driver, webElement, imageName);
			int countCreatElementImage=0;
			while(!haveFile(imageName+".png")){
				countCreatElementImage++;
				if(countCreatElementImage>10) break;
				System.out.println("countCreatElementImage@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+countCreatElementImage*100);
				Thread.sleep(countCreatElementImage*100);
				createElementImage(driver, webElement, imageName);
			}
			
			convertCodeToText(imageName);
			int countConvertCodeToText=0;
			while(!haveFile(imageName+".txt")){
				countConvertCodeToText++;
				if(countConvertCodeToText>15) break;
				System.out.println("countConvertCodeToText@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+countConvertCodeToText*100);
				Thread.sleep(countConvertCodeToText*100);
				if(countConvertCodeToText==9||countConvertCodeToText==12){
					convertCodeToText(imageName);
				}
			}
			
			str= getCodeText(imageName);
			int countGetCodeText=0;
			while(str.equals("")){
				countGetCodeText++;
				if(countGetCodeText>10) break;
				System.out.println("countGetCodeText@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+countGetCodeText*100);
				Thread.sleep(countGetCodeText*100);
				str= getCodeText(imageName);
				System.out.println("重新获取文本验证码");
			}
		} catch (Exception e) {
			System.out.println("验证码获取失败");
		}
		return str;
	}
	
	public static boolean haveFile(String fileName){
		File file = new File("D:\\tmp\\crawler\\img\\"+fileName);
		if(file.exists()){
			System.out.println("存在文件："+fileName);
			return true;
		}
		System.out.println("不存在文件："+fileName);
		return false;
	}
	public static void delFile(String fileName){
		File file = new File("D:\\tmp\\crawler\\img\\"+fileName);
		if(file.exists()){
			file.delete();
			System.out.println("删除文件："+fileName);
		}
	}
	public static boolean createElementImage(WebDriver driver,WebElement webElement, String imageName) throws IOException {
		Point location = webElement.getLocation();
		Dimension size = webElement.getSize();
		// 转换driver
		WebDriver augmentDriver = new Augmenter().augment(driver);
		byte[] byteDriver = ((TakesScreenshot) augmentDriver).getScreenshotAs(OutputType.BYTES);
		// 生成图片
		BufferedImage fullImage = ImageIO.read(new ByteArrayInputStream(byteDriver));
		BufferedImage cutImage = fullImage.getSubimage(location.getX(),location.getY(), size.getWidth(), size.getHeight());
		boolean bool = ImageIO.write(cutImage, "png", new File("/tmp/crawler/img/" + imageName + ".png"));
		System.out.println("生成验证码图片");
		return bool;
	}

	public static void convertCodeToText(String imageName) throws IOException {
		String str = "D:\\Program Files (x86)\\Tesseract-OCR\\tesseract.exe D:\\tmp\\crawler\\img\\"+ imageName + ".png D:\\tmp\\crawler\\img\\" + imageName;
		Runtime.getRuntime().exec(str);
		System.out.println("生成验证码文本");
	}

	public static String getCodeText(String textName) throws IOException, InterruptedException {
		File file = new File("D:\\tmp\\crawler\\img\\" + textName + ".txt");
		int countGetCodeText=0;
		while(!file.exists()){
			countGetCodeText++;
			if(countGetCodeText>10) break;
			System.out.println("countGetCodeText@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+countGetCodeText*100);
			Thread.sleep(countGetCodeText*100);
			file = new File("D:\\tmp\\crawler\\img\\" + textName + ".txt");
			System.out.println("等待图片验证码生成文本");
		}
		InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");
		BufferedReader bufferedReader = new BufferedReader(read);

		String str = bufferedReader.readLine();
		Pattern pattern = Pattern.compile("[^0-9]");
		Matcher matcher = pattern.matcher(str);
		String str2 ="";
		str2=matcher.replaceAll("");
		
		read.close();
		bufferedReader.close();
		System.out.println("获取验证码文本");
		return str2;
	}

}