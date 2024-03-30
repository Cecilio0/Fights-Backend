package com.cecilio0.parcialwebbackend.user.service;

import com.cecilio0.parcialwebbackend.config.JwtService;
import com.cecilio0.parcialwebbackend.exception.ValueNotValidException;
import com.cecilio0.parcialwebbackend.user.IUserRepository;
import com.cecilio0.parcialwebbackend.user.model.Role;
import com.cecilio0.parcialwebbackend.user.model.User;
import com.cecilio0.parcialwebbackend.user.model.request.UserAuthenticationRequest;
import com.cecilio0.parcialwebbackend.user.model.request.UserAuthenticationResponse;
import com.cecilio0.parcialwebbackend.user.model.request.UserRegisterRequest;
import com.cecilio0.parcialwebbackend.user.model.request.UserRegisterResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {
	
	@Autowired
	private final IUserRepository ur;
	@Autowired
	private final PasswordEncoder passwordEncoder;
	@Autowired
	private final JwtService jwtService;
	@Autowired
	private final AuthenticationManager authenticationManager;
	
	@Override
	public UserRegisterResponse register(UserRegisterRequest request) {
		User verifyUniqueness = ur.findByUsername(request.getUsername().toLowerCase()).orElse(null);
		if(verifyUniqueness != null)
			throw new ValueNotValidException("The username provided is already registered");
		
		User user = User.builder()
				.username(request.getUsername().toLowerCase())
				.password(passwordEncoder.encode(request.getPassword()))
				.role(Role.ROLE_USER)
				.build();
		
		ur.save(user);
		
		return UserRegisterResponse.builder()
				.message("The user was registered correctly")
				.build();
	}
	
	@Override
	public UserAuthenticationResponse authenticate(UserAuthenticationRequest request) {
		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(
						request.getUsername().toLowerCase(),
						request.getPassword()
				)
		);
		
		User user = ur.findByUsername(request.getUsername().toLowerCase()).orElse(null);
		if(user == null)
			throw new ValueNotValidException("Bad credentials");
		
		
		String jwt = jwtService.generateToken(user);
		
		return UserAuthenticationResponse.builder()
				.token(jwt)
				.build();
	}
}
