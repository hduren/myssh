package com.simon.myssh;

import org.ultimania.model.User;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class OgnlAction extends ActionSupport {
//	User user;
//	
//
//
//	/**
//	 * @return the user
//	 */
//	public User getUser() {
//		return user;
//	}
//
//
//
//	/**
//	 * @param user the user to set
//	 */
//	public void setUser(User user) {
//		this.user = user;
//	}
	
	private String name;
	



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}




	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}




	@Override
	public String execute() throws Exception {
		System.out.println("use2r");
		System.out.println("user"+name);

		return SUCCESS;
	}

}
