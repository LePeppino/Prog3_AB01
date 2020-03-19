package de.hsos.prog3.gbuccell.ab01.orchester;

public class MusikerIn extends Mitglied {

    private Instrument instrument;

    public MusikerIn(Instrument instrument){
        this.instrument = instrument;
    }

    public Instrument getInstrument(){
        return instrument;
    }
}
