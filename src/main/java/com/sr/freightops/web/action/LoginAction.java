package com.sr.freightops.web.action;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sr.freightops.entity.User;
import com.sr.freightops.service.UserService;
import com.sr.freightops.web.formbeans.UserBean;

public class LoginAction extends ActionSupport implements SessionAware, ModelDriven<UserBean>{
	
	private static final Logger log = Logger.getLogger(LoginAction.class);
	private static final long serialVersionUID = -2322861141685400811L;	

	private UserBean userBean = new UserBean();
	private Map<String, Object> sessionAttributes = null;
	
	@Autowired
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String execute() {
		log.debug("execute login...");
		if (sessionAttributes.get("USER")!= null){
			return SUCCESS;
		}
		//Username should be unique, so there should be one result only if there is a matching username
		User userDataFromDB = userService.findUserByUserName(userBean.getUsername());
		if (userDataFromDB != null && userBean.getPassword().equals(userDataFromDB.getPassword())){
			userBean.setId(userDataFromDB.getId());
			userBean.setName(userDataFromDB.getName());
			log.debug(userBean.toString());
			sessionAttributes.put("USER", userBean);
			return SUCCESS;
		}
		else {
			log.debug("clearing errors and messages...");
			clearErrorsAndMessages();
			addActionError(getText("error.login"));
			// a function from ActionSupport, to get properties values from
			// properties file
			return INPUT;
		}
	}

	public void validate() {
		log.debug("clearing errors and messages...");
		clearErrorsAndMessages();
		log.debug("validating user input...");
		if (userBean.getUsername() == null || userBean.getUsername().trim().equals("")) {
			log.debug("user name is required...");
			addFieldError("username", "The name is required");
		}
		if (userBean.getPassword() == null || userBean.getPassword().trim().equals("")) {
			log.debug("password is required...");
			addFieldError("password", "The password is required");
		}
	}

	@Override
	public UserBean getModel() {
		return userBean;
	}

	@Override
	public void setSession(Map<String, Object> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;		
	}
}
