package ua.max.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    @Override
    public List<String> getSong() {
        List<String> rockMusic = new ArrayList<>();
        rockMusic.add("Wind cries Mary");
        rockMusic.add("Rock song 2");
        rockMusic.add("Rock song 3");
        return rockMusic;
    }
}
