/*
 * Modul: Programmieren 3, AB01
 * Autor: Giuseppe Buccellato
 * Semester: SoSe2020
 */

package de.hsos.prog3.gbuccell.ab01.orchester;

import de.hsos.prog3.gbuccell.ab01.App;
import de.hsos.prog3.gbuccell.ab01.audio.adapter.SimpleAudioPlayerAdapter;

import java.io.IOException;
import java.net.URL;

public class Probe implements Verhalten {

    /*
    * HashSet durchlaufen und für jede MusikerIn:
    * -> neuen Adapter erstellen,
    * -> url = Audio des Instruments der MusikerIn,
    * -> nacheinander einmalig abspielen
    * */
    @Override
    public void spielen(Orchester orchester) throws IOException {
        for (MusikerIn musikerIn : orchester.musikerInnen) {
            SimpleAudioPlayerAdapter adapter = new SimpleAudioPlayerAdapter();
            URL url = App.class.getResource(musikerIn.getInstrument().getAudio());
            adapter.einmaligAbspielen(url);
        }
        throw new IOException("Probe wird abgebrochen");
    }
}
