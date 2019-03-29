package com.egiants.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egiants.model.Organization;
import com.egiants.repository.OrganizationRepository;

@Service
public class OrganizationService {

	@Autowired
	private OrganizationRepository organizationRepository;
	
	public List<Organization> getAll() {
		List<Organization> organizations = organizationRepository.findAll();
		return organizations;
	}
	
	public String getByName(String info) {
		String abc = "khwaja";
		
		return abc+info;
		
	}
}
