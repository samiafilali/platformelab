package com.relations.services.Alerte;

import com.relations.model.Alerte;
import java.util.List;
import java.util.Optional;

public interface AlerteService {
    List<Alerte> getAllAlertes();
    Optional<Alerte> getAlerteById(int id);
    Alerte saveAlerte(Alerte alerte);
    void deleteAlerte(int id);
  
}
