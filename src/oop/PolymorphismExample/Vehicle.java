package oop.PolymorphismExample;

public abstract class Vehicle {
    protected String speed;
    protected String start;
    protected String direction;
    protected String stop;

    public Vehicle(String speed, String start, String direction, String stop) {

        this.speed = speed;
        this.start = start;
        this.direction = direction;
        this.stop = stop;
    }
    public void start(){
        System.out.println("Starting...!!");
    }
    public void stop(){
        System.out.println("Stop!!!");
    }
    public void direction(){
        System.out.println("Direction of Vehicle");
    }
    public void speed(){};


}

