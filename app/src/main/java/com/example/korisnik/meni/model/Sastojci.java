package com.example.korisnik.meni.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Korisnik on 11.5.2017..
 */

public class Sastojci {

    private int id;
    private String naziv;
    private List<Jelo> jela;

    public Sastojci(){

        jela = new ArrayList<>();
    }

    public Sastojci(int id, String naziv){

        this.id = id;
        this.naziv = naziv;
        jela = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Jelo> getJela() {
        return jela;
    }

    public void setJela(List<Jelo> jela) {
        this.jela = jela;
    }
}
