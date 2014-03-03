package com.sr.freightops.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sr.freightops.web.formbeans.UserBean;
import com.sr.freightops.web.interceptors.UserBeanAware;

public class LinkAction extends ActionSupport implements UserBeanAware, ModelDriven<UserBean>{

	private static final long serialVersionUID = -2613425890762568273L;
	private UserBean userBean;

	public String login() {
		return "login";
	}
	
	public String logout() {
		return "logout";
	}

	public String welcome() {
		return "welcome";
	}

	public String booking() {
		return "booking";
	}

	public String operations() {
		return "operations";
	}

	public String documentations() {
		return "documentations";
	}

	public String reports() {
		return "reports";
	}

	public String carrier() {
		return "carrier";
	}

	public String customer() {
		return "customer";
	}

	public String admin() {
		return "admin";
	}
	
	public String userList() {
		return "userList";
	}
	
	public String userCreate() {
		return "userCreate";
	}
	
	public String groupList() {
		return "groupList";
	}
	
	public String groupCreate() {
		return "groupCreate";
	}
	
	public String generalSettingView() {
		return "generalSettingView";
	}
	
	public String skinSettingView() {
		return "skinSettingView";
	}
	
	public String mailSettingView() {
		return "mailSettingView";
	}
	
	@Override
	public UserBean getModel() {
		return this.userBean;
	}

	@Override
	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;		
	}

}
