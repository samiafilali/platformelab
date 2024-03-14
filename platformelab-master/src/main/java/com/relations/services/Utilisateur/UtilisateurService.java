package com.relations.services.Utilisateur;
import java.util.List;
import com.relations.model.Utilisateur;
public interface UtilisateurService {
	public Utilisateur getOneUtilisateur (String email);
	public Utilisateur addUtilisateur (Utilisateur utilisateur);
	public List<Utilisateur> getAllUsers();
	public Utilisateur getUtilisateur (int id);	
}
