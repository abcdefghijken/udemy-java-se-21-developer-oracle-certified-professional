package recordclasses;

public record Person(String name, int age) implements Drink {

    public Person(){

        this(null,0);

    }

    //Compact canonical constructor
    public Person{
        if (age < 0)
            System.out.println("Age cannot be negative!");
    }


    @Override
    public void canDrink(String drinkName) {

    }

    //static final int age = 10;

    //custom method
    public String isAdult(){
        return age > 18 ? "You are an adult" : "You are not an adult";
    }


}
