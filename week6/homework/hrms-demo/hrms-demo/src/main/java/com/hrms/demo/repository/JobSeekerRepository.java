package com.hrms.demo.repository;

import com.hrms.demo.entity.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerRepository extends JpaRepository<JobSeeker, Long> {
}
