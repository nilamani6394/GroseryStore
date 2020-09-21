package com.main.GroseryStore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.GroseryStore.modeldata.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	 User findByUsername(String username);

}
