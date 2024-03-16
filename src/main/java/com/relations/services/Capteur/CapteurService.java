package com.relations.services.Capteur;

import com.relations.model.Capteur;
import java.util.List;
import java.util.Optional;

public interface CapteurService {
    List<Capteur> getAllCapteurs();
    Optional<Capteur> getCapteurById(int id);
    Capteur saveCapteur(Capteur capteur);
    void deleteCapteur(int id);
}