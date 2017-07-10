package com.webapp.admin.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapp.framework.core.beans.BaseUserForm;
import com.webapp.framework.core.interceptor.BaseInterceptor;

/**
 * 业务拦截器 Filename: SvnInterceptor.java Description: Copyright: Copyright (c)
 * 2012-2013 All Rights Reserved. Company: golden-soft.com Inc.
 * 
 * @author: flotage
 * @version: 1.0 Create at: 2016-5-27 下午06:35:07
 * 
 *           Modification History: Date Author Version Description
 *           ------------------------------------------------------------------
 *           2016-5-27 flotage 1.0 1.0 Version
 *
 */
public class WebInterceptor extends BaseInterceptor {

	@Override
	protected boolean isCanAccess(HttpServletRequest paramHttpServletRequest,
			HttpServletResponse paramHttpServletResponse, String paramString1, String paramString2,
			BaseUserForm paramBaseUserForm, Object paramObject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected BaseUserForm getLoginUser(HttpServletRequest paramHttpServletRequest,
			HttpServletResponse paramHttpServletResponse, Object paramObject) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * 每次访问URL时必调用 (non-Javadoc)
	 * 
	 * @see com.golden.core.base.interceptor.BaseInterceptor#getLoginUser(javax.
	 * servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse,
	 * java.lang.Object)
	 */
	
/*	@Override
	protected BaseUserForm getLoginUser(HttpServletRequest request, HttpServletResponse response, Object action) {
		User user = (User) request.getSession().getAttribute(BaseCoreConstants.SESSION_KEY.LOGIN_USER_IN_SESSION_KEY);
		// TODO 如果用户在session中为空，则需要根据单点登录规则加载用户信息
		return user;
	}

	@Override
	protected boolean isCanAccess(HttpServletRequest request, HttpServletResponse response, String namespace,
			String method, BaseUserForm user, Object handler) {
		if (namespace.indexOf("/login") >= 0)
			return true;
		return null != user; // true - 表示允许访问 false - 表示拒绝访问
	}*/

}









