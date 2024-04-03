package com.cecilio0.parcialwebbackend.ability.service;

import com.cecilio0.parcialwebbackend.ability.model.Ability;

import java.util.List;

public interface IAbilityService {
	List<Ability> findAll();
	Ability findById(Long id);
	Ability save(Ability request);
}
