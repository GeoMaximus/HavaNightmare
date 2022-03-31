import seminar03.Car;
import seminar03.Taxable;
import seminar03.Vehicle;

public class Main {
    public static void main(String[] args) {
        Taxable t;
        Vehicle v;

        Car c1 = new Car("Dacia Logan", 100, 1000);
        c1.move();
        System.out.println(c1.computeTax());
    }
}
