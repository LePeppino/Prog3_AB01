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

/* Zweite Methode laut VL-Skript:
public class Instrument{
    public static final Instrument SAXOPHON = new Instrument("/Baritone.wav");
    public static final Instrument SCHLAGZEUG = new Instrument("/Drum.wav");
    public static final Instrument AKKORDEON = new Instrument("/Akkordeon.wav");

    private String audiodatei;

    Instrument(String audiodatei) {
        this.audiodatei = audiodatei;
    }

    public String getAudio(){
        return audiodatei;
    }
}

 */
