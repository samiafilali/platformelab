package com.relations.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	@NotBlank
	private String nom;
	@Column(nullable = false,unique = true)
	private String email;
	@Column(nullable = false)
	private String  motDePasse;
	@Column(nullable = false,unique = true)

	private String numTelephone;
	@Enumerated(EnumType.STRING)
	private Grades grades;
	@OneToMany(mappedBy = "technicien")
	@JsonIgnoreProperties("technicien")
	private List<CompteRendu> compteRendus;

}

