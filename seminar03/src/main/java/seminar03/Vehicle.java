package seminar03;

public abstract class Vehicle {
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
}
