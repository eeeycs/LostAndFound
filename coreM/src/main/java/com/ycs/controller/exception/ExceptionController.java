package com.ycs.controller.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice//访问@Controller的异常
public class ExceptionController {
	
	@ExceptionHandler({RuntimeException.class})
	public ModelAndView runtimeException(Exception exception){
		System.out.println(">>>RuntimeException异常："+exception);
		ModelAndView mv=new ModelAndView("error");
		mv.addObject("exception", exception);
		return mv;
	}
	
	@ExceptionHandler
	public ModelAndView exception(Exception exception){
		System.out.println(">>>异常："+exception);
		ModelAndView mv=new ModelAndView("error");
		mv.addObject("exception", exception);
		return mv;
	}
	
}
