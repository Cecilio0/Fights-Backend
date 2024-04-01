package com.cecilio0.parcialwebbackend.turn.model.request;

import com.cecilio0.parcialwebbackend.fighter.model.request.FighterMinimalResponse;
import com.cecilio0.parcialwebbackend.turn.model.Turn;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TurnMinimalResponse {
	private Long id_turn;
	private Integer damage;
	private String info;
	private FighterMinimalResponse fighter;
	
	public static TurnMinimalResponse parseTurn(Turn turn){
		return TurnMinimalResponse.builder()
				.id_turn(turn.getId_turn())
				.damage(turn.getDamage())
				.info(turn.getInfo())
				.fighter(FighterMinimalResponse.parseFighter(turn.getFighter()))
				.build();
	}
}
