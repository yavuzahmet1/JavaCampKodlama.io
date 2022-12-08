package com.hrms.demo.entity;

import javax.persistence.Entity;

@Entity
public abstract class User {
    private String email;
    private String password;
}
