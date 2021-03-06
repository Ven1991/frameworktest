package com.webapp.app.dao;

import com.webapp.app.model.CreditLog;

public interface CreditLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CreditLog record);

    int insertSelective(CreditLog record);

    CreditLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CreditLog record);

    int updateByPrimaryKey(CreditLog record);
}