package oop.PolymorphismExample;

public class Boat extends Vehicle{
    public Boat() {
        super("Boat speed","Boat start", "Boat direction", "Boat stop");
    }
    public void depthFinder(){
        System.out.println("What is the depth of this Sea?");
    }
}
