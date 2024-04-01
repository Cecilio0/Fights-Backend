package com.cecilio0.parcialwebbackend.turn.model;

import com.cecilio0.parcialwebbackend.fight.model.Fight;
import com.cecilio0.parcialwebbackend.fighter.model.Fighter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "turns")
public class Turn {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_turn;
	
	@Column
	@NotNull
	private Integer damage;
	
	@Column
	@NotNull
	private String info;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_fight")
	@NotNull
	private Fight fight;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_attacker")
	@NotNull
	private Fighter fighter;
}
