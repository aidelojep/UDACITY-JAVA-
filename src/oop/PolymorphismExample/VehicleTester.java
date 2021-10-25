package oop.PolymorphismExample;

public class VehicleTester {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car();
        vehicles[1] = new Boat();
        vehicles[2] = new Plane();


            Car car = new Car();
            Boat boat = new Boat();
            Plane plane = new Plane();

            //Our car method has been overridden
            car.speed();
            boat.speed();
            plane.speed();

    }
}

