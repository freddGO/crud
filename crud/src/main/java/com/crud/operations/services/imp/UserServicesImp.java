package com.crud.operations.services.imp;

import java.util.List;

import com.crud.operations.model.User;
import com.crud.operations.services.UserService;
import com.crud.operations.services.dao.UserDao;

public class UserServicesImp implements UserService {

	private UserDao userDao;

	@Override
	public User createUser(User user) {
		return userDao.store(user);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> retrieveUser() {
		return userDao.findAll();
	}

	@Override
	public User updateUser(User user) {

		return userDao.store(user);
	}

	@Override
	public void deleteUser(User user) {

		userDao.delete(user);
	}

}
