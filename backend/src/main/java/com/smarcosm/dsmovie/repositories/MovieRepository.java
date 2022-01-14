package com.smarcosm.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smarcosm.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
