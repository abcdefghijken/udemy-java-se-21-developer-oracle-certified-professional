package abstractclass;

public abstract class Vehicle {

    String type;
    String model;

    //constructor
    public Vehicle(String type, String model){
        this.type = type;
        this.model = model;
    }

    //non-abstract methods
    public void start(){
        System.out.println("Vehicle has started.");
    }

    public void stop(){
        System.out.println("Vehicle has stopped.");
    }

    //abstract method
    abstract int getMaxSpeed();

}
















