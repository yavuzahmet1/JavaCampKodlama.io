package com.kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.HRMS.entities.concretes.Employers;

public interface EmployersDao extends JpaRepository<Employers, Integer> {

}
