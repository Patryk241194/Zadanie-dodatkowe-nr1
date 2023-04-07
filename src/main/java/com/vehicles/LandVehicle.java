package com.vehicles;

abstract class LandVehicle extends Vehicle {

    private Engine engine;

    public LandVehicle(String vehicleName, boolean doesVehicleHaveEngine) {
        super(vehicleName);
        this.engine = new Engine(doesVehicleHaveEngine);
    }

    void drive() {
        System.out.println(this.getVehicleName() + " rides");
    }

    @Override
    public void vehicleType() {
        if (engine.getDoesVehicleHaveEngine()) {
            System.out.println(this.getVehicleName() + " is a land-type vehicle with engine");
        } else {
            System.out.println(this.getVehicleName() + " is a land-type vehicle without engine");
        }
        System.out.println(this.getVehicleName() + " is a " + this.getClass().getSimpleName());
        this.drive();
        System.out.println(this.getClass().getSimpleName() + "'s specification: ...\n");
    }

    @Override
    void startEngine() {
        this.engine.start();
    }

    @Override
    void stopEngine() {
        this.engine.stop();
    }
}

class Bicycle extends LandVehicle {

    public Bicycle(String vehicleName) {
        super(vehicleName, false);
    }
}

class Car extends LandVehicle {

    public Car(String vehicleName) {
        super(vehicleName, true);
    }
}
