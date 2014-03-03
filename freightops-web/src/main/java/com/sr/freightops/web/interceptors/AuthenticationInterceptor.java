package com.sr.freightops.web.interceptors;

import java.util.Map;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.sr.freightops.web.formbeans.UserBean;

public class AuthenticationInterceptor implements Interceptor {

	private static final long serialVersionUID = 2231519310678558532L;
	private static final Logger log = Logger.getLogger(AuthenticationInterceptor.class);
	
	@Override
    public void destroy() {
        //release resources here
    }
 
    @Override
    public void init() {
        // create resources here
    }
 
    @Override
    public String intercept(ActionInvocation actionInvocation)
            throws Exception {
    	log.debug("inside authentication interceptor...");
        Map<String, Object> sessionAttributes = actionInvocation.getInvocationContext().getSession();
         
        UserBean userBean = (UserBean) sessionAttributes.get("USER");
         
        if(userBean == null){
        	log.debug("userBean is null, redirecting to LoginAction...");
            return Action.LOGIN;
        }else{
        	log.debug("userBean is not null, continue to the current Action...");
            Action action = (Action) actionInvocation.getAction();
            if(action instanceof UserBeanAware){
                ((UserBeanAware) action).setUserBean(userBean);
            }
            return actionInvocation.invoke();
        }
    }
 
}
