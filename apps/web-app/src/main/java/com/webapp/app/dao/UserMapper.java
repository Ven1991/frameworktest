package com.webapp.app.dao;

import org.apache.ibatis.annotations.Param;

import com.webapp.app.vo.User;

public interface UserMapper {
	
    int deleteByPrimaryKey(Integer userId);

    int insert(User user);
	
    int insertSelective(User user);

    User selectByPK(@Param("userId") Integer userId);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKeyWithBLOBs(User user);

    int updateByPrimaryKey(User user);
    
    
}