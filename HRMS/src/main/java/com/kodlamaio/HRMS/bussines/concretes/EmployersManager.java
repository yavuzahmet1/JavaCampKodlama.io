package com.kodlamaio.HRMS.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kodlamaio.HRMS.bussines.abstracts.EmployersService;
import com.kodlamaio.HRMS.dataAccess.concretes.EmployersDao;
import com.kodlamaio.HRMS.entities.concretes.Employers;

public class EmployersManager implements EmployersService {

	private EmployersDao employersDao;

	@Autowired
	public EmployersManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}

	@Override
	public List<Employers> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
