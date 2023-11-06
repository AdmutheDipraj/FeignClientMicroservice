package com.neosoft.dto;

public class PolicyDto {
	
	private Integer id;
	private String policyName;
	private String status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "PolicyDto [id=" + id + ", policyName=" + policyName + ", status=" + status + "]";
	}
	
	

}
