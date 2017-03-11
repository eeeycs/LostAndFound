package com.ycs.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ycs.model.service.StudentInfoService;
import com.ycs.util.MyUtil;

//@SessionAttributes(value="user")//从request域中查找
@Controller
public class StudentInfoController {
	@Resource
	private StudentInfoService studentInfoService;
	@Resource
	private MyUtil myUtil;
	
	@RequestMapping("/list/{pageNow}")
	public String list(Map<String, Object>map,@PathVariable("pageNow")Integer pageNow,@RequestParam(value="where",required=false)String where){
		int pageSize = 50;
		
		myUtil.showStatistics();
		return "list";
	}
	
}
