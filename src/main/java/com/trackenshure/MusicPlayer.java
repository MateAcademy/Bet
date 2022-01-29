package com.trackenshure;

import com.trackenshure.model.Music;

/**
 * @author Sergey Klunniy
 */
public class MusicPlayer {
    private Music music;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
