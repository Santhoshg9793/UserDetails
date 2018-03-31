/**
 * 
 */
package com.users.response;

import com.CommonResponse;
import com.users.bean.UserDetails;

/**
 * @author Santhosh
 *
 */
public class UserResponse extends CommonResponse {

	private UserDetails user;

	public UserDetails getUser() {
		return user;
	}

	public void setUser(UserDetails user) {
		this.user = user;
	}

}
