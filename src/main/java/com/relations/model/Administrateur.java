package com.relations.model;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
@Entity
@Data
@DiscriminatorValue("administrateur")
public class Administrateur extends Technicien {	
}
