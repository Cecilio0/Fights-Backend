package com.cecilio0.parcialwebbackend.baseclass.service;

import com.cecilio0.parcialwebbackend.baseclass.IBaseClassRepository;
import com.cecilio0.parcialwebbackend.baseclass.model.BaseClass;
import com.cecilio0.parcialwebbackend.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BaseClassService implements IBaseClassService{
	@Autowired
	private final IBaseClassRepository baseClassRepository;
	
	@Override
	public List<BaseClass> findAll() {
		return baseClassRepository.findAll();
	}
	
	@Override
	public BaseClass findById(Long id) {
		return baseClassRepository.findById(id).orElseThrow(() -> new NotFoundException("The id provided does not belong to a baseClass"));
	}
}
