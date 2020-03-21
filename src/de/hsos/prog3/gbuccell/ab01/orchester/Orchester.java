/*
 * Modul: Programmieren 3, AB01
 * Autor: Giuseppe Buccellato
 * Semester: SoSe2020
*/

package de.hsos.prog3.gbuccell.ab01.orchester;

import de.hsos.prog3.gbuccell.ab01.App;

import java.io.IOException;
import java.net.URL;
import java.util.HashSet;

public class Orchester implements Verhalten {

    private String bezeichnung;
    private String audioDateiKonzert = "/All_Together.wav";
    DirigentIn dirigentIn;
    HashSet<MusikerIn> musikerInnen;
    Verhalten verhalten;

//Konstruktor
    public Orchester(String bezeichnung, String audioDateiKonzert){
        this.bezeichnung = bezeichnung;
        this.audioDateiKonzert = audioDateiKonzert;
    }
//Methoden
    public void addDirigentIn(DirigentIn dirigentIn){
        this.dirigentIn = dirigentIn;
    }
    public void addMusikerIn(MusikerIn musikerIn){
        musikerInnen.add(musikerIn);
    }
    public HashSet<MusikerIn> getMusikerInnen(){
        return musikerInnen;
    }
    public URL getAudioDateiKonzert(){
        URL url = App.class.getResource(audioDateiKonzert);
        return url;
    }
    public void proben(Orchester orchester){
        orchester.verhalten = new Probe();
    }
    public void auftreten(Orchester orchester){
        orchester.verhalten = new Konzert();
    }
    @Override
    public void spielen(Orchester orchester) throws IOException{
        verhalten.spielen(orchester);
    }
}
