package com.database.test.services.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.test.dataAccess.UserDao;
import com.database.test.entities.User;
import com.database.test.services.abstracts.UserService;

@Service
public class UserManager implements UserService {
	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {

		return userDao.findAll();
	}

}
