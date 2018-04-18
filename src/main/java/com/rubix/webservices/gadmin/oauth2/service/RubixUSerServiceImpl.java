package com.rubix.webservices.gadmin.oauth2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubix.webservices.gadmin.user.service.model.UserModel;
import com.rubix.webservices.gadmin.user.service.repo.UserRepo;

@Service
public class RubixUSerServiceImpl implements  RubixUserService{

	@Autowired
	private UserRepo userRepo;

	@Override
	public UserModel findByUserName(String userName) {
		// TODO Auto-generated method stub
		
		return userRepo.findByUserName(userName);
	}

	@Override
	public UserModel findUserById(Long userId) {
		// TODO Auto-generated method stub
		return userRepo.findById(userId);
	}

}
