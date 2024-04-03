package com.cecilio0.parcialwebbackend.ability;

import com.cecilio0.parcialwebbackend.ability.model.Ability;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAblilityRepository extends JpaRepository<Ability, Long> {
}
