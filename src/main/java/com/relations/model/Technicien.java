package com.relations.model;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
@Entity
@Data
@DiscriminatorValue("technicien")
public class Technicien extends Utilisateur {}
