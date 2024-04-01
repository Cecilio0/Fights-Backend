package com.cecilio0.parcialwebbackend.fighter.service;

import com.cecilio0.parcialwebbackend.exception.NotFoundException;
import com.cecilio0.parcialwebbackend.fighter.IFighterRepository;
import com.cecilio0.parcialwebbackend.fighter.model.Fighter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FighterService implements IFighterService{
	@Autowired
	private final IFighterRepository fighterRepository;
	
	@Override
	public List<Fighter> findAll() {
		return fighterRepository.findAll();
	}
	
	@Override
	public Fighter findById(Long id) {
		return fighterRepository.findById(id).orElseThrow(() -> new NotFoundException("The id provided does not belong to a fighter"));
	}
	
	@Override
	public Fighter findByName(String name) {
		return fighterRepository.findByName(name).orElseThrow(() -> new NotFoundException("The name provided does not belong to a fighter"));
	}
	
	@Override
	public List<String> findFighterNames() {
		return fighterRepository.findFighterNames();
	}
}

