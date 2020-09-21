package com.main.GroseryStore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.GroseryStore.modeldata.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	Admin findByUsername(String username);
}
