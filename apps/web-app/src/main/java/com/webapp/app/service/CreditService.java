package com.webapp.app.service;

import com.webapp.app.vo.CreditVo;
import com.webapp.framework.core.datasource.DataSource;

public interface CreditService {

	
	//@DataSource("write")
	
	@DataSource("write")
	public int insert(CreditVo creditVo);
}
