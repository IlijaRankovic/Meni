package com.example.korisnik.meni.provajder;

import com.example.korisnik.meni.model.Jelo;
import com.example.korisnik.meni.model.Kategorija;
import com.example.korisnik.meni.model.Sastojci;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Korisnik on 11.5.2017..
 */

public class JeloProvajder {

    public static List<Jelo> getJela(){

        Kategorija rostilj = new Kategorija(0, "Rostilj");
        Kategorija pecenje = new Kategorija(1, "Pecenje");
        Kategorija kuvano = new Kategorija(2, "Kuvano");
        Kategorija bareno = new Kategorija(3, "Bareno");
        Kategorija zivo = new Kategorija(4, "Zivo");

        Sastojci mlevenoMeso = new Sastojci(0, "Mleveno meso, so, biber...");
        Sastojci jagnjeceMeso = new Sastojci(1, "Jagnjece meso, so...");
        Sastojci teletina = new Sastojci(2, "Teletina, sargarepa, so, biber, voda...");
        Sastojci kolenica = new Sastojci(3, "Kolenica, so, biber...");
        Sastojci losos = new Sastojci(4, "Losos, pirinac, so, biber...");

        List<Jelo> jela = new ArrayList<>();
        jela.add(new Jelo(0, "pljeskavica.jpg", "Pljeskavica", "Pikantno jelo sa rostilja, brzo se sprema i veoma je ukusno.", 150, 200, rostilj, mlevenoMeso));
        jela.add(new Jelo(1, "jagnjetina.jpg", "Jagnjetina", "Veoma ukusno jagnjece meso, peceno na rostilju, najbolja su jagnjad sa planinskih predela.", 200, 1000, pecenje, jagnjeceMeso));
        jela.add(new Jelo(2, "ragucorba.jpg", "Ragu corba", "Ako zelite nesto kasikom, nesto kuvano, da pojedete, nase preporuke su sigurne sto se tice ove corbe.", 80, 150, kuvano, teletina));
        jela.add(new Jelo(3, "barenakolenica.jpg", "Barena kolenica", "Barena kolenica je kralj medju barenim mesom. Sve preporuke.", 200, 400, bareno, kolenica));
        jela.add(new Jelo(4, "susi.jpg", "Susi", "Japansko jelo, zivo meso lososa sa pirincem i divnim zacinima. Veoma ukusno, ne dajte da vas sprecava ovo zivo.", 120, 800, zivo, losos));
        return jela;
    }

    public static List<String> getJeloNazivi(){

        List<String> nazivi = new ArrayList<>();
        nazivi.add("Pljeskavica");
        nazivi.add("Jagnjetina");
        nazivi.add("Ragu corba");
        nazivi.add("Barena kolenica");
        nazivi.add("Susi");
        return nazivi;
    }

    public static Jelo getJeloById(int id){

        Kategorija rostilj = new Kategorija(0, "Rostilj");
        Kategorija pecenje = new Kategorija(1, "Pecenje");
        Kategorija kuvano = new Kategorija(2, "Kuvano");
        Kategorija bareno = new Kategorija(3, "Bareno");
        Kategorija zivo = new Kategorija(4, "Zivo");

        Sastojci mlevenoMeso = new Sastojci(0, "Mleveno meso, so, biber...");
        Sastojci jagnjeceMeso = new Sastojci(1, "Jagnjece meso, so...");
        Sastojci teletina = new Sastojci(2, "Teletina, sargarepa, so, biber, voda...");
        Sastojci kolenica = new Sastojci(3, "Kolenica, so, biber...");
        Sastojci losos = new Sastojci(4, "Losos, pirinac, so, biber...");

        switch (id){
            case 0:
                return new Jelo(0, "pljeskavica.jpg", "Pljeskavica", "Pikantno jelo sa rostilja, brzo se sprema i veoma je ukusno.", 150, 200, rostilj, mlevenoMeso);
            case 1:
                return new Jelo(1, "jagnjetina.jpg", "Jagnjetina", "Veoma ukusno jagnjece meso, peceno na rostilju, najbolja su jagnjad sa planinskih predela.", 200, 1000, pecenje, jagnjeceMeso);
            case 2:
                return new Jelo(2, "ragucorba.jpg", "Ragu corba", "Ako zelite nesto kasikom, nesto kuvano, da pojedete, nase preporuke su sigurne sto se tice ove corbe.", 80, 150, kuvano, teletina);
            case 3:
                return new Jelo(3, "barenakolenica.jpg", "Barena kolenica", "Barena kolenica je kralj medju barenim mesom. Sve preporuke.", 200, 400, bareno, kolenica);
            case 4:
                return new Jelo(4, "susi.jpg", "Susi", "Japansko jelo, zivo meso lososa sa pirincem i divnim zacinima. Veoma ukusno, ne dajte da vas sprecava ovo zivo.", 120, 800, zivo, losos);
            default:
                return null;
        }
    }
}
