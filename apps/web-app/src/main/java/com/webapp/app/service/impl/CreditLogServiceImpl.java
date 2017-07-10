package com.webapp.app.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.webapp.app.dao.CreditLogMapper;
import com.webapp.app.model.CreditLog;
import com.webapp.app.service.CreditLogService;
import com.webapp.framework.base.service.BaseService;

@Service
public class CreditLogServiceImpl extends BaseService implements CreditLogService {

	@Resource
	private CreditLogMapper  creditLogMapper;
	
	public void insert(CreditLog creditLog){
		
//		CreditLog log = new CreditLog();
		
//		creditLog.setUserId(Integer.valueOf("PPP"));
//		log.setValue(creditLogVo.getValue());
		creditLogMapper.insert(creditLog);
		
	}
	
	
	@Override
	public Date getDate() {
		return null;
	}
	
	
	
}
