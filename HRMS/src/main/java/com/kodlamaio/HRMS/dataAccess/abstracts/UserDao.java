package com.kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.HRMS.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
