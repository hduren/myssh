package com.simon.daoimp;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.ultimania.model.User;

import com.simon.idao.UserDao;

public class UserDaoImpl implements UserDao {
	  private HibernateTemplate hibernateTemplate;  
	  private SessionFactory sessionFactory;
	    public void setSessionFactory(SessionFactory sessionFactory) {  
	    	this.sessionFactory=sessionFactory;
	        this.hibernateTemplate = new HibernateTemplate(sessionFactory);  
	    } 

	@Override
	public boolean register(User usr) {
		hibernateTemplate.save(usr);
		return true;
	}

}
