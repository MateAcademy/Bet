package com.trackenshure;

import com.trackenshure.model.Music;
import com.trackenshure.model.RockMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sergey Klunniy
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Music music = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music);
        //musicPlayer.playMusic();

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        firstMusicPlayer.playMusic();

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        RockMusic musicBean1 = context.getBean("musicBean1", RockMusic.class);
        musicBean1.setName("Wind cries Mary !!!!!!!!!!!!!!");
        MusicPlayer secondMusicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);


        System.out.println();
        secondMusicPlayer2.playMusic();

        System.out.println();
        boolean comparing = firstMusicPlayer == secondMusicPlayer2;
        System.out.println(comparing);

        context.close();
    }
}
