package com.hrms.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employer extends User{
    @Id
    private Long employerId;
    private String companyName;
    private String webAddress;
    private String telephoneNumber;
}
