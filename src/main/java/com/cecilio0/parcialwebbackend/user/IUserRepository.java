package com.cecilio0.parcialwebbackend.user;

import com.cecilio0.parcialwebbackend.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface IUserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByUsername(String username);
}
