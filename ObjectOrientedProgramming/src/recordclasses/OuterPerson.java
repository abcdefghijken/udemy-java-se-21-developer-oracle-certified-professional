package recordclasses;

public class OuterPerson {

    public int a = 10;

    public record InnerPersonClass(String name){

        public void show(){
           // System.out.println("a: " + a);
        }

    }

}
