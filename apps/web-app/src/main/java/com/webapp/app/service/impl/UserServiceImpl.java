package com.webapp.app.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.webapp.app.dao.UserMapper;
import com.webapp.app.service.UserService;
import com.webapp.app.vo.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper userMapper;
	
	public User selectByPK(Integer userId){
		
		return this.userMapper.selectByPK(userId);
	}
	
	
	
	
	
	

}
