package com.accenture.lkm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.lkm.bean.LoginBean;
import com.accenture.lkm.service.LoginService;

@Controller
public class BackEndController {

	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/loadLogin.html", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("loginBean", new LoginBean());
		mv.setViewName("login");
		return mv;
	}

	@RequestMapping(value = "/validation.html", method = RequestMethod.POST)
	public ModelAndView requestHandler(@ModelAttribute("loginBean") LoginBean lb) {
		if (loginService.validateLogin(lb).equals("Success")) {
			return new ModelAndView("sucess");
		} else {
			return new ModelAndView("failure");
		}

	}
	/*
	 * s
	 * 
	 * @RequestMapping(value="/") public ModelAndView requestHandler1() {
	 * ModelAndView mv = new ModelAndView();
	 * System.out.println("Inside the controller"); mv.setViewName("login.jsp");
	 * return mv; }
	 */

}
