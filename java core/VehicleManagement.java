
interface Engine {
    void start();
    void stop();
}


interface Features {
    void accelerate();
    void brake();
    void honk();
    void playMusic();
}

interface Navigation {
    void turnLeft();
    void turnRight();
}


abstract class Vehicle {
    private String model;
    private int fuelLevel;

    public Vehicle(String model, int fuelLevel) {
        this.model = model;
        this.fuelLevel = fuelLevel;
    }

    public String getModel() {
        return model;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

   
    public void refuel(int amount) {
        fuelLevel += amount;
        System.out.println("Fuel level increased by " + amount + " liters. Current fuel level: " + fuelLevel);
    }
}


class Car extends Vehicle implements Engine, Features, Navigation {
    private boolean engineRunning;

    public Car(String model, int fuelLevel) {
        super(model, fuelLevel);
        this.engineRunning = false;
    }

   
    
    public void start() {
        if (!engineRunning) {
            System.out.println("Car engine started.");
            engineRunning = true;
        } else {
            System.out.println("Car engine is already running.");
        }
    }

    public void stop() {
        if (engineRunning) {
            System.out.println("Car engine stopped.");
            engineRunning = false;
        } else {
            System.out.println("Car engine is already stopped.");
        }
    }

    
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    
    public void brake() {
        System.out.println("Car is braking.");
    }

    
    public void honk() {
        System.out.println("Honk! Honk!");
    }

   
    public void playMusic() {
        System.out.println("Playing music in the car.");
    }

   
    public void turnLeft() {
        System.out.println("Turning left.");
    }

    
    public void turnRight() {
        System.out.println("Turning right.");
    }
}


public class VehicleManagement {
    public static void main(String[] args) {
       
        Car myCar = new Car("Sedan", 50);

        
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Fuel Level: " + myCar.getFuelLevel());
        
        myCar.start();
        myCar.accelerate();
        myCar.brake();
        myCar.honk();
        myCar.playMusic();
        myCar.turnLeft();
        myCar.turnRight();
        myCar.stop();

        
        myCar.refuel(20);
    }
}