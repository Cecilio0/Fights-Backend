package com.cecilio0.parcialwebbackend.baseclass;

import com.cecilio0.parcialwebbackend.baseclass.model.BaseClass;
import com.cecilio0.parcialwebbackend.baseclass.service.IBaseClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/baseClass")
public class BaseClassController {
	@Autowired
	private final IBaseClassService baseClassService;
	
	@GetMapping("/find")
	public ResponseEntity<List<BaseClass>> findAll() {
		return ResponseEntity.ok(baseClassService.findAll());
	}
	
	@GetMapping("/find/id/{id}")
	public ResponseEntity<BaseClass> findById(@PathVariable Long id) {
		return ResponseEntity.ok(baseClassService.findById(id));
	}
	
}
