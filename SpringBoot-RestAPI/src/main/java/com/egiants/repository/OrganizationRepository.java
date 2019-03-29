package com.egiants.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.egiants.model.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {


}
