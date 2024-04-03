package com.cecilio0.parcialwebbackend.fight;

import com.cecilio0.parcialwebbackend.fight.model.Fight;
import com.cecilio0.parcialwebbackend.fight.model.request.FightResponse;
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
	public ResponseEntity<List<FightResponse>> findAll(@RequestParam(name = "fighterName", required = false) String name){
		
		return ResponseEntity.ok((name == null)? fightService.findAll(): fightService.findByFighterName(name));
	}
	
	@GetMapping("/find/id/{id}")
	public ResponseEntity<FightResponse> findById(@PathVariable Long id){
		return ResponseEntity.ok(fightService.findById(id));
	}
	
	@PostMapping("/save")
	public ResponseEntity<FightResponse> save(@RequestBody Fight request){
		return new ResponseEntity<>(fightService.save(request), HttpStatus.CREATED);
	}
}
