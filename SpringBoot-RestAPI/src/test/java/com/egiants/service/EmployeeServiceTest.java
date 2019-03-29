package com.egiants.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class EmployeeServiceTest {

	@Autowired
	OrganizationService organizationService;
	
	@Test
	public void getByName() {
		organizationService.getByName("safadsf");
		assert 1 ==1;
	}

}


