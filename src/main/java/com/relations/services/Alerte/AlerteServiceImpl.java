package com.relations.services.Alerte;

import com.relations.model.Alerte;
import com.relations.repo.AlerteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AlerteServiceImpl implements AlerteService {

    private final AlerteRepository alerteRepository;

    @Autowired
    public AlerteServiceImpl(AlerteRepository alerteRepository) {
        this.alerteRepository = alerteRepository;
    }

    @Override
    public List<Alerte> getAllAlertes() {
        return alerteRepository.findAll();
    }

    @Override
    public Optional<Alerte> getAlerteById(int id) {
        return alerteRepository.findById(id);
    }

    @Override
    public Alerte saveAlerte(Alerte alerte) {
        return alerteRepository.save(alerte);
    }

    @Override
    public void deleteAlerte(int id) {
        alerteRepository.deleteById(id);
    }

    
}