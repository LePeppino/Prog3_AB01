/*
* Modul: Programmieren 3, AB01
* Autor: Giuseppe Buccellato
* Semester: SoSe2020
*/

package de.hsos.prog3.gbuccell.ab01;
//import de.hsos.prog3.audio.SimpleAudioPlayer;
import de.hsos.prog3.gbuccell.ab01.audio.adapter.SimpleAudioPlayerAdapter;

import java.util.*; //to use HashSet
import java.io.IOException;
import java.net.URL;

public class App {
    public static void main(String[] args) throws IOException {
        //Nachbar Verwaltung
        HashSet<Nachbar> nachbarVW = new HashSet<>();
        nachbarVW.add(new Nachbar("Eric", "Walter"));
        nachbarVW.add(new Nachbar("Marcel", "Sauer"));
        nachbarVW.add(new Nachbar("Max", "Klingbeil"));

        //Set ausgeben
        System.out.print("Hallo");
        for (Nachbar n : nachbarVW) {
            System.out.print( ", " + n.toString());
        }
        System.out.print("!\n");

        /*
        ***SimpleAudioPlayer aus Aufgabe 1.2.5***
        *
        URL url = App.class.getResource("/Accordion.wav");
        SimpleAudioPlayer player = new SimpleAudioPlayer(url);
        player.setDebug(false);
        player.verboseLogging(true);
        player.play(0);
        */

        //An Adapter angepasster SimpleAudioPlayer
        SimpleAudioPlayerAdapter adapter = new SimpleAudioPlayerAdapter();
        URL url = App.class.getResource("/Accordion.wav");
        adapter.einmaligAbspielen(url);
    }
}
