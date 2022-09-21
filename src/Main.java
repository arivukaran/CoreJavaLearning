import java.net.SocketOption;

public class Main {
    private String name;
    private int age;

    private String Display(){
        System.out.println("Display first program");
        this.name = "prabha";
        this.age = 30;
        return(name + age);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main human1 = new Main();
        human1.name = "Prabha";
        human1.age = 10;
        System.out.println(human1.name + human1.age);
        System.out.println(human1.Display());

    }
}
