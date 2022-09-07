package com.kodlamaio.HRMS.entities.concretes;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Candidates {
	private int id;
	private String firstName;
	private String lastName;
	private int identityNumber;
	private Date birthYear;

}
