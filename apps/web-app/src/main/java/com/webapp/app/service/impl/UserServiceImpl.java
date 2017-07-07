package com.webapp.app.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.webapp.app.dao.UserMapper;
import com.webapp.app.model.User;
import com.webapp.app.service.UserService;
import com.webapp.app.vo.UserVo;

@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper userMapper;
	
	public User selectByPK(Integer userId){
		
		return this.userMapper.selectByPK(userId);
	}
	
	/**
	 * 获取用户分页数据
	 */
	public PageInfo<User> getUserByPage(UserVo userVo){
//		PageHelper.startPage(1, 10);
		PageHelper.startPage(userVo.getPageNum(), userVo.getPageSize());
		List<User> list = this.userMapper.selectUserByList();
		PageInfo<User> info = new PageInfo<User>(list);
//		info.setSize(20);
		return info;
	}
	
	
	
	
	
	

}
