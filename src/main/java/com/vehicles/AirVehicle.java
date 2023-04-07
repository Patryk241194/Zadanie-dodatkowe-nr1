package com.vehicles;

abstract class AirVehicle extends Vehicle {

    private Engine engine;

    public AirVehicle(String vehicleName, boolean doesVehicleHaveEngine) {
        super(vehicleName);
        this.engine = new Engine(doesVehicleHaveEngine);

    }

    void fly() {
        System.out.println(this.getVehicleName() + " flies");
    }

    @Override
    public void vehicleType() {
        if (engine.getDoesVehicleHaveEngine()) {
            System.out.println(this.getVehicleName() + " is a air-type vehicle with engine");
        } else {
            System.out.println(this.getVehicleName() + " is a air-type vehicle without engine");
        }
        System.out.println(this.getVehicleName() + " is a " + this.getClass().getSimpleName());
        this.fly();
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


class Glider extends AirVehicle {

    public Glider(String vehicleName) {
        super(vehicleName, false);
    }
}


class Airplane extends AirVehicle {

    public Airplane(String vehicleName) {
        super(vehicleName, true);
    }
}

