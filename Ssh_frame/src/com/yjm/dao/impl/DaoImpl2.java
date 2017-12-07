package com.yjm.dao.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.yjm.dao.Dao;

public class DaoImpl2 implements Dao {
	private HibernateTemplate temp;
	
	public DaoImpl2(SessionFactory sessionFactory){
		this.temp = new HibernateTemplate(sessionFactory);
	}
	@Override
	public Serializable save(Object entity) {
		// TODO Auto-generated method stub
		return temp.save(entity);
	}

	@Override
	public void update(Object entity) {
		// TODO Auto-generated method stub
		temp.update(entity);
	}

	@Override
	public void delete(Object entity) {
		// TODO Auto-generated method stub
		temp.delete(entity);
	}

	@Override
	public void saveOrUpdate(Object entity) {
		// TODO Auto-generated method stub
		temp.saveOrUpdate(entity);
	}

	@Override
	public Object get(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return temp.get(clazz, id);
	}

	@Override
	public List list(String hql, Object bean) {
		// TODO Auto-generated method stub
		return temp.findByValueBean(hql, bean);
	}

	@Override
	public List list(String hql, Map params) {
		// TODO Auto-generated method stub
		return temp.find(hql, params);
	}

	@Override
	public List list(Object bean) {
		// TODO Auto-generated method stub
		return temp.findByExample(bean);
	}

	@Override
	public List list(final String hql, final Object bean, final int pageIndex, final int pageSize) {
		// TODO Auto-generated method stub
		return temp.execute(new HibernateCallback<List>() {
			@Override
			public List doInHibernate(Session session) throws HibernateException,
					SQLException {
				// TODO Auto-generated method stub
				Query query = session.createQuery(hql);
				query.setProperties(bean);
				query.setFirstResult((pageIndex-1)*pageSize);
				query.setMaxResults(pageSize);
				return query.list();
			}
		});
	}

	@Override
	public List list(final String hql, final Map params, final int pageIndex, final int pageSize) {
		// TODO Auto-generated method stub
		return temp.execute(new HibernateCallback<List>() {
			@Override
			public List doInHibernate(Session session) throws HibernateException,
					SQLException {
				// TODO Auto-generated method stub
				Query query = session.createQuery(hql);
				query.setProperties(params);
				query.setFirstResult((pageIndex-1)*pageSize);
				query.setMaxResults(pageSize);
				return query.list();
			}
		});
	}

	@Override
	public List list(Object bean, int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return temp.findByExample(bean, (pageIndex-1)*pageSize, pageSize);
	}

}
