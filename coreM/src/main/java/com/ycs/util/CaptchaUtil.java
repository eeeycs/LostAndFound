package com.ycs.util;
import com.octo.captcha.service.image.ImageCaptchaService;
import com.octo.captcha.service.image.DefaultManageableImageCaptchaService;
 
public class CaptchaUtil {
    private static ImageCaptchaService instance=new DefaultManageableImageCaptchaService();
    public static ImageCaptchaService getInstance(){
        return instance;
    }
    
}