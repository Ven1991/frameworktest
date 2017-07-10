package com.webapp.app.service;

import com.webapp.app.model.CreditLog;
import com.webapp.framework.core.datasource.DataSource;

public interface CreditLogService {
	
	@DataSource("write")
	public void insert(CreditLog log);

}
