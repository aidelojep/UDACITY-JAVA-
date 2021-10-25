package oop.PolymorphismExample;

public class Boat extends Vehicle{
    public Boat() {
        super("Boat speed","Boat start", "Boat direction", "Boat stop");
    }
    public void depthFinder(){
        System.out.println("What is the depth of this Sea?");
    }

    @Override
    public void speed() {
        System.out.println("The speed of Boat is 50km/hr");
    }
}
