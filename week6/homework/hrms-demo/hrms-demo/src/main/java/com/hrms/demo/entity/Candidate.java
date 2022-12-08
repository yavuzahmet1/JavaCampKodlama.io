package com.hrms.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candidate extends User {
    @Id
    private Long CandidateId;
    private String name;
    private String lastName;
    private String identityNumber;
    private int birtOfYear;


}
