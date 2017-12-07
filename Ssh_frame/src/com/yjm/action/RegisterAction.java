package com.yjm.action;

import com.opensymphony.xwork2.ActionSupport;
import com.yjm.entity.Users;
import com.yjm.service.UserRegister;

public class RegisterAction extends ActionSupport{
	private UserRegister ur;
	private Users user;
	
	public UserRegister getUr() {
		return ur;
	}

	public void setUr(UserRegister ur) {
		this.ur = ur;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String register(){
		ur.register(user);
		return SUCCESS;
	}
}
