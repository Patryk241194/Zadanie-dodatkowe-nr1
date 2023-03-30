package com.vehicles;

abstract class LandVehicle extends Vehicle {

    public LandVehicle(String vehicleName, boolean doesVehicleHaveEngine) {
        super(vehicleName, doesVehicleHaveEngine);

    }
    void drive() {
        System.out.println(this.getVehicleName() + " rides");
    }
    @Override
    public void vehicleType() {
        if (this.getDoesVehicleHaveEngine()) {
            System.out.println(this.getVehicleName() + " is a land-type vehicle with engine");
        } else {
            System.out.println(this.getVehicleName() + " is a land-type vehicle without engine");
        }
        this.drive();
    }
}


class Bicycle extends LandVehicle {

    public Bicycle(String vehicleName, boolean doesVehicleHaveEngine) {
        super(vehicleName, doesVehicleHaveEngine);
    }

    @Override
    public void vehicleType() {
        super.vehicleType();
        System.out.println(this.getVehicleName()+ " is a " + Bicycle.class.getName());
        System.out.println("Bicycle's specification: ...\n");
    }
}


class Car extends LandVehicle {

    public Car(String vehicleName, boolean doesVehicleHaveEngine) {
        super(vehicleName, doesVehicleHaveEngine);
    }

    @Override
    public void vehicleType() {
        super.vehicleType();
        System.out.println(this.getVehicleName()+ " is a " + Car.class.getName());
        System.out.println("Car's specification: ...\n");
    }
}

