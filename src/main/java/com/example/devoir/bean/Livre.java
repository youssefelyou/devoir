package com.example.devoir.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String isbn;
    private String titre;
    @Temporal(TemporalType.DATE)
    private Date dateEdition;

    @ManyToMany(mappedBy = "livreList",fetch = FetchType.EAGER)
    @JsonIgnore
    List<Auteur> auteurList;

    public List<Auteur> getAuteurList() {
        return auteurList;
    }

    public void setAuteurList(List<Auteur> auteurList) {
        this.auteurList = auteurList;
    }

    public Livre() {
        super();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDateEdition() {
        return dateEdition;
    }

    public void setDateEdition(Date dateEdition) {
        this.dateEdition = dateEdition;
    }
}
