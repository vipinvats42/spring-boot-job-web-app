package com.telusko.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telusko.app.model.JobPost;
import com.telusko.app.service.JobService;

@Controller
class JobController {
  
	@Autowired
	JobService service;
	
	@RequestMapping({"/","home"})
	public String home() {
		return "home";
	}
	
	@RequestMapping("/addjob")
	public String addJob() {
		return "addjob";
	}
	
	@PostMapping("/handleForm")
	public String handleForm(JobPost jobPost) {
		service.addJob(jobPost);
		return "success";
	}
	
	@GetMapping("viewalljobs")
	public String viewJobs(Model model) {
		List<JobPost> jobs=service.getAllJobs();
		model.addAttribute("jobPosts",jobs);
		return "viewalljobs";
	}
	
	
	@GetMapping("contactus")
	public String contactUs() {
		return "contact";
	}
}
