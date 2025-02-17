package decisionmaking;

public class SwitchExpression {


    public static void main(String[] args) {

        int day = 3;
        var message = "";

        message = switch (day){
            case 1,2,3,4,5 -> "Workday";
            case 6,7 -> "Weekend";
            default -> "Invalid day";

        };
        System.out.println("message: " + message);



        /*
        //Pattern matching
        Object object = "132";

        String message = switch (object){

            case Integer i -> object + " is an Integer.";
            case String s ->  object + " is a String.";
            default -> "Unknown type.";

        };


        if (object instanceof Integer){
            message = object + " is an Integer.";
        }else if (object instanceof String){
            message = object + " is a String.";
        }else {
            message = "Unknown type.";
        }

        System.out.println(message);*/

        /*
        //Enum
        Days day = Days.MONDAY;
        String message = switch (day){
            case MONDAY,TUESDAY,WEDNESDAY,FRIDAY -> "Workday";
            case SATURDAY, SUNDAY -> "Weekend";
            default -> "Invalid day";
        };

         */


    }

    enum Days{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
    }

}


















