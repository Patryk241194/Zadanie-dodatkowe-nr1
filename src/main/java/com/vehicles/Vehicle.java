package com.vehicles;

abstract class Vehicle {

    private String vehicleName;

    private boolean doesVehicleHaveEngine;

    private boolean engineOn = false;

    public Vehicle(String vehicleName, boolean doesVehicleHaveEngine) {
        this.vehicleName = vehicleName;
        this.doesVehicleHaveEngine = doesVehicleHaveEngine;
    }

    public String getVehicleName() {
        return this.vehicleName;
    }

    public boolean getDoesVehicleHaveEngine() {
        return this.doesVehicleHaveEngine;
    }

    abstract void vehicleType();

    protected void start() {
        if (this.getDoesVehicleHaveEngine() && !this.engineOn) {
            this.engineOn = true;
            System.out.println("The "+ this.getClass().getName() + "'s engine has been turned on");
        } else if (this.getDoesVehicleHaveEngine() && this.engineOn) {
            System.out.println("The "+ this.getClass().getName() + "'s engine is already running");
        } else {
            System.out.println("This "+ this.getClass().getName() + " does not have an engine");
        }
    }

    protected void stop() {
        if (this.getDoesVehicleHaveEngine() && this.engineOn) {
            this.engineOn = false;
            System.out.println("The "+ this.getClass().getName() + "'s engine has been turned off");
        } else if (this.getDoesVehicleHaveEngine() && !this.engineOn) {
            System.out.println("The "+ this.getClass().getName() + "'s engine is not running, cannot be turned off");
        } else {
            System.out.println("This "+ this.getClass().getName() + " does not have an engine");
        }
    }
}