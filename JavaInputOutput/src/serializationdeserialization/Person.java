package serializationdeserialization;

import java.io.Serializable;

public class Person implements Serializable {

    String name, surname;
    int age;
    boolean married;
    transient long personID;
    transient Weights weight;
    double personWeight;

    //constructor
    public Person(String name, String surname, int age, boolean married, long personID, double weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.married = married;
        this.personID = personID;

        this.weight = new Weights(weight);
        personWeight = this.weight.weight;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nSurname: " + this.surname + "\nAge: " + this.age
                + "\nMarried: " + this.married + "\nPerson ID: " + this.personID + "\nWeight: " + this.personWeight;
    }
}
