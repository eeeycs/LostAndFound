
package com.ycs.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class SeleniumUtil {
	
	public static WebDriver getFireFox() {
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		System.out.println("linuxFireFox");
		return driver;
	}
	
	public static WebDriver getPhantomJSDriverLinux() {
		System.setProperty("phantomjs.binary.path","/usr/local/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");
		WebDriver driver = new PhantomJSDriver();
		System.out.println("linux");
    	return driver;
    }
	public static WebDriver getPhantomJSDriver() {
		System.setProperty("phantomjs.binary.path","J:\\crawler\\soft\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();
		System.out.println("windows");
    	return driver;
    }
	public static WebDriver getChromeDriver() {
		 System.setProperty("webdriver.chrome.driver","J:\\crawler\\soft\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		return driver;
	}
	public static HtmlUnitDriver getHtmlUnitDriver() {
		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
		driver.setJavascriptEnabled(true);
		return driver;
	}

	public static  void printScrenn(TakesScreenshot drivername, String filename) {
		File scrFile = drivername.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("/tmp/crawler/img/" + filename));
			System.out.println("save img:" + filename);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("save img finished");
		}
	}
	
	
	public static  void fileWriteOne(String content){
		File file = new File("/tmp/crawler/file/memo.txt");
		FileWriter fw = null;
		BufferedWriter writer = null;
		try {
			fw = new FileWriter(file,false);
			writer = new BufferedWriter(fw);
			writer.write(content);
			writer.newLine();
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				fw.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
    public static  void fileWrite(String name,String content){
        File file = new File("/tmp/crawler/file/"+name);
        FileWriter fw = null;
        BufferedWriter writer = null;
        try {
            fw = new FileWriter(file,true);
            writer = new BufferedWriter(fw);
            writer.write(content);
            writer.newLine();
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
            	fw.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    public static  void fileWriteHtml(String name,String content){
    	File file = new File("/tmp/crawler/html/"+name);
    	FileWriter fw = null;
    	BufferedWriter writer = null;
    	try {
    		fw = new FileWriter(file,true);
    		writer = new BufferedWriter(fw);
    		writer.write(content);
    		writer.newLine();
    		writer.flush();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}finally{
    		try {
    			fw.close();
    			writer.close();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    }
	
	public static boolean haveFileHtml(String fileName){
		File file = new File("D:\\tmp\\crawler\\html\\"+fileName);
		if(file.exists()){
			System.out.println("存在文件："+fileName);
			return true;
		}
		System.out.println("不存在文件："+fileName);
		return false;
	}
	public static void delFileHtml(String fileName){
		File file = new File("D:\\tmp\\crawler\\html\\"+fileName);
		if(file.exists()){
			file.delete();
			System.out.println("删除文件："+fileName);
		}
	}
    

	public static void jQueryInject(JavascriptExecutor jse) {
		jse.executeScript(" var headID =document.getElementsByTagName(\"head\")[0];"
				+ "var newScript = document.createElement('script');"
				+ "newScript.type = 'text/javascript';"
				+ "newScript.src ='http://lib.sinaapp.com/js/jquery/1.9.1/jquery-1.9.1.min.js';"
				+ "headID.appendChild(newScript);");
	}
	public static Boolean jQueryExist(JavascriptExecutor jse) {
		Boolean loaded;
		try {
			loaded = (Boolean) jse.executeScript("return jQuery()!=null");
		} catch (WebDriverException e) {
			loaded = false;
		}
		return loaded;
	}
	
	public static void jQueryInjectIfNeed(JavascriptExecutor jse){
		if(!jQueryExist(jse)){
			jQueryInject(jse);
		}
	}
	
	
    
}
