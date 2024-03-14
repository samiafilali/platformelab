package com.relations.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Entity
@Data
public class Refrigerateur  extends BaseEntity{
	@Column(unique = true)
	private String label;
	
	String emplacement;
	private int temperatureMax, temperatureMin;
	@ManyToMany(mappedBy = "refrigerateurs")
	@JsonIgnoreProperties("refrigerateurs")
	private List<Alerte> alertes;
	
	@OneToOne(mappedBy = "refrigerateur")
	@JsonIgnoreProperties("refrigerateur")

	private Capteur capteur;
}