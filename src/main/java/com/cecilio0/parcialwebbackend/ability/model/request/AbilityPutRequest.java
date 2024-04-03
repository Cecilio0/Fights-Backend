package com.cecilio0.parcialwebbackend.ability.model.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AbilityPutRequest {
	@NotNull
	private String name;
	
	@NotNull
	@Range(min = 0L, max = 100L)
	private Integer power;
}
