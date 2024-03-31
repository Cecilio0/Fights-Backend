package com.cecilio0.parcialwebbackend.ability.model;

import com.cecilio0.parcialwebbackend.fighter.model.Fighter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "abilities")
public class Ability {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_ability;
	
	@Column(unique = true)
	@NotNull
	private String name;
	
	@Column
	@Range(min = 0L, max = 30L)
	@NotNull
	private Integer power;
	
	@ManyToMany(mappedBy = "abilities")
	@JsonBackReference
	private List<Fighter> fighters;
}
