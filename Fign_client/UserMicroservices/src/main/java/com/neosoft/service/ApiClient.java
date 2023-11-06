package com.neosoft.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.neosoft.dto.PolicyDto;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="PolicyService",url="http://localhost:8686")
public interface ApiClient {
	@GetMapping("/getPolicy/{id}")
	public PolicyDto getPolicyById(@PathVariable("id") Integer id);

}
