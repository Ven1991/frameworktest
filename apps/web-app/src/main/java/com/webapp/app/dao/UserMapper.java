package com.webapp.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.webapp.app.model.User;
import com.webapp.app.vo.UserVo;

public interface UserMapper {
	
    int deleteByPrimaryKey(Integer userId);

    int insert(UserVo user);
	
    int insertSelective(UserVo user);

    User selectByPK(@Param("userId") Integer userId);

    int updateByPrimaryKeySelective(UserVo user);

    int updateByPrimaryKeyWithBLOBs(UserVo user);

    int updateByPrimaryKey(UserVo user);
    
    List<User> selectUserByList();
    
    
}