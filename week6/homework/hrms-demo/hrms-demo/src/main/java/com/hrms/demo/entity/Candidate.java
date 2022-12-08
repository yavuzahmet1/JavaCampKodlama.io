package com.hrms.demo.entity;

import javax.persistence.Entity;

@Entity
public class Candidate extends User {
    private String name;
    private String lastName;
    private String identityNumber;
    private int birtOfYear;


}
