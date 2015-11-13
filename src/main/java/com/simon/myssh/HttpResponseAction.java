package com.simon.myssh;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.hibernate.Session;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class HttpResponseAction implements Action,ServletResponseAware {
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

	HttpServletResponse httpServletResponse;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		//不能如此操作
//		httpServletResponse.getWriter().println("hello action");
		
		Cookie cookie=new Cookie("name", java.net.URLEncoder.encode(getName())+"hlf12");
		
		cookie.setMaxAge(3600);
		System.out.println("add cooke"+ getName());
//		httpServletResponse.addCookie(cookie);
//		ActionContext ac=ActionContext.getContext();
		
		ServletActionContext.getResponse().addCookie(cookie);
		ActionContext ac=ActionContext.getContext();
		Map<String, Object> session=new HashMap<>();
		session.put("name", getName());
		ac.getSession().put("name", getName());
		
//		ac.setSession(session);
		
		return SUCCESS;
	}

	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		httpServletResponse=arg0;
		
	}
	
	

}
