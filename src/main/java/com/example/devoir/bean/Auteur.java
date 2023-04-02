package com.example.devoir.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Auteur extends Personne{
    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinTable(
            name = "auteur_livre",
            joinColumns = @JoinColumn(name = "auteur_id"),
            inverseJoinColumns = @JoinColumn(name = "livre_id"))
    List<Livre> livreList;

    public List<Livre> getLivreList() {
        return livreList;
    }

    public void setLivreList(List<Livre> livreList) {
        this.livreList = livreList;
    }

    public Auteur() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
