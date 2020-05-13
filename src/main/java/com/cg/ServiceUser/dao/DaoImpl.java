package com.cg.ServiceUser.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.cg.ServiceUser.model.Login;
import com.cg.ServiceUser.model.UserDetails;

@Repository
public class DaoImpl implements Dao{

	@Autowired
	MongoTemplate template;
	
	@Override
	public UserDetails addServiceDetails(UserDetails details) {
	template.insert(details);
	return details;
	}

	@Override
	public Login addNewUser(Login user) {
		// TODO Auto-generated method stub
		template.save(user);
		return user;
	}

	@Override
	public Login getUserByID(String userId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(userId));
		return template.findOne(query, Login.class);
	}

	@Override
	public Login updateProfile(Login login) {
		Login login1= getUserByID(login.getUserId());
		Login login2 = new Login();
		if(login!=null) {
			login2 = template.save(login);
		}
		return login2;
	}

}
