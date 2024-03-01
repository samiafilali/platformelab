package com.relations.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Refrigerateur {
	@Id
	private String label, emplacement;
	private int temperatureMax, temperatureMin;
}