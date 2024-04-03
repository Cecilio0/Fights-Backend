package com.cecilio0.parcialwebbackend.ability.service;

import com.cecilio0.parcialwebbackend.ability.IAblilityRepository;
import com.cecilio0.parcialwebbackend.ability.model.Ability;
import com.cecilio0.parcialwebbackend.ability.model.request.AbilityPutRequest;
import com.cecilio0.parcialwebbackend.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AbilityService implements IAbilityService{
	@Autowired
	private final IAblilityRepository ablilityRepository;
	
	@Override
	public List<Ability> findAll() {
		return ablilityRepository.findAll();
	}
	
	@Override
	public Ability findById(Long id) {
		return ablilityRepository.findById(id).orElseThrow(() -> new NotFoundException("The id provided does not belong to an ability"));
	}
	
	@Override
	public Ability save(Ability request) {
		return ablilityRepository.save(request);
	}
	
	@Override
	public Ability update(AbilityPutRequest request, Long id) {
		Ability response = findById(id);
		
		response.setName(request.getName());
		response.setPower(request.getPower());
		
		return ablilityRepository.save(response);
	}
}
