package ua.max.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    @Override
    public List<String> getSong() {
        List<String> classicalList = new ArrayList<>();
        classicalList.add("Hungarian Rhapsody");
        classicalList.add("Classical song 2");
        classicalList.add("Classical song 3");
        return classicalList;
    }
}
