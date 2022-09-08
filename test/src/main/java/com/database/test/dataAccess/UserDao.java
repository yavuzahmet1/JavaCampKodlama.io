package com.database.test.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.test.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
