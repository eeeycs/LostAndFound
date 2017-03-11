package com.ycs.model.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.stat.Statistics;
import org.springframework.stereotype.Service;

import com.ycs.model.domain.StudentInfo;
import com.ycs.model.domain.Teacherinfo;
import com.ycs.model.domain.Ybinfo;
import com.ycs.model.service.BasicService;

@Service
public class TeacherinfoService extends BasicService{
	public String[] getPass(Integer id){
		Teacherinfo teacherinfo=(Teacherinfo) queryById(Teacherinfo.class, id);		
		String[] pass=new String[2];
		pass[0]=teacherinfo.getTeacherId();
		pass[1]=teacherinfo.getIdcard();
		return pass;
	}
		
	public void updatePass(Integer id,String pass){
		Teacherinfo teacherinfo=(Teacherinfo) queryById(Teacherinfo.class,id);
		teacherinfo.setPwd(pass);
		update(teacherinfo);
	}


}
