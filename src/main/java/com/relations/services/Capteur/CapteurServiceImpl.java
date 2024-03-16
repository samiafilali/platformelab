package com.relations.services.Capteur;

import com.relations.model.Capteur;
import com.relations.repo.CapteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CapteurServiceImpl implements CapteurService {

    private final CapteurRepository capteurRepository;

    @Autowired
    public CapteurServiceImpl(CapteurRepository capteurRepository) {
        this.capteurRepository = capteurRepository;
    }

    @Override
    public List<Capteur> getAllCapteurs() {
        return capteurRepository.findAll();
    }

    @Override
    public Optional<Capteur> getCapteurById(int id) {
        return capteurRepository.findById(id);
    }

    @Override
    public Capteur saveCapteur(Capteur capteur) {
        return capteurRepository.save(capteur);
    }

    @Override
    public void deleteCapteur(int id) {
        capteurRepository.deleteById(id);
    }

}