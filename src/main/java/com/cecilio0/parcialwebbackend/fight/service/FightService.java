package com.cecilio0.parcialwebbackend.fight.service;

import com.cecilio0.parcialwebbackend.exception.NotFoundException;
import com.cecilio0.parcialwebbackend.fight.IFightRepository;
import com.cecilio0.parcialwebbackend.fight.model.Fight;
import com.cecilio0.parcialwebbackend.fight.model.request.FightResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FightService implements IFightService{
	@Autowired
	private final IFightRepository fightRepository;
	
	@Override
	public List<FightResponse> findAll() {
		return fightRepository.findAll().stream().
				map(FightResponse::parseFight)
				.collect(Collectors.toList());
	}
	
	@Override
	public FightResponse findById(Long id) {
		return FightResponse.parseFight(
				fightRepository.findById(id).orElseThrow(
						() -> new NotFoundException("The id provided does not belong to a fight")));
	}
	
	@Override
	public List<FightResponse> findByFighterName(String name) {
		
		return fightRepository.findByFighterName(name).stream()
				.map(FightResponse::parseFight)
				.collect(Collectors.toList());
	}
	
	@Override
	public FightResponse save(Fight request) {
		return FightResponse.parseFight(fightRepository.save(request));
	}
}
