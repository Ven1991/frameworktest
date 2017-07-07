package com.webapp.app.service;

import com.github.pagehelper.PageInfo;
import com.webapp.app.model.User;
import com.webapp.app.vo.UserVo;
import com.webapp.framework.core.datasource.DataSource;

public interface UserService {

	
	//@DataSource("write")
	
	@DataSource("read")
	public User selectByPK(Integer userId);
	
	@DataSource("read")
	public PageInfo<User> getUserByPage(UserVo userVo);
}
