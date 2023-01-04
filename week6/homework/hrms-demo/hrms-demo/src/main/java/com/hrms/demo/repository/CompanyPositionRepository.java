package com.hrms.demo.repository;

import com.hrms.demo.entity.CompanyPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyPositionRepository extends JpaRepository<CompanyPosition, Long> {
}
