package lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceExamples {

    public static void main(String[] args) {

        //Static method reference
        Function<String,Integer> stringIntegerFunction = Integer::parseInt; //Integer.parseInt("123");
        Integer result = stringIntegerFunction.apply("123");
        System.out.println(result);

        //Method Reference via an object
        String str = "hello";
        Supplier<String> stringSupplier = str::toUpperCase;
        System.out.println(stringSupplier.get());

        //Calling constructor of a class
        Supplier<ArrayList<String>> arrayListSupplier = ArrayList::new;
        ArrayList<String> myList = arrayListSupplier.get();


        /*
        List<String> animals = List.of("Cat","Cow","Dog","Horse");
        Consumer<String> animalConsumer = System.out::println;
        animals.forEach(animalConsumer);



        List<String> animals = List.of("Cat","Cow","Dog","Horse");
        //Consumer<String> animalConsumer = System.out::println;
        animals.forEach(animal -> {
            if (animal.startsWith("C")) {
                System.out.println(animal);
            }
        });*/

    }

}
