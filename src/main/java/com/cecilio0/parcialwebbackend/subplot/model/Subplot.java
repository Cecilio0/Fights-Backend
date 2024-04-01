package com.cecilio0.parcialwebbackend.subplot.model;

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
@Table(name = "subplots")
public class Subplot {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_subplot;
	
	@Column(columnDefinition = "TEXT")
	@NotNull
	private String info;
	
	@ManyToMany(mappedBy = "subplots")
	@JsonBackReference(value = "fighter_subplot")
	private List<Fighter> fighters;
}
