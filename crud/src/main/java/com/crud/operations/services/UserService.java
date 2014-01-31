package com.crud.operations.services;

import java.util.List;

import com.crud.operations.model.User;

public interface UserService {
	User createUser(User user);
	List<User> retrieveUser();
	User updateUser(User user);
	void deleteUser(User user);
}
