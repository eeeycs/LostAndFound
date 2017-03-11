package com.ycs.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycs.selenium.JiaoWu;
import com.ycs.selenium.JiaoWuPass;
import com.ycs.selenium.JiaoWuSearcher;
import com.ycs.selenium.TeacherJiaoWu;
import com.ycs.util.MyUtil;
import com.ycs.util.SeleniumUtil;


@Controller
public class StudentCrawlerController {
	@Resource
	private JiaoWu jiaoWu;
	@Resource
	private JiaoWuSearcher jiaoWuSearcher;
	@Resource
	private JiaoWuPass jiaoWuPass;
	@Resource
	private TeacherJiaoWu teacherJiaoWu;
	
	
	@ResponseBody
	@RequestMapping("/startTeacher/{flag}/{step}/{base}")
	public String startTeacher(@PathVariable("flag")String flag,@PathVariable("step")Integer step,@PathVariable("base")Integer base){
		teacherJiaoWu.startTeacher(flag, step, base);
		return "list";
	}

	@ResponseBody
	@RequestMapping("/start/{flag}/{step}/{base}")
	public String list(@PathVariable("flag")String flag,@PathVariable("step")Integer step,@PathVariable("base")Integer base){
		jiaoWu.startJiaowu(flag, step, base);
		return "list";
	}
	
	@ResponseBody
	@RequestMapping("/startSearcher/{flag}/{step}/{base}")
	public String listSearcher(@PathVariable("flag")String flag,@PathVariable("step")Integer step,@PathVariable("base")Integer base){
		jiaoWuSearcher.startJiaowu(flag, step, base);
		return "list";
	}
	
	@ResponseBody
	@RequestMapping("/time")
	public String time(){
		while(true){
			SeleniumUtil.fileWrite("time.txt",MyUtil.getFormatDate(null));
			try {
				Thread.sleep(10*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}