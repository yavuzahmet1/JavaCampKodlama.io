package com.hrms.demo.repository;

import com.hrms.demo.entity.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employer,Long> {
}
