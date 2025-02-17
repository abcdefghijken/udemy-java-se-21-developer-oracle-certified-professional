package polymorphism;

public class Test {

    public static void main(String[] args) {

        Vehicle vehicle = new Car();//This code works because the Car class is subclass of the Vehicle
        vehicle.accelerate();// prints Car is accelerating...

        if (vehicle instanceof Car){
            Car car = (Car) vehicle;
        }

        Vehicle vehicle2 = new Motorcycle();
        vehicle2.accelerate();//prints Motorcycle is accelerating...

        //Car car = (Car) new Vehicle();//throws Class Cast Exception

        printAccelerate(new Car());
        printAccelerate(new Motorcycle());


    }

    public static void printAccelerate(Vehicle vehicle){
        vehicle.accelerate();
    }

    /*
    public static void printAccelerate(Car car){
        car.accelerate();
    }

    public static void printAccelerate(Motorcycle motorcycle){
        motorcycle.accelerate();
    }*/

}
