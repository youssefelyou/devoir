package com.example.devoir.service;

import com.example.devoir.bean.Auteur;
import com.example.devoir.bean.Personne;
import com.example.devoir.repository.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AuteurService {

    @Autowired
    private AuteurRepository auteurRepository;

    public Auteur findByCin(String cin) {
        return auteurRepository.findByCin(cin);
    }

    public List<Auteur> findAll() {
        return auteurRepository.findAll();
    }

    public Auteur save(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    public Optional<Auteur> findById(Integer integer) {
        return auteurRepository.findById(integer);
    }

    @Transactional
    public void deleteById(Integer integer) {
        auteurRepository.deleteById(integer);
    }

    public Auteur findByDateNaissance(Date dateNaissance) {
        return auteurRepository.findByDateNaissance(dateNaissance);
    }
}
