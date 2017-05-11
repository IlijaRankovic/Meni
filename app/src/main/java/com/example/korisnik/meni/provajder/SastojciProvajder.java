package com.example.korisnik.meni.provajder;

import com.example.korisnik.meni.model.Sastojci;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Korisnik on 11.5.2017..
 */

public class SastojciProvajder {

    public static List<Sastojci> getSastojke(){

        List<Sastojci> sastojke = new ArrayList<>();
        sastojke.add(new Sastojci(0, "Mleveno meso, so, biber..."));
        sastojke.add(new Sastojci(1, "Jagnjece meso, so..."));
        sastojke.add(new Sastojci(2, "Teletina, sargarepa, so, biber, voda..."));
        sastojke.add(new Sastojci(3, "Kolenica, so, biber..."));
        sastojke.add(new Sastojci(4, "Losos, pirinac, so, biber..."));
        return sastojke;
    }

    public static List<String> getSastojciNazivi(){

        List<String> nazivi = new ArrayList<>();
        nazivi.add("Mleveno meso, so, biber...");
        nazivi.add("Jagnjece meso, so...");
        nazivi.add("Teletina, sargarepa, so, biber, voda...");
        nazivi.add("Kolenica, so, biber...");
        nazivi.add("Losos, pirinac, so, biber...");
        return nazivi;
    }

    public static Sastojci getSastojciById(int id){
        switch (id){
            case 0:
                return new Sastojci(0, "Mleveno meso, so, biber...");
            case 1:
                return new Sastojci(1, "Jagnjece meso, so...");
            case 2:
                return new Sastojci(2, "Teletina, sargarepa, so, biber, voda...");
            case 3:
                return new Sastojci(3, "Kolenica, so, biber...");
            case 4:
                return new Sastojci(4, "Losos, pirinac, so, biber...");
            default:
                return null;
        }
    }
}
