package com.cecilio0.parcialwebbackend.fighter.service;

import com.cecilio0.parcialwebbackend.fighter.model.Fighter;
import com.cecilio0.parcialwebbackend.fighter.model.request.FighterPutRequest;

import java.util.List;

public interface IFighterService {
	List<Fighter> findAll();
	Fighter findById(Long id);
	Fighter findByName(String name);
	List<String> findFighterNames();
	Fighter save(Fighter fighter);
	Fighter update(FighterPutRequest request, Long id);
}
