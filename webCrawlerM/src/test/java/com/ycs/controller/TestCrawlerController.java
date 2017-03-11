package com.ycs.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;


public class TestCrawlerController extends BasiceTestController{
	
//	@Rollback(false)
	@Test
	public void testJiaowuPass() throws Exception{
		MvcResult mvcResult = mockMvc.perform(post("/startybTeacher/1")
//					.param("id", "11")
//					.param("where", "sex ='女'")
				)
				.andDo(print())
				.andReturn();			
		
		
	}

//	@Rollback(false)
//	@Test
	public void testTime() throws Exception{
		MvcResult mvcResult = mockMvc.perform(post("/time")
//					.param("id", "11")
//					.param("where", "sex ='女'")
				)
				.andDo(print())
				.andReturn();			
		
		
	}
//	@Rollback(false)
//	@Test
	public void testJiaoWu() throws Exception{
			MvcResult mvcResult = mockMvc.perform(post("/startSearcher/sub/1/3158451")
//					.param("id", "11")
//					.param("where", "sex ='女'")
					)
					.andDo(print())
					.andReturn();			
			
			
	}

	
	
}
