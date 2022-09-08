package com.kodlamaio.HRMS.dataAccess.concretes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.HRMS.entities.concretes.Candidates;

public interface CandidatesDao extends JpaRepository<Candidates, Integer> {

}
