package com.webapp.app.service;

import com.webapp.app.vo.User;
import com.webapp.framework.core.datasource.DataSource;

public interface UserService {

	
	//@DataSource("write")
	
	@DataSource("read")
	public User selectByPK(Integer userId);
}
