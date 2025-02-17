package streamexamples;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReductionOperationsWithReduce {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("David", 3000, Employee.Sex.MALE),
                new Employee("Marry", 2500, Employee.Sex.FEMALE),
                new Employee("Clark", 3500, Employee.Sex.MALE),
                new Employee("Andy", 4500, Employee.Sex.MALE),
                new Employee("Sara", 2000, Employee.Sex.FEMALE)
        );

        Optional<Employee> highestSalary = employees.stream()
                .reduce((e1,e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2);
        highestSalary.ifPresent(e -> System.out.println("Name: " + e.getName() + " Salary: " + e.getSalary()));

        int totalSalary = employees.stream()
                .map(Employee::getSalary)
                .reduce(0, Integer::sum);
        System.out.println("Total salary: " + totalSalary);

        String concatenatedNames = employees.stream()
                .map(Employee::getName)
                .reduce("",(name1,name2)->name1 + " " + name2);
        System.out.println("Concatenated names: " + concatenatedNames.trim());


        /*
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        Optional<Integer> sum = nums.stream()
                .reduce((a,b) -> a+b);
        sum.ifPresent(n-> System.out.println("Sum: " + n));

        int sumWithInitialValue = nums.stream()
                .reduce(0,(a,b) -> a+b);
        System.out.println("Sum: " + sumWithInitialValue);

        int elementProduct = nums.stream()
                .reduce(1,(a,b) -> a*b);
        System.out.println("Product: " + elementProduct);

        Optional<Integer> smallestNumber = nums.stream().reduce((a,b)-> a < b ? a : b);
        smallestNumber.ifPresent(min-> System.out.println("Smallest Number: " + min));*/


    }

}
















