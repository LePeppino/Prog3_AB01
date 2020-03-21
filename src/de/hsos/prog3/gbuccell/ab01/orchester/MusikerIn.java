/*
 * Modul: Programmieren 3, AB01
 * Autor: Giuseppe Buccellato
 * Semester: SoSe2020
 */

package de.hsos.prog3.gbuccell.ab01.orchester;

public class MusikerIn extends Mitglied {

    private String name;
    private Instrument instrument;

    public MusikerIn(String name, Instrument instrument){
        super();
        this.instrument = instrument;
    }

    public Instrument getInstrument(){
        return instrument;
    }
}
