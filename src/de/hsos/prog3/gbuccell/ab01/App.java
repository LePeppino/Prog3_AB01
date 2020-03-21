/*
* Modul: Programmieren 3, AB01
* Autor: Giuseppe Buccellato
* Semester: SoSe2020
*/

package de.hsos.prog3.gbuccell.ab01;

import de.hsos.prog3.audio.SimpleAudioPlayer;
import de.hsos.prog3.gbuccell.ab01.audio.adapter.SimpleAudioPlayerAdapter;
import de.hsos.prog3.gbuccell.ab01.orchester.DirigentIn;
import de.hsos.prog3.gbuccell.ab01.orchester.MusikerIn;
import de.hsos.prog3.gbuccell.ab01.orchester.Orchester;

import java.util.HashSet;
import java.io.IOException;
import java.net.URL;

import static de.hsos.prog3.gbuccell.ab01.orchester.Instrument.*;

public class App {
    public static void main(String[] args) throws IOException {
        /*
    //Nachbar Verwaltung
        HashSet<Nachbar> nachbarVW = new HashSet<>();
        nachbarVW.add(new Nachbar("Eric", "Walter"));
        nachbarVW.add(new Nachbar("Marcel", "Sauer"));
        nachbarVW.add(new Nachbar("Max", "Klingbeil"));

        System.out.print("Hallo");
        for (Nachbar n : nachbarVW) {
            System.out.print( ", " + n.toString());
        }
        System.out.print("!\n");
        */

        /*
    //SimpleAudioPlayer aus Aufgabe 1.2.5
        URL url = App.class.getResource("/Accordion.wav");
        SimpleAudioPlayer player = new SimpleAudioPlayer(url);
        player.setDebug(false);
        player.verboseLogging(true);
        player.play(0);
        */

        /*
    //An Adapter angepasster SimpleAudioPlayer
        SimpleAudioPlayerAdapter adapter = new SimpleAudioPlayerAdapter();
        URL url = App.class.getResource("/Accordion.wav");
        adapter.einmaligAbspielen(url);
        */

    //Aufgabe 1.4.8
        String audioDatei = "/All_Together.wav";
        Orchester orchester = new Orchester("Die rosaroten Borstenschweine", audioDatei);

        DirigentIn djBobo = new DirigentIn("DJ Bobo", 20);
        orchester.addDirigentIn(djBobo);

        //HashSet<MusikerIn> musikerInnen = new HashSet<>();
        MusikerIn saxophon = new MusikerIn("Sexy Sax Guy", SAXOPHON);
        MusikerIn schlagzeug = new MusikerIn("My loud neighbor TomTom", SCHLAGZEUG);
        MusikerIn akkordeon = new MusikerIn("The romanian", AKKORDEON);
        orchester.addMusikerIn(saxophon);
        orchester.addMusikerIn(schlagzeug);
        orchester.addMusikerIn(akkordeon);

        orchester.proben(orchester);
        orchester.auftreten(orchester);
        try{
            orchester.spielen(orchester);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
