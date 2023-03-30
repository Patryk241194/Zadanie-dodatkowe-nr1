package com.vehicles;

class VehicleRecognizer {

    private Vehicle vehicle;

    public VehicleRecognizer(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void process() {
        this.vehicle.vehicleType();
    }

    public void startEngine() {
        this.vehicle.start();
    }

    public void stopEngine() {
        this.vehicle.stop();
    }

    public String toString() {
        return this.vehicle.getVehicleName();
    }
}
