package com.cecilio0.parcialwebbackend.fight;

import com.cecilio0.parcialwebbackend.fight.model.Fight;
import com.cecilio0.parcialwebbackend.fight.model.request.FightResponse;
import com.cecilio0.parcialwebbackend.fight.model.request.FightSaveRequest;
import com.cecilio0.parcialwebbackend.fight.service.IFightService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/fights")
public class FightController {
	@Autowired
	private final IFightService fightService;
	
	@GetMapping("/find")
	public ResponseEntity<List<FightResponse>> findAll(){
		return ResponseEntity.ok(fightService.findAll());
	}
	
	@GetMapping("/find/id/{id}")
	public ResponseEntity<FightResponse> findById(@PathVariable Long id){
		return ResponseEntity.ok(fightService.findById(id));
	}
	
	@GetMapping("/find/fighter")
	public ResponseEntity<List<FightResponse>> findByFighterName(@RequestParam(name = "name", required = true) String name){
		return ResponseEntity.ok(fightService.findByFighterName(name));
	}
	
	@PostMapping("/save")
	public ResponseEntity<Fight> save(@RequestBody Fight request){
		return new ResponseEntity<Fight>(fightService.save(request), HttpStatus.CREATED);
	}
}
