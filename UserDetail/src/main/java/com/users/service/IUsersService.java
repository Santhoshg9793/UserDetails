/**
 * 
 */
package com.users.service;

import com.users.bean.UserDetails;
import com.users.request.UserRequest;

/**
 * @author Santhosh
 *
 */
public interface IUsersService {
	
	/**
	 * Method to add a new user
	 * @param req
	 * @return UserDetails
	 * @throws Exception
	 */
	UserDetails addUser(UserRequest req) throws Exception;

	/**
	 * Method to get an user details based on id
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	UserDetails getUserDetail(Integer userId) throws Exception;
}
