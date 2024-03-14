package com.relations.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Entity
@Data
public class Capteur  {
	@Id
	private int id;
	
	private float valeur;
	private String type;
	@MapsId
	@OneToOne
	@JoinColumn(name = "id")
	@JsonIgnoreProperties("capteur")
	private Refrigerateur refrigerateur;
}
