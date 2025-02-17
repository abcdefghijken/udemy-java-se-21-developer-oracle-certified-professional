package streamexamples;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ParallelStreamExamples {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.parallelStream().forEach(n -> System.out.print(n + " "));

        System.out.println();

        //Concurrent Reduction
        Map<Boolean,List<Integer>> groupedNumbers = numbers
                .parallelStream()
                .unordered()
                .collect(
                        Collectors.groupingByConcurrent(n -> n % 2 == 0));
        System.out.println("Grouped numbers: " + groupedNumbers);

        Set<Collector.Characteristics> characteristicOfCollector = Collectors.groupingByConcurrent(n -> "Java").characteristics();
        System.out.println("characteristicOfCollector: " + characteristicOfCollector);

        //Ordering
        System.out.println("List of Numbers:");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        System.out.println("List of Numbers Reverse Order:");
        Comparator<Integer> reverse = Comparator.reverseOrder();
        numbers.sort(reverse);
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        System.out.println("List of Numbers With Parallel Stream:");
        numbers.parallelStream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        System.out.println("List of Numbers With Another Parallel Stream:");
        numbers.parallelStream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        System.out.println("List of Numbers With Parallel Stream And forEachOrdered Method:");
        numbers.parallelStream().forEachOrdered(n -> System.out.print(n + " "));
        System.out.println();


    }

}














