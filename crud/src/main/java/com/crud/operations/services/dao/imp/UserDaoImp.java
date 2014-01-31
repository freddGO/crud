package com.crud.operations.services.dao.imp;

import com.crud.operations.model.User;
import com.crud.operations.services.dao.UserDao;


public class UserDaoImp extends GenericJPADao<User,Long> implements UserDao {


	public UserDaoImp(){
		super(User.class);
	}

}
