import seminar03.Car;
import seminar03.Taxable;
import seminar03.Vehicle;

public class Main {
    public static void main(String[] args) {
        Taxable t;
        Vehicle v;

        Car c1 = new Car(1, "Dacia Logan", 100, 1000);
        c1.move();
        System.out.println(c1.computeTax());

        if(c1 instanceof Cloneable){
            try {
                Car c2 = (Car) c1.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                }
        }
    }
}
