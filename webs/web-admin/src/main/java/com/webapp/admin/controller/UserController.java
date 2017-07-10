package com.webapp.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.webapp.app.model.User;
import com.webapp.app.service.UserService;
import com.webapp.app.vo.UserVo;
import com.webapp.framework.base.controller.BaseController;

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
	
	@RequestMapping("getUserPage")
	public String getUserPage(){
		
		UserVo userVo = this.getForm(UserVo.class);
		
		PageInfo<User> userPage = this.userService.getUserByPage(userVo);
		
		this.setBean("userPage", userPage);
		
		
		return "user/showUserPage";
		
		//return this.okAjaxResult(userPage);
	}
	
	
	
	
	
	
	

}









