package com.cecilio0.parcialwebbackend.fight.model.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FightSaveRequest {
	
	@NotNull
	private Long id_winner;
	
	@NotNull
	private Long id_loser;
	
}
