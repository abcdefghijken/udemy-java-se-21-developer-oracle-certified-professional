package methodoverriding;

public class Car extends Vehicle{

    void start(){
        System.out.println("Car has started.");
    }
    public void accelerate(int speed){
        System.out.println("Car accelerates at " + speed);
    }
    public void stop(){
        System.out.println("Car has stopped.");
    }

}
