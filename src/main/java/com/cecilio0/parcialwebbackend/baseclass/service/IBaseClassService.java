package com.cecilio0.parcialwebbackend.baseclass.service;

import com.cecilio0.parcialwebbackend.baseclass.model.BaseClass;

import java.util.List;

public interface IBaseClassService {
	List<BaseClass> findAll();
	BaseClass findById(Long id);
}
