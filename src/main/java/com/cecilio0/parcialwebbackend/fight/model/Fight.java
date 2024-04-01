package com.cecilio0.parcialwebbackend.fight.model;

import com.cecilio0.parcialwebbackend.fighter.model.Fighter;
import com.cecilio0.parcialwebbackend.turn.model.Turn;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_winner")
	@NotNull
	private Fighter winner;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_loser")
	@NotNull
	private Fighter loser;
	
	@OneToMany(mappedBy = "fight", cascade = CascadeType.ALL)
	private List<Turn> turns;
}
