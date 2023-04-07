package com.vehicles;

abstract class WaterVehicle extends Vehicle {

    private Engine engine;

    public WaterVehicle(String vehicleName, boolean doesVehicleHaveEngine) {
        super(vehicleName);
        this.engine = new Engine(doesVehicleHaveEngine);
    }

    void swim() {
        System.out.println(this.getVehicleName() + " swims");
    }

    @Override
    public void vehicleType() {
        if (engine.getDoesVehicleHaveEngine()) {
            System.out.println(this.getVehicleName() + " is a water-type vehicle with engine");
        } else {
            System.out.println(this.getVehicleName() + " is a water-type vehicle without engine");
        }
        System.out.println(this.getVehicleName() + " is a " + this.getClass().getSimpleName());
        this.swim();
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


class Kayak extends WaterVehicle {

    public Kayak(String vehicleName) {
        super(vehicleName, false);
    }
}


class Motorboat extends WaterVehicle {

    public Motorboat(String vehicleName) {
        super(vehicleName, true);
    }
}

