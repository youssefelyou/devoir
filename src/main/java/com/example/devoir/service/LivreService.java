package com.example.devoir.service;

import com.example.devoir.bean.Auteur;
import com.example.devoir.bean.Livre;
import com.example.devoir.repository.AuteurRepository;
import com.example.devoir.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class LivreService {

    @Autowired
    private LivreRepository livreRepository;
    @Autowired
    private AuteurRepository auteurRepository;

    public Livre findByIsbn(String isbn) {
        return livreRepository.findByIsbn(isbn);
    }

    public List<Livre> findAll() {
        return livreRepository.findAll();
    }

    public Livre save(Livre l) {
        return livreRepository.save(l);
    }

    public Livre findById(int id) {
        return livreRepository.findById(id);
    }

    @Transactional
    public void deleteById(Integer integer) {
        livreRepository.deleteById(integer);
    }

    public List<Livre> findLivreBetweenDates(Date start, Date end) {
        return livreRepository.findLivreBetweenDates(start, end);
    }

    public void affectation(int livreId,int auteurId){
        Livre l = livreRepository.findById(livreId);
        Auteur a = auteurRepository.findById(auteurId);
        a.getLivreList().add(l);
        auteurRepository.save(a);




    }
}
