package com.cecilio0.parcialwebbackend.user.service;

import com.cecilio0.parcialwebbackend.user.model.request.UserAuthenticationRequest;
import com.cecilio0.parcialwebbackend.user.model.request.UserAuthenticationResponse;
import com.cecilio0.parcialwebbackend.user.model.request.UserRegisterRequest;
import com.cecilio0.parcialwebbackend.user.model.request.UserRegisterResponse;

public interface IUserService {
	UserRegisterResponse register(UserRegisterRequest request);
	
	UserAuthenticationResponse authenticate(UserAuthenticationRequest request);
}
