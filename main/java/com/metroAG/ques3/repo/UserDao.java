package com.metroAG.ques3.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metroAG.ques3.entities.User;


public interface UserDao extends JpaRepository<User, Integer>{
	
}
