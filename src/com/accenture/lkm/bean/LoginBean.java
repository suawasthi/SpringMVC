package com.accenture.lkm.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class LoginBean {
	String userName;
	String passWored;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWored() {
		return passWored;
	}
	public void setPassWored(String passWored) {
		this.passWored = passWored;
	}

}
