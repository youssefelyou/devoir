package com.example.devoir.repository;

import com.example.devoir.bean.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface AuteurRepository extends JpaRepository<Auteur,Integer> {

    Auteur findByCin(String cin);
    Auteur findByDateNaissance(Date dateNaissance);
    Auteur findById(int id);
}
