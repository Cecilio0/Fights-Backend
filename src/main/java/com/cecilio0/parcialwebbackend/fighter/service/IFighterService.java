package com.cecilio0.parcialwebbackend.fighter.service;

import com.cecilio0.parcialwebbackend.fighter.model.Fighter;

import java.util.List;

public interface IFighterService {
	List<Fighter> findAll();
	Fighter findById(Long id);
	List<String> findFighterNames();
}
