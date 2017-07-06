package com.webapp.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.app.service.UserService;
import com.webapp.app.vo.User;
import com.webapp.framework.base.controller.BaseController;
import com.webapp.framework.core.beans.HttpStackManager;

@Controller
@RequestMapping("/user/*")
public class UserController extends BaseController{
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("getUser")
	public String getUser(){
		
		String userId = this.getParameter("userId");
		
		User user = userService.selectByPK(Integer.valueOf(userId));
		
		
		this.setBean("user", user);
		
		
		return "user/showUser";
	}
	
	
	
	
	
	
	

}









