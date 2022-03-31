package seminar03;

public final class Car extends Vehicle implements Taxable{
    private final int ID;
    private double engineSize;
    private final double ENGINE_LIMIT = 2000;
    public Car(){
        ID = 0;
        this.engineSize = 0;
    }

    public Car(int id, String name, int speed, double engineSize) {
        super(name, speed);
        this.ID = id;
        this.engineSize = engineSize;
    }

    public Car(int id, double engineSize) {
        ID = id;
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        Car copy = (Car)super.clone();
        copy.engineSize = engineSize;
        return copy;
    }
}
