package com.smarcosm.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smarcosm.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);


}
