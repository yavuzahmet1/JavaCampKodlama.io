package com.hrms.demo.entity;

import javax.persistence.Entity;

@Entity
public class Employer extends User{
    private String companyName;
    private String webAddress;
    private String telephoneNumber;
}
