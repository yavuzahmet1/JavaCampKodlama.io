package com.kodlamaio.HRMS.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.HRMS.bussines.abstracts.UserService;
import com.kodlamaio.HRMS.dataAccess.concretes.UserDao;
import com.kodlamaio.HRMS.entities.concretes.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	/*
	 * @Override public User getUserById(int id) { // TODO Auto-generated method
	 * stub return null; }
	 */
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}
