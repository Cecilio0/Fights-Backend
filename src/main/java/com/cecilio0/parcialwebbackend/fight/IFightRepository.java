package com.cecilio0.parcialwebbackend.fight;

import com.cecilio0.parcialwebbackend.fight.model.Fight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IFightRepository extends JpaRepository<Fight, Long> {
	@Query(value = "SELECT \n" +
			"    fights.id_fight,\n" +
			"    fights.id_winner,\n" +
			"    fights.id_loser\n" +
			"FROM \n" +
			"    fights\n" +
			"LEFT JOIN \n" +
			"    fighters winners ON fights.id_winner = winners.id_fighter\n" +
			"LEFT JOIN \n" +
			"    fighters losers ON fights.id_loser = losers.id_fighter\n" +
			"WHERE\n" +
			"\twinners.name = :name OR losers.name = :name", nativeQuery = true)
	List<Fight> findByFighterName(@Param("name") String name);
	
}
