package com.simon.myssh;


import org.ultimania.model.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.simon.iservice.UserService;

public class HelloAction extends ActionSupport implements ModelDriven<User>{
	UserService userService;
	User user=new User();

	/**
	 * @return the userService
	 */
	public UserService getUserService() {
		return userService;
	}


	/**
	 * @param userService the userService to set
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
//		User user=new User();
//		user.setName("hlf1");
		System.out.println("user"+user);
		userService.register(user);
		ActionContext actionContext=ActionContext.getContext();
		actionContext.getApplication().put("userid", user.getId());
		actionContext.getSession().put("username", user.getName());
		return super.execute();
	}


	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	

}
