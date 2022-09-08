package com.kodlamaio.HRMS.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.HRMS.bussines.abstracts.EmployeesService;
import com.kodlamaio.HRMS.dataAccess.concretes.EmployeesDao;
import com.kodlamaio.HRMS.entities.concretes.Employees;

@Service
public class EmployeesManager implements EmployeesService {

	private EmployeesDao employeesDao;

	@Autowired
	public EmployeesManager(EmployeesDao employeesDao) {
		super();
		this.employeesDao = employeesDao;
	}

	@Override
	public List<Employees> getAll() {
		// TODO Auto-generated method stub
		return employeesDao.findAll();
	}

}
