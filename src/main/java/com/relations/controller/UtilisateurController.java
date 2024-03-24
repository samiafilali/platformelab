package com.relations.controller;

import com.relations.model.Utilisateur;
import com.relations.services.Utilisateur.UtilisateurService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping("/utilisateurs")
    @PreAuthorize("hasAuthority('ADMIN_ROLES')")
    public ResponseEntity<List<Utilisateur>> getAllUtilisateurs() {
        return ResponseEntity.ok(utilisateurService.getAllUsers());
    }

    @GetMapping("/utilisateur/{id}")
    @PreAuthorize("hasAuthority('USER_ROLES')")
    public ResponseEntity<Utilisateur> getUtilisateur(@PathVariable int id) {
        Utilisateur utilisateur = utilisateurService.getUtilisateur(id);
        if (utilisateur != null) {
            return ResponseEntity.ok(utilisateur);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping("/utilisateur")
    //@PreAuthorize("hasAuthority('ADMIN_ROLES')")
    public ResponseEntity<Utilisateur> addUtilisateur(@RequestBody Utilisateur utilisateur) {
        return ResponseEntity.ok(utilisateurService.addUtilisateur(utilisateur));
    }

    @GetMapping("/utilisateur/{email}")
    @PreAuthorize("hasAuthority('USER_ROLES')")
    public ResponseEntity<Utilisateur> getOneUtilisateur(@PathVariable String email) {
        Utilisateur utilisateur = utilisateurService.getOneUtilisateur(email);
        if (utilisateur != null) {
            return ResponseEntity.ok(utilisateur);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}