package com.ycs.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ycs.jsoup.YbinfoJsoup;
import com.ycs.selenium.YB;
import com.ycs.selenium.YBTeacher;

@Controller
public class YbinfoController {
	@Resource
	private YB yb;
	@Resource
	private YbinfoJsoup ybinfoJsoup;
	@Resource
	YBTeacher ybTeacher;
	
	@ResponseBody
	@RequestMapping("/startybTeacher/{min}")
	public String startybTeacher(@PathVariable("min")int min){
		ybTeacher.startYb(min);
		return "list";
	}

	@ResponseBody
	@RequestMapping("/startyb/{min}")
	public String startyb(@PathVariable("min")int min){
		yb.startYb(min);
		return "list";
	}
	@ResponseBody
	@RequestMapping("/startybelse")
	public String startybelse(){
		yb.startYbForElse();
		return "list";
	}

	@ResponseBody
	@RequestMapping("/test")
	public String test(int id){
		System.out.println(id);
		return "list"+id;
	}
	

	
	@ResponseBody
	@RequestMapping("/startRegister")
	public String startRegister(){
		try {
			ybinfoJsoup.getRegisterInfo();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "list";
	}
	
	
}
