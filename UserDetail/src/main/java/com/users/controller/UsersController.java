/**
 * 
 */
package com.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Util;
import com.users.bean.UserDetails;
import com.users.constants.UsersConstants;
import com.users.request.UserRequest;
import com.users.response.UserResponse;
import com.users.service.IUsersService;

/**
 * UsersController contains CRUD methods of user
 * 
 * @author Santhosh
 *
 */
@RestController
@RequestMapping(value = UsersConstants.USER)
public class UsersController {

	@Autowired
	private IUsersService userService;

	/**
	 * Method to add a new user
	 * 
	 * @param req
	 * @return UserDetails
	 * @throws Exception
	 */
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public UserResponse addUser(@RequestBody UserRequest req) throws Exception {
		UserResponse response = new UserResponse();
		UserDetails user = new UserDetails();
		user = userService.addUser(req);

		response.setUser(user);
		response.setStatus(UsersConstants.SUCCESS);
		response.setMessage(UsersConstants.USER_CREATE);

		return response;
	}

	/**
	 * Method to get an user details based on id
	 * 
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	@ResponseBody
	public UserResponse getUserById(@PathVariable Integer userId) throws Exception {
		UserResponse response = new UserResponse();
		UserDetails user = new UserDetails();
		user = userService.getUserDetail(userId);
		if (!Util.isNull(user) && !Util.isNull(user.getId())) {
			response.setUser(user);
			response.setStatus(UsersConstants.SUCCESS);
			response.setMessage(UsersConstants.USER_DETAIL_FETCH);
		} else {
			response.setStatus(UsersConstants.SUCCESS);
			response.setMessage(UsersConstants.USER_NOT_FOUND);
		}
		return response;
	}

}
