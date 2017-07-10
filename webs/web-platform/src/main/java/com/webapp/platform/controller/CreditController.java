package com.webapp.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.app.model.CreditLog;
import com.webapp.app.service.CreditLogService;
import com.webapp.app.service.CreditService;
import com.webapp.app.vo.CreditVo;
import com.webapp.framework.base.controller.BaseController;
import com.webapp.framework.core.exception.BaseException;

@Controller
@RequestMapping("/credit/*")
public class CreditController extends BaseController{
	
	@Autowired
	private CreditService creditService;
	@Autowired
	private CreditLogService creditLogService;
	
	@RequestMapping("toSaveCredit")
	public String toSaveCredit(){
		
		return "credit/addCredit";
	}
	
	@RequestMapping("saveCredit")
	public String saveCredit(){
		CreditVo creditVo = this.getForm(CreditVo.class);
		CreditLog log = new CreditLog();
		
		try {
			
			creditService.insert(creditVo);
			
			log.setUserId(creditVo.getUserId());
			log.setValue(creditVo.getValue());
			
			creditLogService.insert(log);
		} catch (BaseException e) {
			e.printStackTrace();
			this.error(e.getMessage());
		}catch (Exception e) {
			e.printStackTrace();
			this.error(e.getMessage());
		}
		
		return toSaveCredit();
	}
	
	

}









