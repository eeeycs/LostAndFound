package com.ycs.controller.filter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;



public class LoginFilter implements HandlerInterceptor {
	
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		
	}

	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,Object arg2) throws Exception {
		String userLogin=(String) arg0.getSession().getAttribute("userLogin");
		if(userLogin.equals("")||userLogin.equals(null)){
			return false;
		}
		return true;
	}

	
}
