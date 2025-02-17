import java.util.concurrent.*;

public class ThreadPoolExample {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<Integer> task1 = () -> {
            System.out.println(Thread.currentThread().getName() + " is calculating the square of 5");
            return 5*5;
        };
        Callable<Integer> task2 = () -> {
            System.out.println(Thread.currentThread().getName() + " is calculating the square of 7");
            return 7*7;
        };
        Callable<Integer> task3 = () -> {
            System.out.println(Thread.currentThread().getName() + " is calculating the square of 10");
            return 10*10;
        };

        try {
            Future<Integer> result1 = executor.submit(task1);
            Future<Integer> result2 = executor.submit(task2);
            Future<Integer> result3 = executor.submit(task3);

            System.out.println("Square of 5: " + result1.get());
            System.out.println("Square of 7: " + result2.get());
            System.out.println("Square of 10: " + result3.get());

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }finally {
            executor.shutdown();
        }


    }

}
