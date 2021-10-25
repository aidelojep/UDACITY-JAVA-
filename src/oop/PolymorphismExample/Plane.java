package oop.PolymorphismExample;

public class Plane extends Vehicle{
    public Plane() {
        super("Plane speed", "Plane start", "Plane direction", "Plane stop");
    }
    public void altitude(){
        System.out.println("How high is our plane");
    }

    @Override
    public void speed() {
        System.out.println("The speed of Plane is 500km/hr");
    }
}
