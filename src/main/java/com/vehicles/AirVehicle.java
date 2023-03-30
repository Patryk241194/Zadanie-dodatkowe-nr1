package com.vehicles;

abstract class AirVehicle extends Vehicle {

    public AirVehicle(String vehicleName, boolean doesVehicleHaveEngine) {
        super(vehicleName, doesVehicleHaveEngine);

    }
    void fly() {
        System.out.println(this.getVehicleName() + " flies");
    }

    @Override
    public void vehicleType() {
        if (this.getDoesVehicleHaveEngine()) {
            System.out.println(this.getVehicleName() + " is an air-type vehicle with engine");
        } else {
            System.out.println(this.getVehicleName() + " is an air-type vehicle without engine");
        }
        this.fly();
    }
}


class Glider extends AirVehicle {

    public Glider(String vehicleName, boolean doesVehicleHaveEngine) {
        super(vehicleName, doesVehicleHaveEngine);
    }

    @Override
    public void vehicleType() {
        super.vehicleType();
        System.out.println(this.getVehicleName()+ " is a " + Glider.class.getName());
        System.out.println("Glider's specification: ...\n");
    }
}


class Airplane extends AirVehicle {

    public Airplane(String vehicleName, boolean doesVehicleHaveEngine) {
        super(vehicleName, doesVehicleHaveEngine);
    }

    @Override
    public void vehicleType() {
        super.vehicleType();
        System.out.println(this.getVehicleName()+ " is a " + Airplane.class.getName());
        System.out.println("Airplane's specification: ...\n");
    }
}
