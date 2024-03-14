package com.relations.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Entity
@Data
public class Alerte extends BaseEntity {
	private String type;
	String status;
	@ManyToMany(cascade = {CascadeType.PERSIST,
			CascadeType.MERGE})
	@JsonIgnoreProperties("alertes")

	List<Refrigerateur> refrigerateurs;
	@OneToOne(mappedBy = "alerte")
	@JsonIgnoreProperties("alerte")
	CompteRendu compteRendu;
	
}
