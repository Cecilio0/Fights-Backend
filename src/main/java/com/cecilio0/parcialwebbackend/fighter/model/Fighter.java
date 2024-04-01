package com.cecilio0.parcialwebbackend.fighter.model;

import com.cecilio0.parcialwebbackend.ability.model.Ability;
import com.cecilio0.parcialwebbackend.baseclass.model.BaseClass;
import com.cecilio0.parcialwebbackend.fight.model.Fight;
import com.cecilio0.parcialwebbackend.subplot.model.Subplot;
import com.cecilio0.parcialwebbackend.turn.model.Turn;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_base_class")
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
	
	@ManyToMany(cascade = { CascadeType.MERGE })
	@JoinTable(
			name = "fighters_abilities",
			joinColumns = { @JoinColumn(name = "id_fighter") },
			inverseJoinColumns = { @JoinColumn(name = "id_ability") }
	)
	private List<Ability> abilities;
	
	@ManyToMany(cascade = { CascadeType.MERGE })
	@JoinTable(
			name = "fighters_subplots",
			joinColumns = { @JoinColumn(name = "id_fighter") },
			inverseJoinColumns = { @JoinColumn(name = "id_subplot") }
	)
	private List<Subplot> subplots;
	
	@OneToMany(mappedBy = "winner", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Fight> fightsWon;
	
	@OneToMany(mappedBy = "loser", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Fight> fightsLost;
	
	@OneToMany(mappedBy = "fighter", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Turn> fighterTurns;
}
