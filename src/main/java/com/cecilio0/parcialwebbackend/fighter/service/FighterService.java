package com.cecilio0.parcialwebbackend.fighter.service;

import com.cecilio0.parcialwebbackend.ability.model.Ability;
import com.cecilio0.parcialwebbackend.baseclass.model.BaseClass;
import com.cecilio0.parcialwebbackend.exception.NotFoundException;
import com.cecilio0.parcialwebbackend.fighter.IFighterRepository;
import com.cecilio0.parcialwebbackend.fighter.model.Fighter;
import com.cecilio0.parcialwebbackend.fighter.model.request.FighterPutRequest;
import com.cecilio0.parcialwebbackend.subplot.model.Subplot;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
	
	@Override
	public Fighter save(Fighter request) {
		return fighterRepository.save(request);
	}
	
	@Override
	public Fighter update(FighterPutRequest request, Long id) {
		Fighter response = findById(id);
		
		response.setName(request.getName());
		response.setBiography(request.getBiography());
		response.setBaseClass(request.getBaseClass());
		response.setHp(request.getHp());
		response.setStrength(request.getStrength());
		response.setDexterity(request.getDexterity());
		response.setConstitution(request.getConstitution());
		response.setIntelligence(request.getIntelligence());
		response.setWisdom(request.getWisdom());
		response.setCharisma(request.getCharisma());
		response.setAbilities(request.getAbilities());
		response.setSubplots(request.getSubplots());
		
		return fighterRepository.save(response);
	}
}

