package creational.singleton;

public class SingletonPattern {
    private String name;
    private static SingletonPattern instance;


    private SingletonPattern() {}

    public static SingletonPattern getInstance() {
        if(instance == null) instance = new SingletonPattern();

        return instance;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
