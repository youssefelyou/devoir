package com.example.devoir.repository;

import com.example.devoir.bean.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface LivreRepository extends JpaRepository<Livre,Integer> {

    Livre findByIsbn(String isbn);
    List<Livre> findLivreBetweenDates(Date start, Date end);
    Livre findById(int id);
}
