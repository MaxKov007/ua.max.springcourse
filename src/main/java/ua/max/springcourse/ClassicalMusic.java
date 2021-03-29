package ua.max.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public List<String> getSong() {
        List<String> classicalList = new ArrayList<>();
        classicalList.add("Hungarian Rhapsody");
        classicalList.add("Classical song 2");
        classicalList.add("Classical song 3");
        return classicalList;
    }
}
