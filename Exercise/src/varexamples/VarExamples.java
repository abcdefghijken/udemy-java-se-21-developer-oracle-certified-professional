package varexamples;

import java.util.function.Function;

public class VarExamples {

    class Var{

    }

    public static void var(){
        //The return type and parameter type cannot be var
    }

    //var age; //compilation error

    public static void main(String[] args) {

        var num = 10;

        //num = "10"; //compilation error - type mismatch

        var name = "Java";
        var animals = new String[5];

        var person = new Person();

        //var age; //compilation error
        int age;

        //var text = null; //compilation error

        var numbers = new int[5];

        //var with Lambda
        //var function = anyString -> anyString.length(); //compilation error



    }

}
