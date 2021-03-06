/*
 * Modul: Programmieren 3, AB01
 * Autor: Giuseppe Buccellato
 * Semester: SoSe2020
 */

package de.hsos.prog3.gbuccell.ab01.audio;
import java.io.IOException;
import java.net.URL;

public interface StdAudioPlayer {

    public void einmaligAbspielen(URL url) throws IOException;
    public void wiederholtAbspielen(URL url, int wiederholungen) throws IOException;
    public void tonAus();
    public void tonAn();
}
