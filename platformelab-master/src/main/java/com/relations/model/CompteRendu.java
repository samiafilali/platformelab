package com.relations.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Entity
@Data
public class CompteRendu  {
	@Id
	private int id;
	
private String texte;
@ManyToOne(optional = false,fetch = FetchType.LAZY)
@JsonIgnoreProperties("compteRendus")
private Utilisateur technicien;
@MapsId
@OneToOne
@JoinColumn(name = "id")
@JsonIgnoreProperties("compteRendus")
private Alerte alerte;
}
