package seminar03;

public class Car extends Vehicle implements Taxable{

    

    @Override
    public void move() {

    }

    @Override
    public double computeTax() {
        return 0;
    }
}
