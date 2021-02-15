package ua.max.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    // Фабричный метод должен быть статическим - должен вызываться на классе, а не на обьекте.
    // Если он не будет статическим - то у нас получится замкнутый круг -
    // не будет обьекта на котороым мы можем вызвать фабричный метод.
    // А единственный способ получить обьект - вызвать фабричный метод

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
