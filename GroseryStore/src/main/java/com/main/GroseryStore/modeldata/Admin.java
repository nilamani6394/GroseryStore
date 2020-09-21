package com.main.GroseryStore.modeldata;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Entity
@Table(name = "admin")
@Data
public class Admin implements UserDetails{
	  private static final long serialVersionUID = 2l;

	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int id;

	    private String username;

	    private String password;

		public Collection<? extends GrantedAuthority> getAuthorities() {
			// TODO Auto-generated method stub
			return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
		}

		public boolean isAccountNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}

		public boolean isAccountNonLocked() {
			// TODO Auto-generated method stub
			return true;
		}

		public boolean isCredentialsNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}

		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return true;
		}

	   

}
