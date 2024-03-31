package com.cecilio0.parcialwebbackend.fighter.model;

import com.cecilio0.parcialwebbackend.ability.model.Ability;
import com.cecilio0.parcialwebbackend.baseclass.model.BaseClass;
import com.cecilio0.parcialwebbackend.subplot.model.Subplot;
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
	@JsonManagedReference // This annotation means that this relationship can only be seen on this side
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
	@JsonManagedReference
	private List<Ability> abilities;
	
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(
			name = "fighters_subplots",
			joinColumns = { @JoinColumn(name = "id_fighter") },
			inverseJoinColumns = { @JoinColumn(name = "id_subplot") }
	)
	@JsonManagedReference
	private List<Subplot> subplots;
}
