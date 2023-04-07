package com.vehicles;

class Engine {

    private boolean engineOn = false;
    private boolean doesVehicleHaveEngine;

    public Engine(boolean doesVehicleHaveEngine) {
        this.doesVehicleHaveEngine = doesVehicleHaveEngine;
    }

    public boolean getDoesVehicleHaveEngine() {
        return doesVehicleHaveEngine;
    }

    protected void start() {
        if (this.doesVehicleHaveEngine) {
            if (!this.engineOn) {
                this.engineOn = true;
                System.out.println("The " + this.getClass().getSimpleName() + "'s engine has been turned on");
            } else if (this.engineOn) {
                System.out.println("The " + this.getClass().getSimpleName() + "'s engine is already running");
            }
        } else {
            System.out.println("This " + this.getClass().getSimpleName() + " has no engine");
        }
    }

    protected void stop() {
        if (this.doesVehicleHaveEngine) {
            if (this.engineOn) {
                this.engineOn = false;
                System.out.println("The " + this.getClass().getSimpleName() + "'s engine has been turned off");
            } else if (!this.engineOn) {
                System.out.println("The " + this.getClass().getSimpleName() + "'s engine is not running, cannot be turned off");
            }
        } else {
            System.out.println("This " + this.getClass().getSimpleName() + " has no engine");
        }
    }
}

