package com.cecilio0.parcialwebbackend.user;

import com.cecilio0.parcialwebbackend.user.model.request.UserAuthenticationRequest;
import com.cecilio0.parcialwebbackend.user.model.request.UserAuthenticationResponse;
import com.cecilio0.parcialwebbackend.user.model.request.UserRegisterRequest;
import com.cecilio0.parcialwebbackend.user.model.request.UserRegisterResponse;
import com.cecilio0.parcialwebbackend.user.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private final IUserService us;
	
	@PostMapping("/register")
	public ResponseEntity<UserRegisterResponse> register(
			@RequestBody UserRegisterRequest request
	) {
		return new ResponseEntity<>(us.register(request), HttpStatus.CREATED);
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<UserAuthenticationResponse> authenticate(
			@RequestBody UserAuthenticationRequest request
	) {
		return new ResponseEntity<>(us.authenticate(request), HttpStatus.OK);
	}
}
