package com.kodlamaio.HRMS.entities.concretes;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

	private int id;
	private String email;
	private String password;

}
