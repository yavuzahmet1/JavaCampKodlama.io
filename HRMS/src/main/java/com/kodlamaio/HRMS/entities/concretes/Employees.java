package com.kodlamaio.HRMS.entities.concretes;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")
public class Employees {
	private int id;
	private String firstName;
	private String lastName;

}
