package com.hrms.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class User {
    @Id
    private Long id;
    private String email;
    private String password;
}
