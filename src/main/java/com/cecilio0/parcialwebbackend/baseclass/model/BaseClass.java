package com.cecilio0.parcialwebbackend.baseclass.model;

import com.cecilio0.parcialwebbackend.fighter.model.Fighter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "base_classes")
public class BaseClass {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_base_class;
	
	@Column(unique = true)
	@NotNull
	private String name;
	
	@Column
	@NotNull
	private String mainAttribute;
	
	@Column
	@NotNull
	private String secondaryAttribute;
	
	@OneToMany(mappedBy = "baseClass", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
	List<Fighter> fighters;
}
