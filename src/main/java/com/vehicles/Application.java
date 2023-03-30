package com.vehicles;

public class Application {
    public static void main (String[] args) {

        VehicleRecognizer[] vehicle = new VehicleRecognizer[200];
        vehicle[0] = new VehicleRecognizer(new Kayak("Seabird Åfjord 368",false));
        vehicle[1] = new VehicleRecognizer(new Bicycle("Giant STORMGUARD E+ 2",false));
        vehicle[2] = new VehicleRecognizer(new Glider("Joysway Freeman V3",false));
        vehicle[3] = new VehicleRecognizer(new Motorboat("Yamarin 60 DC",true));
        vehicle[4] = new VehicleRecognizer(new Car("Ford Mondeo",true));
        vehicle[5] = new VehicleRecognizer(new Airplane("TECNAM P2002JF SP-WIX",true));


        for (int i = 0; i<vehicle.length; i++) {
            if (vehicle[i] instanceof VehicleRecognizer) {
                System.out.println("Vehicle no. " + (i+1) + ": " + vehicle[i].toString());
                vehicle[i].process(); }
        }

// Attempting to stop & start the engine on a vehicle without an engine
        vehicle[0].stopEngine();
        vehicle[0].startEngine();
// Attempting to stop & start the engine on a vehicle with an engine
        System.out.println();
        vehicle[5].stopEngine();
        vehicle[5].startEngine();
        vehicle[5].startEngine();
        vehicle[5].stopEngine();
        vehicle[5].stopEngine();

    }
}
