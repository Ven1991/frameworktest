package com.webapp.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.app.dao.UserMapper;
import com.webapp.app.service.UserService;
import com.webapp.app.vo.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	public User selectByPK(Integer userId){
		
		return this.userMapper.selectByPK(userId);
	}
	
	
	
	
	
	

}
