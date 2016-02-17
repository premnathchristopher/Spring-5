package com.mindfire.carreview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindfire.carreview.domain.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails,Long>{
	
	public List<UserDetails> findByUsername(String username);
	public List<UserDetails> findByEmail(String email);
	
	

}