package com.cg.ServiceUser.service;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ServiceUser.dao.Dao;
import com.cg.ServiceUser.model.Login;
import com.cg.ServiceUser.model.UserDetails;

@Service

public class ServiceImpl implements IService {

	@Autowired
	Dao dao;
	
	@Override
	public UserDetails addServiceDetails(UserDetails details) {
	return dao.addServiceDetails(details);
	}

	@Override
	public Login addNewUser(Login user) {
		// TODO Auto-generated method stub
		return dao.addNewUser(user);
	}

	@Override
	public Login getUserByID(String userId) {
		// TODO Auto-generated method stub
		return dao.getUserByID(userId);
	}

	@Override
	public Login updateProfile(Login login) {
		// TODO Auto-generated method stub
		return dao.updateProfile(login);
	}

}
