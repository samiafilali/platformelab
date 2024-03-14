
package com.relations.model.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CompteRenduDTO {
  private int id;

  @NotBlank(message = "Le compte rendu est obligatoire")
  private String texte;
  
  
  @NotNull(message = "Le technicien responsable du compte rendu doit être spécifié")
  private Long technicienId;

  @NotNull(message = "L'alerte associée au compte rendu doit être spécifiée")
  private Long alerteId;
}
