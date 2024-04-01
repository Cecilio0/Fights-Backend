package com.cecilio0.parcialwebbackend.fight.model.request;

import com.cecilio0.parcialwebbackend.fight.model.Fight;
import com.cecilio0.parcialwebbackend.fighter.model.request.FighterMinimalResponse;
import com.cecilio0.parcialwebbackend.turn.model.Turn;
import com.cecilio0.parcialwebbackend.turn.model.request.TurnMinimalResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FightResponse {
	private Long id_fight;
	private FighterMinimalResponse winner;
	private FighterMinimalResponse loser;
	private List<TurnMinimalResponse> turns;
	
	public static FightResponse parseFight(Fight fight){
		return FightResponse.builder()
				.id_fight(fight.getId_fight())
				.winner(FighterMinimalResponse.parseFighter(fight.getWinner()))
				.loser(FighterMinimalResponse.parseFighter(fight.getLoser()))
				.turns(fight.getTurns().stream()
						.map(TurnMinimalResponse::parseTurn)
						.sorted((turnA, turnB) -> Math.toIntExact((Long) (turnA.getId_turn() - turnB.getId_turn())))
						.collect(Collectors.toList()))
				.build();
	}
}
