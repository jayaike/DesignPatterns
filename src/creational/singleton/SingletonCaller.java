package creational.singleton;

public class SingletonCaller {
    public static void main(String[] args) {
        SingletonPattern singleton = SingletonPattern.getInstance();

        singleton.setName("James");

        SingletonPattern singleton2 = SingletonPattern.getInstance();

        System.out.println(singleton2.getName());

        singleton.setName("Jamess");

        System.out.println(singleton2.getName());
    }
}
