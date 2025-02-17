package staticexample;
/*
import static staticexample.Employee.showSalary;
import static staticexample.Employee.increase;
import static staticexample.Employee.currentSalary;*/
import static staticexample.Employee.*;
/*
import static java.lang.Math.min;
import static java.lang.Math.pow;*/
import static java.lang.Math.*;
import static java.lang.System.out;

public class Test {

    public static void main(String[] args) {

        /*
        Car.showCurrentSpeed(Car.currentSpeed);
        Car.speedUp(50);
        Car.speedUp(140);
        Car.speedDown(30);
        Car.stop();*/

        //Redundant
        //Car obj = new Car();
        //obj.speedUp(50);

        //static import
        showSalary(currentSalary);
        increase(500);

        //Math class
        out.println(min(20,30));
        out.println(pow(3,2));//3^2->9


    }

}


















