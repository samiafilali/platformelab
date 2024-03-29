package com.relations.services.Utilisateur;


import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.relations.model.Utilisateur;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class UtilisateurInfoDetails implements UserDetails {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Utilisateur utilisateur;
	String userName=null;
    String password = null;
    List<GrantedAuthority> authorities;

	

    public UtilisateurInfoDetails(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        String role = utilisateur.getGrades().toString();
        return Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + role));
    }




	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
