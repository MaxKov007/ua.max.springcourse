package ua.max.springcourse;

public class MusicPlayer {
    private Music music;

    // Inversion of Control (IoC) - инверсия управления
    public MusicPlayer(Music music){
        this.music = music;
    }

    public MusicPlayer(){}

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: "+ music.getSong());
    }
}
