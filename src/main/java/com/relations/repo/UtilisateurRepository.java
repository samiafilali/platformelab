package com.relations.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
 
}
