/*
 * Modul: Programmieren 3, AB01
 * Autor: Giuseppe Buccellato
 * Semester: SoSe2020
*/

package de.hsos.prog3.gbuccell.ab01.orchester;

import de.hsos.prog3.gbuccell.ab01.App;
import de.hsos.prog3.gbuccell.ab01.audio.StdAudioPlayer;
import de.hsos.prog3.gbuccell.ab01.audio.adapter.SimpleAudioPlayerAdapter;

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

    /*
    * Implementierung von Probe und Konzert als private innere Klassen
    */
    private class Probe implements Verhalten {

        /*
         * HashSet durchlaufen und für jede MusikerIn:
         * -> neuen Adapter erstellen,
         * -> url = Audio des Instruments der MusikerIn,
         * -> nacheinander einmalig abspielen
         * */
        @Override
        public void spielen(Orchester orchester) throws IOException {
            StdAudioPlayer adapter = new SimpleAudioPlayerAdapter();
            for (MusikerIn musikerIn : orchester.getMusikerInnen()) {
                try {
                    URL url = App.class.getResource(musikerIn.getInstrument().getAudio());
                    adapter.einmaligAbspielen(url);
                }catch(IOException e){
                    System.out.println("Probe wird abgebrochen");
                    break; //break aus dem Loop
                }
            }
        }
    }

    private class Konzert implements Verhalten {

        // URL des Konzert-Audio des Orchesters abrufen
        public URL getKonzertSound(Orchester orchester){
            URL url = orchester.getAudioDateiKonzert();
            return url;
        }
        // Abgerufene URL mit Player-Adapter abspielen
        @Override
        public void spielen(Orchester orchester) throws IOException {
            SimpleAudioPlayerAdapter adapter = new SimpleAudioPlayerAdapter();
            try {
                adapter.einmaligAbspielen(getKonzertSound(orchester));
            }catch(IOException e){
                System.out.println("Auftritt wird abgebrochen");
            }
        }
    }
}
