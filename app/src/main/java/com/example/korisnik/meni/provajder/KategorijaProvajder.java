package com.example.korisnik.meni.provajder;

import com.example.korisnik.meni.model.Kategorija;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Korisnik on 11.5.2017..
 */

public class KategorijaProvajder {

    public static List<Kategorija> getKategorije(){

        List<Kategorija> kategorije = new ArrayList<>();
        kategorije.add(new Kategorija(0, "Rostilj"));
        kategorije.add(new Kategorija(1, "Pecenje"));
        kategorije.add(new Kategorija(2, "Kuvano"));
        kategorije.add(new Kategorija(3, "Bareno"));
        kategorije.add(new Kategorija(4, "Zivo"));
        return kategorije;
    }

    public static List<String> getKategorijaNazivi(){

        List<String> nazivi = new ArrayList<>();
        nazivi.add("Rostilj");
        nazivi.add("Pecenje");
        nazivi.add("Kuvano");
        nazivi.add("Bareno");
        nazivi.add("Zivo");
        return nazivi;
    }

    public static Kategorija getKategorijaById(int id){
        switch (id){
            case 0:
                return new Kategorija(0, "Rostilj");
            case 1:
                return new Kategorija(1, "Pecenje");
            case 2:
                return new Kategorija(2, "Kuvano");
            case 3:
                return new Kategorija(3, "Bareno");
            case 4:
                return new Kategorija(4, "Zivo");
            default:
                return null;
        }
    }
}
