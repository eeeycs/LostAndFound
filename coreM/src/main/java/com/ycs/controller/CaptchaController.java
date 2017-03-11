package com.ycs.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.octo.captcha.service.CaptchaServiceException;
import com.ycs.util.CaptchaUtil;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.awt.image.BufferedImage;

@Controller
@RequestMapping("/captcha")
public class CaptchaController {

	@ResponseBody
	@RequestMapping("/image")
	public void captchaImage(HttpServletRequest request,HttpServletResponse response) throws Exception {
		response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
		
        BufferedImage bufferedImage = CaptchaUtil.getInstance().getImageChallengeForID(request.getSession().getId());
		ServletOutputStream out=response.getOutputStream();
		ImageIO.write(bufferedImage, "jpg", out);
		out.flush();
		out.close();
		return;
	}

	@ResponseBody
	@RequestMapping("/validate")
	public Boolean validate(HttpServletRequest request,String captcha) {
		Boolean isCaptchaCorrect =false;
		try {
			//仅可验证一次
			isCaptchaCorrect=CaptchaUtil.getInstance().validateResponseForID(request.getSession().getId(), captcha);
		} catch (CaptchaServiceException e) {
			System.out.println("CaptchaServiceException");
		}
		return isCaptchaCorrect;
	}
	
}