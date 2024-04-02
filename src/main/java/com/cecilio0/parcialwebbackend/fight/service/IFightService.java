package com.cecilio0.parcialwebbackend.fight.service;

import com.cecilio0.parcialwebbackend.fight.model.Fight;
import com.cecilio0.parcialwebbackend.fight.model.request.FightResponse;
import com.cecilio0.parcialwebbackend.fight.model.request.FightSaveRequest;

import java.util.List;

public interface IFightService {
	List<FightResponse> findAll();
	FightResponse findById(Long id);
	List<FightResponse> findByFighterName(String name);
	FightResponse save(Fight request);
}
