package com.crud.operations.services.dao;

import com.crud.operations.model.User;

public interface UserDao extends GenericDao<User, Long> {


	/*
	 * Insert and Update operations are combined into a single operation (e.g. Store)
	 * This is to let the ORM framework (not you) decide whether an object should be 
	 * inserted or updated.
	 * 
	 * Here we can write the USER's behavior.
	 * 
	 */
	
}
