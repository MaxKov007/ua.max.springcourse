package ua.max.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic() {
        return "Playing " + classicalMusic.getSong() + ", " + rockMusic.getSong();
    }
}
