package com.ycs.model.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.stat.Statistics;
import org.springframework.stereotype.Service;

import com.ycs.model.domain.StudentInfo;
import com.ycs.model.domain.Ybinfo;
import com.ycs.model.service.BasicService;

@Service
public class StudentInfoService extends BasicService{
	
	public String[] getJiaowuPass(Integer id){
		StudentInfo studentInfo=(StudentInfo) queryById(StudentInfo.class,id);
		String[] jiaowu=new String[2];
		jiaowu[0]=studentInfo.getStudyId();
		jiaowu[1]=studentInfo.getShenfenzhenghaoma().substring(6, 14);
		return jiaowu;
	}
	public String getJiaowuPassDeafult(Integer id){
		String deafult="123456";
		if(id>=18864 && id<=29009){
			StudentInfo studentInfo=(StudentInfo) queryById(StudentInfo.class,id);
			deafult=studentInfo.getShenfenzhenghaoma().substring(12, 18);
		}
		return deafult;
	}	
	public void updateJiaowuPass(Integer id,String pass){
		StudentInfo studentInfo=(StudentInfo) queryById(StudentInfo.class,id);
		studentInfo.setPwd(pass);
		update(studentInfo);
	}

	
	public StudentInfo getYB(Integer id){
		StudentInfo studentInfo=(StudentInfo) queryById(StudentInfo.class,id);
		return studentInfo;
	}
	
	public List<StudentInfo> getYBForElse(){
		return queryExecute("from StudentInfo where pwd is not null and pwd !='123456' and ybinfo is null", null);
	}

	
	
	
	
}
