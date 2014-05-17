package com.sr.freightops.web.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sr.freightops.entity.User;
import com.sr.freightops.service.UserService;
import com.sr.freightops.web.formbeans.UserBean;
import com.sr.freightops.web.interceptors.UserBeanAware;

public class UserListAction extends ActionSupport implements UserBeanAware, ModelDriven<UserBean>{
	
	private static final long serialVersionUID = -7951293368710402075L;
	private static final Logger log = Logger.getLogger(UserListAction.class);
	private List<User> users = new ArrayList<User>();
	private UserBean userBean;
	
	@Autowired
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String execute() {
		log.debug("execute retrieving list of users...");
		users = userService.findAllUser();
		log.debug("users retrieved: " + users.size());
//		if (users.size()!= 0){
//			int cnt = 0;
//			for (User user : users) {				
//				cnt++;
//				log.debug("user " + cnt + ": " + user.toString());
//			}
//		}		
		return SUCCESS;
	}
	
	@Override
	public UserBean getModel() {
		return userBean;
	}

	@Override
	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
		
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
