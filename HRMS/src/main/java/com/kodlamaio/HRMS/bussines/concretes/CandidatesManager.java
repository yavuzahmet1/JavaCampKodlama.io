package com.kodlamaio.HRMS.bussines.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodlamaio.HRMS.bussines.abstracts.CandidatesService;
import com.kodlamaio.HRMS.dataAccess.concretes.CandidatesDao;
import com.kodlamaio.HRMS.entities.concretes.Candidates;

@Service
public class CandidatesManager implements CandidatesService {

	private CandidatesDao candidatesDao;

	public CandidatesManager(CandidatesDao candidatesDao) {
		super();
		this.candidatesDao = candidatesDao;
	}

	@Override
	public List<Candidates> getAll() {
		// TODO Auto-generated method stub
		return candidatesDao.findAll();
	}

}
