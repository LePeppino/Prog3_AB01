/*
 * Modul: Programmieren 3, AB01
 * Autor: Giuseppe Buccellato
 * Semester: SoSe2020
*/

package de.hsos.prog3.gbuccell.ab01.orchester;

import java.net.URL;
import java.util.HashSet;

public class Orchester {

    private String bezeichnung = null;
    private String audioDateiKonzert = null;

    public Orchester(String bezeichnung, String audioDateiKonzert){
        this.bezeichnung = bezeichnung;
        this. audioDateiKonzert = audioDateiKonzert;
        HashSet<MusikerIn> musikerInnen = new HashSet<>();
        addDirigentIn();
        addMusikerIn();
    }

    public void addDirigentIn(){

    }
    public void addMusikerIn(){

    }
    /*
    public HashSet<MusikerIn> getMusikerInnen(){
        //return ;
    }
    public void proben(){

    }
    public void auftreten(){

    }
    public void spielen(){

    }
    public URL getAudioDateiKonzert(){
        //return ;
    }
    */
}
