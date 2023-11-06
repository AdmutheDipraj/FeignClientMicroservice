package com.neosoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.neosoft.model.Policy;
import com.neosoft.service.PolicyService;

@RestController
public class PolicyController {
	@Autowired
	private PolicyService policyService;
	
	@PostMapping("/savePolicy")
	public Policy savePolicy(@RequestBody Policy policy) {
		Policy savePolicy = policyService.savePolicy(policy);
		return savePolicy;
		
	}
	@GetMapping("/getPolicy/{id}")
	public Policy getPolicy(@PathVariable("id") Integer id) {
		Policy getpolicyid = policyService.getPolicy(id);
		return getpolicyid;
		
	}

}
