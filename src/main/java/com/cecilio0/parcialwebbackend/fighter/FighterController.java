package com.cecilio0.parcialwebbackend.fighter;

import com.cecilio0.parcialwebbackend.fighter.model.Fighter;
import com.cecilio0.parcialwebbackend.fighter.service.IFighterService;
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
@RequestMapping("/fighters")
public class FighterController {
	
	@Autowired
	private final IFighterService userService;
	
	@GetMapping("/find")
	public ResponseEntity<List<Fighter>> findAll() {
		return ResponseEntity.ok(userService.findAll());
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Fighter> findById(@PathVariable Long id){
		return ResponseEntity.ok(userService.findById(id));
	}
	
	@GetMapping("/names")
	public ResponseEntity<List<String>> findFighterNames(){
		return ResponseEntity.ok(userService.findFighterNames());
	}
	
}
