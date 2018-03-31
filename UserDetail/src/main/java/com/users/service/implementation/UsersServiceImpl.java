/**
 * 
 */
package com.users.service.implementation;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Util;
import com.users.bean.UserDetails;
import com.users.dao.IUsersDao;
import com.users.request.UserRequest;
import com.users.service.IUsersService;

/**
 * @author Santhosh
 *
 */
@Service
public class UsersServiceImpl implements IUsersService {

	@Autowired
	private IUsersDao userDao;

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * Method to add a new user
	 */
	@Transactional
	public UserDetails addUser(UserRequest req) throws Exception {
		if (Util.isNull(req) || Util.isNull(req.getUser()) || Util.isNull(req.getUser().getFirstName())) {
			throw new Exception("First name cannot be null for an user");
		}
		UserDetails user = req.getUser();

		if (!Util.isNull(user)) {
			user.setCreatedTs(Util.getCurrentTimeStamp());
			user.setUpdatedTs(Util.getCurrentTimeStamp());
			user.setIsDeleted(false);
		}
		return userDao.addUser(user, sessionFactory);
	}

	/**
	 * Method to get an user details based on id
	 */
	@Transactional
	public UserDetails getUserDetail(Integer userId) throws Exception {
		if ( Util.isNull(userId)) {
			throw new Exception("UserId cannot be null");
		}
		return userDao.getUserDetail(userId, sessionFactory);
	}

}
