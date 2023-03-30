package com.vehicles;

abstract class WaterVehicle extends Vehicle {

    public WaterVehicle(String vehicleName, boolean doesVehicleHaveEngine) {
        super(vehicleName, doesVehicleHaveEngine);

    }
    void swim() {
        System.out.println(this.getVehicleName() + " swims");
    }
    @Override
    public void vehicleType() {
        if (this.getDoesVehicleHaveEngine()) {
            System.out.println(this.getVehicleName() + " is a water-type vehicle with engine");
        } else {
            System.out.println(this.getVehicleName() + " is a water-type vehicle without engine");
        }
        this.swim();
    }
}


class Kayak extends WaterVehicle {

    public Kayak(String vehicleName, boolean doesVehicleHaveEngine) {
        super(vehicleName, doesVehicleHaveEngine);
    }

    @Override
    public void vehicleType() {
        super.vehicleType();
        System.out.println(this.getVehicleName()+ " is a " + Kayak.class.getName());
        System.out.println("Kayak's specification: ...\n");
    }
}


class Motorboat extends WaterVehicle {

    public Motorboat(String vehicleName, boolean doesVehicleHaveEngine) {
        super(vehicleName, doesVehicleHaveEngine);
    }

    @Override
    public void vehicleType() {
        super.vehicleType();
        System.out.println(this.getVehicleName()+ " is a " + Motorboat.class.getName());
        System.out.println("Motorboat's specification: ...\n");
    }
}

