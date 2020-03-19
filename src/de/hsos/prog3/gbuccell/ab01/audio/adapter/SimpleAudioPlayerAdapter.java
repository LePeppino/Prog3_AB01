package de.hsos.prog3.gbuccell.ab01.audio.adapter;

import de.hsos.prog3.gbuccell.ab01.audio.StdAudioPlayer;
import de.hsos.prog3.audio.SimpleAudioPlayer;

import java.io.IOException;
import java.net.URL;

public class SimpleAudioPlayerAdapter implements StdAudioPlayer {

    SimpleAudioPlayer player;

    @Override
    public void einmaligAbspielen(URL url) throws IOException {
        player = new SimpleAudioPlayer(url);
        tonAn();
        player.play(0); //Loop = 0 --> keine Wiederholung
        tonAus();
    };
    @Override
    public void wiederholtAbspielen(URL url, int wiederholungen) throws IOException {
        for(int i = 0; i == wiederholungen; i++){
            einmaligAbspielen(url);
        }
    };
    @Override
    public void tonAus(){ //siehe Aufgabenblatt
        player.setDebug(true);
        player.verboseLogging(true);
    };
    @Override
    public void tonAn(){ //siehe Aufgabenblatt
        player.setDebug(false);
        player.verboseLogging(true);
    };

}
