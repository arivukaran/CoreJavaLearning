public class parent {

    void display() {
        System.out.println("I am in Parent class");
    }

}

class child extends parent {
    void display() {
        System.out.println("I am in child class");
    }

    public static void main(String[] args) {
        parent c1 = new child();
        c1.display();
        parent p1 = new parent();
        p1.display();

    }

}
