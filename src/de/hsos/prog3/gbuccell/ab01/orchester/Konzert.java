/*
 * Modul: Programmieren 3, AB01
 * Autor: Giuseppe Buccellato
 * Semester: SoSe2020
 */

/* DIESE KLASSE WURDE ALS INNERE KLASSE IN 'ORCHESTER' IMPLEMENTIERT
package de.hsos.prog3.gbuccell.ab01.orchester;

import de.hsos.prog3.gbuccell.ab01.App;
import de.hsos.prog3.gbuccell.ab01.audio.adapter.SimpleAudioPlayerAdapter;

import java.io.IOException;
import java.net.URL;

public class Konzert implements Verhalten {

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
}*/
