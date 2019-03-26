package com.accenture.lkm.dao;

import org.springframework.stereotype.Repository;

import com.accenture.lkm.bean.LoginBean;

@Repository
public class LoginDAO {

	public String validateLogin(LoginBean lb) {
		System.out.println("Inside the DAO");
		if (lb.getUserName().equals("acn") && lb.getPassWored().equals("suraj")) {
			return "Success";
		}

		return "failure";
	}

}
