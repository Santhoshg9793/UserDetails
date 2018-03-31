/**
 * 
 */
package com.users.dao;

import org.hibernate.SessionFactory;

import com.users.bean.UserDetails;

/**
 * @author Santhosh
 *
 */
public interface IUsersDao {

	/**	 
	 * Method to add a new user	
	 * @param user
	 * @param session
	 * @return UserDetails
	 */
	UserDetails addUser(UserDetails user,SessionFactory session);
	
	/**
	 * Method to get an user details based on id
	 * @param userId
	 * @param session
	 * @return
	 */
	UserDetails getUserDetail(Integer userId,SessionFactory session);

}
