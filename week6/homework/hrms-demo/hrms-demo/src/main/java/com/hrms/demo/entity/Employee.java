package com.hrms.demo.entity;

import javax.persistence.Entity;

@Entity
public class Employee extends User{
    private String name;
    private String lastName;
}
