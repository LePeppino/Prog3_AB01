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
        setBezeichnung(bezeichnung);
        setAudioDateiKonzert(audioDateiKonzert);
        this.musikerInnen = new HashSet<MusikerIn>(); //HashSet initialisieren, sonst Nullpointer!
    }
//Setter & Getter
    private void setBezeichnung(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }
    public String getBezeichnung(){
        return bezeichnung;
    }
    private void setAudioDateiKonzert(String audioDateiKonzert){
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
        return App.class.getResource(audioDateiKonzert);
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
