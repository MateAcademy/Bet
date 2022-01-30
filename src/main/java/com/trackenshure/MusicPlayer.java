package com.trackenshure;

import com.trackenshure.model.Music;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Klunniy
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MusicPlayer {
    private List<Music> listMusic = new ArrayList<>();
//    private Music music;
    private String name;
    private int volume;

    //IoC
    public MusicPlayer(List<Music> music) {
        this.listMusic = music;
    }

    public void playMusic() {
        for (Music music : listMusic) {
            System.out.println("Playing: " + music.getSong());
        }
//        System.out.println("Playing: " + music.getSong());
    }
}
