package com.yjm.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface Dao {
	Serializable save(Object entity);
	void update(Object entity);
	void delete(Object entity);
	void saveOrUpdate(Object entity);
	Object get(Class clazz,Serializable id);
	List list(String hql,Object bean);
	List list(String hql,Map params);
	List list(Object bean);
	List list(String hql,Object bean,int pageIndex,int pageSize);
	List list(String hql,Map params,int pageIndex,int pageSize);
	List list(Object bean,int pageIndex,int pageSize);
}
