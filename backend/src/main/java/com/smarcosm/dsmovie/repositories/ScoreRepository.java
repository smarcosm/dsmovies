package com.smarcosm.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smarcosm.dsmovie.entities.Score;
import com.smarcosm.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
	
}
