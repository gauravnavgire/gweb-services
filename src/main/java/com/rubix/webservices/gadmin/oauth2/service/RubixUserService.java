package com.rubix.webservices.gadmin.oauth2.service;


import com.rubix.webservices.gadmin.user.service.model.UserModel;



public interface RubixUserService {




  public UserModel findByUserName(String userName);

	public UserModel findUserById(Long userId);

}
