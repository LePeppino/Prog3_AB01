/*
 * Modul: Programmieren 3, AB01
 * Autor: Giuseppe Buccellato
 * Semester: SoSe2020
 */

package de.hsos.prog3.gbuccell.ab01.orchester;

public enum Instrument {
    SAXOPHON("/Baritone.wav"),
    SCHLAGZEUG("/Drum.wav"),
    AKKORDEON("/Accordion.wav");

    private String audiodatei;

// Konstruktor darf nicht public sein (UML sagt aber "public")
    Instrument(String audiodatei) {
        this.audiodatei = audiodatei;
    }

    public String getAudio(){
        return audiodatei;
    }
}
