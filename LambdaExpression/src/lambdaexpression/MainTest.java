package lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MainTest {

    public static void main(String[] args) {

        //Anonymous Class
        /*Animals animal = new Animals(){

            @Override
            public void show(String animal, int speed) {

                System.out.println("A " + animal + " can reach speeds of " + speed + " kilometers per hour.");

            }
        };

        animal.show("Cheetah", 90);*/

        //Lambda Expression
        Animals animal = MainTest::display;

        animal.show("Cheetah",90);

    }

    public static void display(String animal, int speed){
        System.out.println("A " + animal + " can reach speeds of " + speed + " kilometers per hour.");
    }

}
