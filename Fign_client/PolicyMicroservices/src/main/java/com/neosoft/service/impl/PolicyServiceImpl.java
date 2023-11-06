package com.neosoft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.model.Policy;
import com.neosoft.repository.PolicyRepository;
import com.neosoft.service.PolicyService;
@Service
public class PolicyServiceImpl implements PolicyService{
	@Autowired
	private PolicyRepository policyRepository;

	@Override
	public Policy savePolicy(Policy policy) {
		Policy savePolicy = policyRepository.save(policy);
		return savePolicy;
	}

	@Override
	public Policy getPolicy(Integer id) {
		Policy policyids = policyRepository.findById(id);
		return policyids;
	}

}
