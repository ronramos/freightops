package com.sr.freightops.web.action;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = -3264991497890187870L;
	private static final Logger log = Logger.getLogger(LogoutAction.class);
	private Map<String, Object> sessionAttributes = null;
	
	public String execute() {
		log.debug("execute logout...");
		sessionAttributes.remove("USER");
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;		
	}

}
