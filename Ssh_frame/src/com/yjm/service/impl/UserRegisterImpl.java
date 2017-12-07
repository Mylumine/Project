package com.yjm.service.impl;

import com.yjm.dao.Dao;
import com.yjm.entity.Users;
import com.yjm.service.UserRegister;

public class UserRegisterImpl implements UserRegister {
	private Dao dao;
	
	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void register(Users user) {
		// TODO Auto-generated method stub
		dao.saveOrUpdate(user);
	}

	
}
