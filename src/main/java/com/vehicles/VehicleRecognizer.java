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
        this.vehicle.startEngine();
    }

    public void stopEngine() {
        this.vehicle.stopEngine();
    }

    public String toString() {
        return this.vehicle.getVehicleName();
    }
}
