package com.simon.serviceimpl;

import org.ultimania.model.User;

import com.simon.idao.UserDao;
import com.simon.iservice.UserService;

public class UserServiceImpl  implements UserService{
	private UserDao userDao;
	
	/**
	 * @return the userDao
	 */
	public UserDao getUserDao() {
		return userDao;
	}

	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean register(User user) {
			
		return userDao.register(user);
	}

}
