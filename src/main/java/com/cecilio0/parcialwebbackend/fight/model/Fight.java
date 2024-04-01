package com.cecilio0.parcialwebbackend.fight.model;

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
@Table(name = "fights")
public class Fight {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_fight;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_winner")
	@JsonManagedReference
	@NotNull
	private Fighter winner;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_loser")
	@JsonManagedReference
	@NotNull
	private Fighter loser;
	
}
