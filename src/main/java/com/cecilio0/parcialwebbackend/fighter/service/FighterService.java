package com.cecilio0.parcialwebbackend.fighter.service;

import com.cecilio0.parcialwebbackend.ability.model.Ability;
import com.cecilio0.parcialwebbackend.baseclass.model.BaseClass;
import com.cecilio0.parcialwebbackend.exception.NotFoundException;
import com.cecilio0.parcialwebbackend.fighter.IFighterRepository;
import com.cecilio0.parcialwebbackend.fighter.model.Fighter;
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
//		return Fighter.builder()
//				.name(request.getName())
//				.biography(request.getBiography())
//				.baseClass(BaseClass.builder()
//						.id_base_class(request.getBaseClass().getId_base_class())
//						.build()
//				)
//				.hp(request.getHp())
//				.strength(request.getStrength())
//				.dexterity(request.getDexterity())
//				.constitution(request.getConstitution())
//				.intelligence(request.getIntelligence())
//				.wisdom(request.getWisdom())
//				.charisma(request.getCharisma())
//				.abilities(request.getAbilities().stream()
//						.map(ability -> Ability.builder().id_ability(ability.getId_ability()).build())
//						.collect(Collectors.toList()))
//				.build();
		
		return fighterRepository.save(request);
	}
}

