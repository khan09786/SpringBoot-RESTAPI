package com.egiants.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.egiants.model.Organization;
import com.egiants.service.OrganizationService;

@RestController
@RequestMapping
public class OrganizationController {
	
	@Autowired
	OrganizationService organizationService;

	@RequestMapping(value = "/organizations", method = RequestMethod.GET)
	List<Organization> organzationPageable() {
		return organizationService.getAll();

	}

}
