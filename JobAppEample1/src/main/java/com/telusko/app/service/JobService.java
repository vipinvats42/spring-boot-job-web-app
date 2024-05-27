package com.telusko.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.telusko.app.model.JobPost;
import com.telusko.app.repo.JobRepo;

@Service
public class JobService {

	@Autowired
	private JobRepo jobRepo;
	
	public void addJob(JobPost job) {
		jobRepo.addJob(job);
	}
	
	public List<JobPost> getAllJobs(){
		return jobRepo.getAllJobs();
	}
	
	
}
