package com.cecilio0.parcialwebbackend.fighter.model.request;

import com.cecilio0.parcialwebbackend.ability.model.Ability;
import com.cecilio0.parcialwebbackend.baseclass.model.BaseClass;
import com.cecilio0.parcialwebbackend.subplot.model.Subplot;
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
public class FighterPutRequest {
	@NotNull
	private String name;
	
	@NotNull
	private String biography;
	
	@NotNull
	private BaseClass baseClass;
	
	@Range(min = 1L)
	@NotNull
	private Integer hp;
	
	@Range(min = 0L, max = 30L)
	@NotNull
	private Integer strength;
	
	@Range(min = 0L, max = 30L)
	@NotNull
	private Integer dexterity;
	
	@Range(min = 0L, max = 30L)
	@NotNull
	private Integer constitution;
	
	@Range(min = 0L, max = 30L)
	@NotNull
	private Integer intelligence;
	
	@Range(min = 0L, max = 30L)
	@NotNull
	private Integer wisdom;
	
	@Range(min = 0L, max = 30L)
	@NotNull
	private Integer charisma;
	
	private List<Ability> abilities;
	
	private List<Subplot> subplots;
}
