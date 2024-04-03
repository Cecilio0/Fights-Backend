package com.cecilio0.parcialwebbackend.fighter;

import com.cecilio0.parcialwebbackend.fighter.model.Fighter;
import com.cecilio0.parcialwebbackend.fighter.model.request.FighterPutRequest;
import com.cecilio0.parcialwebbackend.fighter.service.IFighterService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/fighters")
public class FighterController {
	
	@Autowired
	private final IFighterService fighterService;
	
	@GetMapping("/find")
	public ResponseEntity<List<Fighter>> findAll() {
		return ResponseEntity.ok(fighterService.findAll());
	}
	
	@GetMapping("/find/id/{id}")
	public ResponseEntity<Fighter> findById(@PathVariable Long id){
		return ResponseEntity.ok(fighterService.findById(id));
	}
	
	@GetMapping("/find/name/{name}")
	public ResponseEntity<Fighter> findById(@PathVariable String name){
		return ResponseEntity.ok(fighterService.findByName(name));
	}
	
	@GetMapping("/names")
	public ResponseEntity<List<String>> findFighterNames(){
		return ResponseEntity.ok(fighterService.findFighterNames());
	}
	
	@PostMapping("/save")
	public ResponseEntity<Fighter> save(@RequestBody Fighter fighter) {
		return new ResponseEntity<>(fighterService.save(fighter), HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Fighter> update(@RequestBody FighterPutRequest request, @PathVariable Long id){
		return ResponseEntity.ok(fighterService.update(request, id));
	}
}
