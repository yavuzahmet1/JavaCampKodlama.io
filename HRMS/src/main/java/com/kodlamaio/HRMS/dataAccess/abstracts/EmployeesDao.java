package com.kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.HRMS.entities.concretes.Employees;

public interface EmployeesDao extends JpaRepository<Employees, Integer> {

}
