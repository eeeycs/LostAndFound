package com.ycs.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class FileController {
	
	
	
//*************************************************************************************************************************************************
	/**
	 * 文件上传
	 * @param desc
	 * @param file
	 * @param session
	 * @return
	 * @throws IOException
	 */
	@ResponseBody
	@RequestMapping("testFileUpload")
	public byte[] testFileUpload(@RequestParam("desc")String desc,@RequestParam("file")MultipartFile file ,	HttpSession session) throws IOException{
		String path=session.getServletContext().getRealPath("upload\\"+new Date().getTime()+"_"+file.getOriginalFilename());
		
		OutputStream os=new FileOutputStream(path);
		InputStream is=file.getInputStream();
		
		byte[] temp=new byte[is.available()];
		is.read(temp);
		os.write(temp);

		is.close();
		os.close();
		
		return temp;
	}

//*************************************************************************************************************************************************
	/**
	 * 使用ResponseEntity<T>文件下载，不会转发到物理视图
	 * RquestEntity<T>
	 * @param session
	 * 
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("testResponseEntity")
	public ResponseEntity<byte[]> testResponseEntity(HttpSession session) throws IOException{
		InputStream is=session.getServletContext().getResourceAsStream("/files/a.html");
		byte[] body=new byte[is.available()];
		is.read(body);
		is.close();
		
		org.springframework.http.HttpHeaders headers=new org.springframework.http.HttpHeaders();
		headers.add("Content-Disposition", "attachment;filename=ycs.html");
		HttpStatus statusCode=HttpStatus.OK;
		ResponseEntity<byte[]> response=new ResponseEntity<byte[]>(body,headers, statusCode);
		
		return response;
	}

//*************************************************************************************************************************************************
	
}
