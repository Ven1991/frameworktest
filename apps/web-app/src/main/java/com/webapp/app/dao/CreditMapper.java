package com.webapp.app.dao;

import com.webapp.app.model.Credit;

public interface CreditMapper {
    int deleteByPrimaryKey(Integer creditId);

    int insert(Credit credit);

    int insertSelective(Credit credit);

    Credit selectByPrimaryKey(Integer creditId);

    int updateByPrimaryKeySelective(Credit credit);

    int updateByPrimaryKey(Credit credit);
}