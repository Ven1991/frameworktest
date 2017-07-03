package com.webapp.app.dao;

import com.webapp.app.vo.User;

public interface UserMapper {
	
    int deleteByPrimaryKey(Integer userId);

    int insert(User user);

    int insertSelective(User user);

    User selectByPrimaryKey(Integer user);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKeyWithBLOBs(User user);

    int updateByPrimaryKey(User user);
    
    
    
    
}