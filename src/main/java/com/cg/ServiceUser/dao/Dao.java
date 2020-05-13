package com.cg.ServiceUser.dao;

import com.cg.ServiceUser.model.Login;
import com.cg.ServiceUser.model.UserDetails;

public interface Dao {

	UserDetails addServiceDetails(UserDetails details);

	Login addNewUser(Login user);

	Login getUserByID(String userId);

	Login updateProfile(Login login);

}
