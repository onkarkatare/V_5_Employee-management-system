package com.ems.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ems.entity.Leave;

public interface LeaveService {

	ResponseEntity<String> applyForLeave(int empId, Leave leave);
	
	List<Leave> getLeaves(int empId);
}
