package com.webapp.app.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.webapp.app.dao.CreditLogMapper;
import com.webapp.app.dao.CreditMapper;
import com.webapp.app.model.Credit;
import com.webapp.app.service.CreditService;
import com.webapp.app.vo.CreditVo;
import com.webapp.framework.base.service.BaseService;

@Service
public class CreditServiceImpl extends BaseService implements CreditService{
	
	@Resource
	private CreditMapper creditMapper;
	@Resource
	private CreditLogMapper creditLogMapper;
	
	@Override
	public int insert(CreditVo creditVo){
		 
		Credit credit = this.copyProperties(Credit.class, creditVo);
		Integer i = this.creditMapper.insert(credit);
		
		/*CreditLog log = new CreditLog();
		log.setUserId(creditVo.getUserId());
		log.setValue(creditVo.getValue());
		creditLogMapper.insert(log);*/
		
		return 1;
	}

	@Override
	public Date getDate() {
		return null;
	}
}
