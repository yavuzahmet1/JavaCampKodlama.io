package com.hrms.demo.service.concretes;

import com.hrms.demo.entity.JobSeeker;
import com.hrms.demo.repository.JobSeekerRepository;
import com.hrms.demo.service.abstracts.JobSeekerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobSeekerManager implements JobSeekerService {
    private final JobSeekerRepository jobSeekerRepository;

    @Override
    public List<JobSeeker> getAll() {
        return jobSeekerRepository.findAll();
    }

    @Override
    public JobSeeker add(JobSeeker jobSeeker) {
        return jobSeekerRepository.save(jobSeeker);
    }
}
