package com.main.GroseryStore.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.main.GroseryStore.modeldata.Admin;
import com.main.GroseryStore.modeldata.User;
import com.main.GroseryStore.repo.AdminRepository;
import com.main.GroseryStore.repo.UserRepository;




public class UserRepositoryUserDetailsService implements UserDetailsService {
	
	@Autowired
    private UserRepository userRepo;

    @Autowired
    private AdminRepository adminRepo;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByUsername(username);
        Admin admin = adminRepo.findByUsername(username);

        if (user != null) {
            return user;
        }

        if (admin != null) {
            return admin;
        }

        throw new UsernameNotFoundException("User: " + username + " not found!");
	}

}
