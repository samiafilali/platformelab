package com.relations.controller;

import com.relations.model.Alerte;
import com.relations.services.Alerte.AlerteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AlerteController {

    @Autowired
    private AlerteService alerteService;

    @GetMapping("/alertes")
    public List<Alerte> getAllAlertes() {
        return alerteService.getAllAlertes();
    }

    @GetMapping("/alerte/{id}")
    public Optional<Alerte> getAlerteById(@PathVariable int id) {
        return alerteService.getAlerteById(id);
    }

    @PostMapping("/alerte")
    public Alerte saveAlerte(@RequestBody Alerte alerte) {
        return alerteService.saveAlerte(alerte);
    }

    @DeleteMapping("/alerte/{id}")
    public void deleteAlerte(@PathVariable int id) {
        alerteService.deleteAlerte(id);
    }
}