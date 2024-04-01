package com.cecilio0.parcialwebbackend.fighter;

import com.cecilio0.parcialwebbackend.fighter.model.Fighter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IFighterRepository extends JpaRepository<Fighter, Long> {
	
	// Custom Query for the findFighterNames method
	@Query(value = "SELECT f.name from fighters f", nativeQuery = true)
	List<String> findFighterNames();
	
	Optional<Fighter> findByName(String name);
}
