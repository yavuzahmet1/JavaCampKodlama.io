package com.kodlamaio.HRMS.entities.concretes;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employers")
public class Employers {
	private int id;
	private String companyName;
	private String webAddress;
	private String phoneNumber;

}
