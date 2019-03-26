package com.accenture.lkm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.lkm.bean.LoginBean;
import com.accenture.lkm.dao.LoginDAO;

@Service
public class LoginService {
	
	@Autowired
	LoginDAO loginDao;
	
	public String validateLogin(LoginBean lb) {
		System.out.println("Inside the service class");
		return loginDao.validateLogin(lb);
	}
	
	
	
	

}
