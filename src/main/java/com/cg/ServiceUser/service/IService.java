package com.cg.ServiceUser.service;

import javax.validation.Valid;

import com.cg.ServiceUser.model.Login;
import com.cg.ServiceUser.model.UserDetails;

public interface IService {

	UserDetails addServiceDetails(UserDetails details);

	Login addNewUser(@Valid Login user);

	Login getUserByID(String userId);

	Login updateProfile(Login login);

}
