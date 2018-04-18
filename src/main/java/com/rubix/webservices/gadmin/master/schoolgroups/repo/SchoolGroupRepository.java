package com.rubix.webservices.gadmin.master.schoolgroups.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rubix.webservices.gadmin.master.schoolgroups.model.SchoolGroup;

public interface SchoolGroupRepository extends JpaRepository<SchoolGroup, Long> {

}
