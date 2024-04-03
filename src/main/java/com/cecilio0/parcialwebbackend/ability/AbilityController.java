package com.cecilio0.parcialwebbackend.ability;

import com.cecilio0.parcialwebbackend.ability.model.Ability;
import com.cecilio0.parcialwebbackend.ability.model.request.AbilityPutRequest;
import com.cecilio0.parcialwebbackend.ability.service.IAbilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/abilities")
public class AbilityController {
	@Autowired
	private final IAbilityService abilityService;
	
	@GetMapping("/find")
	public ResponseEntity<List<Ability>> findAll() {
		return ResponseEntity.ok(abilityService.findAll());
	}
	
	@GetMapping("/find/id/{id}")
	public ResponseEntity<Ability> findById(@PathVariable Long id){
		return ResponseEntity.ok(abilityService.findById(id));
	}
	
	@PostMapping("/save")
	public ResponseEntity<Ability> save(@RequestBody Ability request){
		return new ResponseEntity<>(abilityService.save(request), HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Ability> update(@RequestBody AbilityPutRequest request, @PathVariable Long id){
		return ResponseEntity.ok(abilityService.update(request, id));
	}
}
