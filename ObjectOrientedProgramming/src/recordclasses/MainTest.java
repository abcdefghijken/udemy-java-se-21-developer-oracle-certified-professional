package recordclasses;

public class MainTest {

    public static void main(String[] args) {

        /*
        PersonTwo person = new PersonTwo("Jhon Doe",30);
        System.out.println("-------- getters --------");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        System.out.println("---------- toString() ---------");
        System.out.println(person.toString());

        System.out.println("--------- equals() and hashCode() ----------");
        PersonTwo person2 = new PersonTwo("Jhon Doe",30);
        System.out.println("is persons are same ? " + person.equals(person2));
        System.out.println("Hash code of person: " + person.hashCode());
        System.out.println("Hash code of person2: " + person2.hashCode());

         */

        Person person = new Person("Jhon Doe",30);
        System.out.println("-------- getters --------");
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());

        System.out.println("---------- toString() ---------");
        System.out.println(person.toString());

        System.out.println("--------- equals() and hashCode() ----------");
        Person person2 = new Person("Jhon Doe",30);
        System.out.println("is persons are same ? " + person.equals(person2));
        System.out.println("Hash code of person: " + person.hashCode());
        System.out.println("Hash code of person2: " + person2.hashCode());

        Person person3 = new Person("Paul",-5);

        System.out.println("is person an adult ? " + person.isAdult());

        //OuterPerson.InnerPersonClass

    }

}
