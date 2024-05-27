package com.pranshee.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pranshee.app.model.JobPost;
import com.pranshee.app.repo.JobRepo;

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

	public JobPost getJobs(int i) {
		return jobRepo.getJob(i);
	}
	
	
}
