package com.cecilio0.parcialwebbackend.fighter.model;

import com.cecilio0.parcialwebbackend.ability.model.Ability;
import com.cecilio0.parcialwebbackend.baseclass.model.BaseClass;
import com.cecilio0.parcialwebbackend.fight.model.Fight;
import com.cecilio0.parcialwebbackend.subplot.model.Subplot;
import com.cecilio0.parcialwebbackend.turn.model.Turn;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
@Table(name = "fighters")
public class Fighter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_fighter;
	
	@Column(unique = true)
	@NotNull
	private String name;
	
	@Column(columnDefinition = "TEXT") // used to set data type to TEXT
	@NotNull
	private String biography;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_base_class")
	@JsonManagedReference(value = "fighter_class") // This annotation means that this relationship can only be seen on this side
	@NotNull
	private BaseClass baseClass;
	
	@Column
	@Range(min = 0L, max = 30L)
	@NotNull
	private Integer strength;
	
	@Column
	@Range(min = 0L, max = 30L)
	@NotNull
	private Integer dexterity;
	
	@Column
	@Range(min = 0L, max = 30L)
	@NotNull
	private Integer constitution;
	
	@Column
	@Range(min = 0L, max = 30L)
	@NotNull
	private Integer intelligence;
	
	@Column
	@Range(min = 0L, max = 30L)
	@NotNull
	private Integer wisdom;
	
	@Column
	@Range(min = 0L, max = 30L)
	@NotNull
	private Integer charisma;
	
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(
			name = "fighters_abilities",
			joinColumns = { @JoinColumn(name = "id_fighter") },
			inverseJoinColumns = { @JoinColumn(name = "id_ability") }
	)
	@JsonManagedReference(value = "fighter_ability")
	private List<Ability> abilities;
	
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(
			name = "fighters_subplots",
			joinColumns = { @JoinColumn(name = "id_fighter") },
			inverseJoinColumns = { @JoinColumn(name = "id_subplot") }
	)
	@JsonManagedReference(value = "fighter_subplot")
	private List<Subplot> subplots;
	
	@OneToMany(mappedBy = "winner", cascade = CascadeType.ALL)
	@JsonManagedReference(value = "fight_winner")
	private List<Fight> fightsWon;
	
	@OneToMany(mappedBy = "loser", cascade = CascadeType.ALL)
	@JsonManagedReference(value = "fight_loser")
	private List<Fight> fightsLost;
	
	@OneToMany(mappedBy = "fighter", cascade = CascadeType.ALL)
	@JsonManagedReference(value = "turn_attacker")
	private List<Turn> fighterTurns;
}
