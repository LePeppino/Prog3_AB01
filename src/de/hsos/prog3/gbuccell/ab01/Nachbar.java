package de.hsos.prog3.gbuccell.ab01;
import java.util.*;

public class Nachbar {
    String vorname = null;
    String nachname = null;

//Constructor
    public Nachbar(String vorname, String nachname){
        setVorname(vorname);
        setNachname(nachname);
    }

//getter + setter
    private void setVorname(String vorname){
        this.vorname = vorname;
    }
    private void setNachname(String nachname){
        this.nachname = nachname;
    }
    public String getVorname(){
        return vorname;
    }
    public String getNachname(){
        return nachname;
    }

//toString
    @Override
    public String toString(){
        return getVorname() + " " + getNachname();
    }

}
