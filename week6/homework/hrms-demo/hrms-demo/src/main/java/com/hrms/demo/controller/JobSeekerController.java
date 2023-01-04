package com.hrms.demo.controller;

import com.hrms.demo.entity.JobSeeker;
import com.hrms.demo.service.abstracts.JobSeekerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobseekers")
@RequiredArgsConstructor
public class JobSeekerController {
    private final JobSeekerService jobSeekerService;

    @GetMapping
    public List<JobSeeker> getAll(){
        return jobSeekerService.getAll();
    }
    @GetMapping("/add")
    public JobSeeker add(JobSeeker jobSeeker){
        return jobSeekerService.add(jobSeeker);
    }

}
