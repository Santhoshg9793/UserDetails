/**
 * 
 */
package com.users.dao.implementation;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.Util;
import com.users.bean.UserDetails;
import com.users.dao.IUsersDao;

/**
 * @author Santhosh
 *
 */
@Repository
public class UsersDaoImpl implements IUsersDao {

	/**
	 * Method to add a new user
	 */
	public UserDetails addUser(UserDetails user, SessionFactory session) {
		if (!Util.isNull(user)) {
			session.getCurrentSession().saveOrUpdate(user);
		}
		return user;
	}

	/**
	 * Method to get an user details based on id
	 */
	public UserDetails getUserDetail(Integer userId, SessionFactory session) {
		UserDetails user=new UserDetails();
		if(!Util.isNull(userId)){
			user=(UserDetails) session.getCurrentSession().createCriteria(UserDetails.class)
			.add(Restrictions.eq("id", userId)).uniqueResult();
		}
		return user;
	}

}
