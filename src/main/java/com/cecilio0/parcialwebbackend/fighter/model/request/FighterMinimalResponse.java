package com.cecilio0.parcialwebbackend.fighter.model.request;

import com.cecilio0.parcialwebbackend.fighter.model.Fighter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FighterMinimalResponse {
	private Long id_fighter;
	private String name;
	
	public static FighterMinimalResponse parseFighter(Fighter fighter){
		return FighterMinimalResponse.builder()
				.id_fighter(fighter.getId_fighter())
				.name(fighter.getName())
				.build();
	}
}
