package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobService;
import kodlama.io.hrms.entities.concretes.Job;

@RestController
@RequestMapping("/api/job")
public class JobController {

		private JobService jobService;
		
		@Autowired
		public JobController(JobService jobService) {
			super();
			this.jobService = jobService;
		}
		
		@GetMapping("/getall")
		public List<Job> getAll(){
			return jobService.getAll();
		}
	
	
}
