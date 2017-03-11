package com.ycs.model.service;

import java.util.List;

import com.ycs.model.dao.BasicDao;

/**
 * 与session无关,调用Dao,公用service写在此
 * 
 * @author asusask
 * 
 */
public class BasicService extends BasicDao {

	// ****************************************************************************************************************************************

	public Object queryByStudyId(String domain, String studyId) {
		String hql = "from " + domain + " where studyId=?";
		Object[] parameters = { studyId };
		return queryUniqueLast(hql, parameters);
	}
	// ****************************************************************************************************************************************
	public Object queryUniqueFirst(String hql, Object[] parameters) {
		List list = queryExecute(hql, parameters);
		int size=list.size();
		if(size>0){
			return list.get(0);
		}
		return null;
	}

	public Object queryUniqueLast(String hql, Object[] parameters) {
		List list = queryExecute(hql, parameters);
		int size=list.size();
		if(size>0){
			return list.get(size-1);
		}
		return null;
	}

	// ****************************************************************************************************************************************

	public List queryByPageWhere(String domain, int pageNow, int pageSize,
			String where) {
		String hql;
		if (where == null || where.equals("")) {
			hql = "from " + domain + " order by id";
		} else {
			hql = "from " + domain + " where(" + where + ") order by id";
		}
		return queryByPage(hql, null, pageNow, pageSize);
	}

	public int getRowCountWhere(String domain, String where) {
		String hql;
		if (where == null || where.equals("")) {
			hql = "select count(*) from " + domain;
		} else {
			hql = "select count(*) from " + domain + " where(" + where + ")";
		}
		Object obj = queryUnique(hql, null);
		return Integer.parseInt(obj.toString());
	}

	public int getPageCountWhere(String domain, int pageSize, String where) {
		int rowCount = getRowCountWhere(domain, where);
		return (rowCount - 1) / pageSize + 1;
	}
	// ****************************************************************************************************************************************

}
