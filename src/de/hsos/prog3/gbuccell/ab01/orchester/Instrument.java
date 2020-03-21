/*
 * Modul: Programmieren 3, AB01
 * Autor: Giuseppe Buccellato
 * Semester: SoSe2020
 */

package de.hsos.prog3.gbuccell.ab01.orchester;

import de.hsos.prog3.gbuccell.ab01.App;

public enum Instrument {
    SAXOPHON("/Baritone.wav"),
    SCHLAGZEUG("/Drum.wav"),
    AKKORDEON("/Accordion.wav");

    private String audiodatei = null;

// Konstruktor darf nicht public sein (UML sagt aber "public")
    private Instrument(String audiodatei){
        this.audiodatei = audiodatei;
    }

    public String getAudio(){
        return audiodatei;
    }
}
