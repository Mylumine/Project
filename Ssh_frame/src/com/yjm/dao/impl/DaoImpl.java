package com.yjm.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yjm.dao.Dao;

public class DaoImpl extends HibernateDaoSupport implements Dao {

	@Override
	public Serializable save(Object entity) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().save(entity);
	}

	@Override
	public void update(Object entity) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(entity);
	}

	@Override
	public void delete(Object entity) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(entity);
	}

	@Override
	public void saveOrUpdate(Object entity) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().saveOrUpdate(entity);
	}

	@Override
	public Object get(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(clazz, id);
	}

	@Override
	public List list(String hql, Object bean) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().findByValueBean(hql, bean);
	}

	@Override
	public List list(String hql, Map params) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find(hql, params);
	}

	@Override
	public List list(Object bean) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().findByExample(bean);
	}

	@Override
	public List list(String hql, Object bean, int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List list(String hql, Map params, int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List list(Object bean, int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().findByExample(bean, (pageIndex-1)*pageSize, pageSize);
	}
	
}
