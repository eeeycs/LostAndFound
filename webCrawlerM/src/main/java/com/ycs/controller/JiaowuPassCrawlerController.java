package com.ycs.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycs.selenium.JiaoWu;
import com.ycs.selenium.JiaoWuAllPass;
import com.ycs.selenium.JiaoWuPass;
import com.ycs.selenium.JiaoWuSearcher;
import com.ycs.selenium.TeacherJiaoWuPass;


@Controller
public class JiaowuPassCrawlerController {
	@Resource
	private JiaoWu jiaoWu;
	@Resource
	private JiaoWuSearcher jiaoWuSearcher;
	@Resource
	private JiaoWuPass jiaoWuPass;
	@Resource
	private JiaoWuAllPass jiaoWuAllPass;
	@Resource
	private TeacherJiaoWuPass teacherJiaoWuPass;
	
	@ResponseBody
	@RequestMapping("/startPass1/{start}")
	public String startPass1(@PathVariable("start")int start){
		jiaoWuPass.startPass(start,"1");
		return "";
	}
	@ResponseBody
	@RequestMapping("/startAllPass/{operate}/{type}/{studyId}/{year}/{count}")
	public String startAllPass(
			@PathVariable("operate")String operate,
			@PathVariable("type")String type,
			@PathVariable("studyId")String studyId,
			@PathVariable("year")int year,
			@PathVariable("count")int count){
		jiaoWuAllPass.startPass(operate,type,studyId,year,count);
		return "";
	}
	
	@ResponseBody
	@RequestMapping("/startTeacherPass/{start}")
	public String startTeacherPass(@PathVariable("start")int start){
		teacherJiaoWuPass.startPass(start);
		return "";
	}
	
}