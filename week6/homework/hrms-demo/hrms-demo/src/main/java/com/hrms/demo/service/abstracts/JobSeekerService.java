package com.hrms.demo.service.abstracts;

import com.hrms.demo.entity.JobSeeker;

import java.util.List;

public interface JobSeekerService {
    List<JobSeeker> getAll();

    JobSeeker add(JobSeeker jobSeeker);
}
