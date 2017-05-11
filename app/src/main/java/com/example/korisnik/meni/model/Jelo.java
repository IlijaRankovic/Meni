package com.example.korisnik.meni.model;

/**
 * Created by Korisnik on 11.5.2017..
 */

public class Jelo {

    private int id;
    private String image;
    private String naziv;
    private String opis;
    private float kalorijskaVrednost;
    private float cena;
    private Kategorija kategorija;
    private Sastojci sastojci;

    public Jelo(){}

    public Jelo(int id, String image, String naziv, String opis, float kalorijskaVrednost, float cena, Kategorija kategorija, Sastojci sastojci){
        this.id = id;
        this.image = image;
        this.naziv = naziv;
        this.opis = opis;
        this.kalorijskaVrednost = kalorijskaVrednost;
        this.cena = cena;
        this.kategorija = kategorija;
        this.sastojci = sastojci;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public float getKalorijskaVrednost() {
        return kalorijskaVrednost;
    }

    public void setKalorijskaVrednost(float kalorijskaVrednost) {
        this.kalorijskaVrednost = kalorijskaVrednost;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public Kategorija getKategorija() {
        return kategorija;
    }

    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
    }

    public Sastojci getSastojci() {
        return sastojci;
    }

    public void setSastojci(Sastojci sastojci) {
        this.sastojci = sastojci;
    }

    @Override
    public String toString() {
        return naziv;
    }
}
