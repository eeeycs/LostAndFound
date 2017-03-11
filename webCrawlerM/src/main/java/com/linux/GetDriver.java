package com.linux;

import org.openqa.selenium.WebDriver;

import com.ycs.util.SeleniumUtil;

public class GetDriver {
	public static WebDriver getDriver(){
		return SeleniumUtil.getPhantomJSDriver();
	}
}
