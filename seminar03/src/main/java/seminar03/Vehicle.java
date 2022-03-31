package seminar03;

public abstract class Vehicle implements Cloneable {
    private String name;
    private int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public Vehicle() {

    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract void move();

    @Override
    public Object clone() throws CloneNotSupportedException {
        Vehicle copy = (Vehicle)super.clone();
        copy.name = name;
        copy.speed = speed;
        return copy;

    }
}
