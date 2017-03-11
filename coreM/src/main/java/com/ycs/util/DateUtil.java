package com.ycs.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;


@Component
public class DateUtil {
	// 将字符串转换成date类型方法
	//MyUtil.parseDate("2016-05-22")
	public static Date string2Date(String s) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.parse(s);
	}

}
