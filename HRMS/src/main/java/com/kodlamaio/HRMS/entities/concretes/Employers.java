package com.kodlamaio.HRMS.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employers {
	private int id;
	private String companyName;
	private String webAddress;
	private String phoneNumber;

}
