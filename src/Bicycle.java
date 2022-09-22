public class Bicycle {
    Integer cadence;
    Integer gear;
    Integer speed;
    public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }
    void display(){System.out.println(cadence+" "+gear+" "+speed);}

    public static void main(String args[]) {
        Bicycle cycle1 = new Bicycle(1, 2, 3);
        cycle1.display();
    }
}

