public class vehicle {
    public static void main(String[] args) {
        Engine car1 = new car();
        car1.run();
        car1.transmission();
        Engine bike1 = new bike();
        bike1.run();
        bike1.transmission();
    }
}
