package com.pranshee.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pranshee.app.model.JobPost;
import com.pranshee.app.service.JobService;

@RestController
public class JobRestController {
	
	@Autowired
	private JobService service;
	
	
	@GetMapping("jobPosts")
	public List<JobPost> getAllJobs() {
		return service.getAllJobs();
	}
	
	@GetMapping("jobPost/{postId}")
	public JobPost getJob(@PathVariable("postId") int postId) {
		return service.getJobs(postId);
	}


    @PostMapping("jobPost")
    private JobPost addJob(@RequestBody JobPost jobPost) {
    	  service.addJob(jobPost);
    	  return service.getJobs(jobPost.getPostId());
    }
}
