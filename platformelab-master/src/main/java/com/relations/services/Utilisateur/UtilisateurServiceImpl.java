package com.relations.services.Utilisateur;
import com.relations.model.Utilisateur;
import com.relations.repo.UtilisateurRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurServiceImpl implements UserDetailsService, UtilisateurService {
    
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
    @Override
	public Utilisateur getOneUtilisateur(String email) {
		return UtilisateurRepository.findByEmail(email).orElse(null);
	
	}
	
    @Override
	public Utilisateur addUtilisateur(Utilisateur utilisateur) {
		utilisateur.setMotDePasse(passwordEncoder.encode(utilisateur.getMotDePasse()));
		return utilisateurRepository.save(utilisateur);
	}
    
    @Override
    public List<Utilisateur> getAllUsers() {
    	return utilisateurRepository.findAll();
    }
	
    @Override
    public Utilisateur getUtilisateur(int id) {
    	return utilisateurRepository.findById(id).orElse(null);
    	
    }

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}	
}
