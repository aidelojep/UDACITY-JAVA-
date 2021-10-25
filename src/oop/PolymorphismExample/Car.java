package oop.PolymorphismExample;

public class Car extends Vehicle{

    public Car() {
        super("Car speed", "Car start", "Car direction", "Car stop");
    }

    @Override
    public void speed() {
        System.out.println("This is my current speed!");
    }
}
