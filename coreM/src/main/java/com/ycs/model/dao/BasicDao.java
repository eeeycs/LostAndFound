package com.ycs.model.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
/**
 * 与session相关的持久方法写在Dao
 * @author asusask
 *
 */
//extends HibernateDaoSupport
@Transactional
public class BasicDao {
	@Resource
	protected SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

//****************************************************************************************************************************************
	public List queryExecute(String hql, Object[] parameters) {
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		if(parameters!=null&&parameters.length>0){
			for(int i=0;i<parameters.length;i++){
				query.setParameter(i, parameters[i]);
			}	
		}
		return query.list();
	}	
	public Object queryUnique(String hql, Object[] parameters) {
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		if(parameters!=null&&parameters.length>0){
			for(int i=0;i<parameters.length;i++){
				query.setParameter(i, parameters[i]);
			}
		}
		return query.uniqueResult();
	}
	public List queryByPage(String hql, Object[] parameters,int pageNow, int pageSize) {
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		if(parameters!=null&&parameters.length>0){
			for(int i=0;i<parameters.length;i++){
				query.setParameter(i, parameters[i]);
			}	
		}
		query.setFirstResult((pageNow-1)*pageSize).setMaxResults(pageSize);
		return query.list();
	}
	public Object queryById(Class clazz, Serializable id) {
		return sessionFactory.getCurrentSession().get(clazz, id);
	}

//****************************************************************************************************************************************

	public void update(Object domain) {
		sessionFactory.getCurrentSession().update(domain);
	}
	public void updateExecute(String hql, Object[] parameters) {
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		if(parameters!=null&&parameters.length>0){
			for(int i=0;i<parameters.length;i++){
				query.setParameter(i, parameters[i]);
			}	
		}
		query.executeUpdate();
	}
//****************************************************************************************************************************************

	public void save(Object domain) {
		sessionFactory.getCurrentSession().save(domain);
	}
	
//****************************************************************************************************************************************
	
	public void deleteById(Class clazz,Serializable id) {
		sessionFactory.getCurrentSession().delete(queryById(clazz, id));
	}
//****************************************************************************************************************************************


}
