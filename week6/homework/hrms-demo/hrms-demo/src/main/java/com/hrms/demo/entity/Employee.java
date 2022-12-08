package com.hrms.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee extends User{
    @Id
    private Long employeeId;
    private String name;
    private String lastName;
}
