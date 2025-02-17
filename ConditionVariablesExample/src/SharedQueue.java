import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedQueue {

    Queue<Integer> queue = new LinkedList<>();
    private final int capacity = 5;

    private final ReentrantLock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public void produce(int value) throws InterruptedException {
        lock.lock();

        try {
            while (queue.size() == capacity){
                System.out.println("Queue is full. Producer is waiting...");
                notFull.await();//wait until the queue is not full
            }
            queue.add(value);//Add the item to the queue
            System.out.println("Produced: " + value);
            notEmpty.signal();//Notify the consumer that the queue is not empty
        }finally {
            lock.unlock();
        }

    }

    public void consume() throws InterruptedException{
        lock.lock();

        try {
            while (queue.isEmpty()){
                System.out.println("Queue is empty. Consumer is waiting...");
                notEmpty.await();//Wait until the queue is not empty
            }
            int value = queue.poll(); // Remove an item from the queue
            System.out.println("Consumed: " + value);
            notFull.signal(); // Notify the producer that the queue is not full
        }finally {
            lock.unlock();//Release the lock
        }

    }

}















