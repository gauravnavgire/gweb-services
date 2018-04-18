package com.rubix.webservices.gadmin.user.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rubix.webservices.gadmin.user.service.model.UserModel;

public interface UserRepo extends  JpaRepository<UserModel, Long> {

	public UserModel findByUserName(String userName);
	
	public UserModel findById(Long id);
}
