package com.ycs.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.annotation.Resource;

import org.hibernate.stat.Statistics;
import org.springframework.stereotype.Component;

import com.ycs.model.service.StudentCrawlerService;

@Component
public class MyUtil {
	@Resource
	private StudentCrawlerService crawlerService;	
	
	public static String getProperties(String name,String key) {
		Properties pro = new Properties();
		URL path=Object.class.getResource(name);
		System.out.println(path);
		
		InputStream in=null;
		String value="";
		try {
			in=new FileInputStream(new File(path.toURI()));
			pro.load(in);
			value=pro.getProperty(key).trim();
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return value;
	}
	
	
	public void showStatistics(){
		Statistics statistics=crawlerService.getSessionFactory().getStatistics();
		System.out.println(statistics);
		System.out.println("put  "+statistics.getSecondLevelCachePutCount());
		System.out.println("hit  "+statistics.getSecondLevelCacheHitCount());
		System.out.println("miss "+statistics.getSecondLevelCacheMissCount());
	}
	
	public final static String MD5(String s){
		char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		try{
			byte[] strTemp=s.getBytes();
			MessageDigest mdTemp=MessageDigest.getInstance("MD5");
			mdTemp.update(strTemp);
			byte[] md=mdTemp.digest();
			int j=md.length;
			char str[]=new char[j*2];
			int k=0;
			for(int i=0;i<j;i++){
				byte byte0=md[i];
				str[k++]=hexDigits[byte0>>>4&0xf];
				str[k++]=hexDigits[byte0&0xf];
			}
			return new String(str);
		}catch(Exception e){
			return null;
		}
	}
	
	public static String getFormatDate(String str){
		if(str==null||str.equals("")){
			str="yyyy-MM-dd HH:mm:ss";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(str);
		return sdf.format(new Date());
	}
	
	
}
