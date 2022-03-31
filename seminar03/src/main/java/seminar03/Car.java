package seminar03;

public final class Car extends Vehicle implements Taxable{
    private double engineSize;
    private final double ENGINE_LIMIT = 2000;
    public Car(){
        this.engineSize = 0;
    }

    public Car(String name, int speed, double engineSize) {
        super(name, speed);
        this.engineSize = engineSize;
    }

    public Car(double engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public void move() {
        System.out.println("The car " + getName() + "is moving with speed "  + getSpeed());
    }

    @Override
    public double computeTax() {
        if(ENGINE_LIMIT < 2){
            return engineSize*0.05;
        }
        else {
            return engineSize*0.1;
        }
    }
}
