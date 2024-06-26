package com.telusko.app.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.telusko.app.model.JobPost;
import com.telusko.app.service.JobService;


@Repository
public class JobRepo {
	
	
	List<JobPost> jobs= new ArrayList<>(Arrays.asList(
	   new JobPost(1,"java Developer","",4,List.of("HTML", "CSS", "JavaScript", "React")),
	   new JobPost(2,"frontEnd Developer Developer","",4,List.of("Python", "Machine Learning", "Data Analysis")),
	   new JobPost(3,"Node Developer","",4,List.of("Networking", "Cisco", "Routing", "Switching")),
	   new JobPost(4,"Android Developer","",4,List.of("iOS Development", "Android Development", "Mobile App"))
			));
	
	public List<JobPost> getAllJobs(){
		return jobs;
	}
	
	public void addJob(JobPost job) {
		jobs.add(job);
		
		System.out.println(jobs);
	}

}
