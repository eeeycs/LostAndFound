package com.ycs.model.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.stat.Statistics;
import org.springframework.stereotype.Service;

import com.ycs.model.domain.StudentInfo;
import com.ycs.model.domain.Ybinfo;
import com.ycs.model.service.BasicService;

@Service
public class YbinfoService extends BasicService{
	public List<Ybinfo> getRegisterInfo(int pageNow){
		return queryByPageWhere("Ybinfo", pageNow, 1000, "registerInfo is not null and registerInfo like '%学生登记信息%'");
	}
	
}
