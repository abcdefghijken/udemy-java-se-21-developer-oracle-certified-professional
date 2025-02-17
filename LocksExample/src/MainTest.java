public class MainTest {

    public static void main(String[] args) throws InterruptedException {

        /*
        ReentrantLockExample reentrantLock = new ReentrantLockExample();

        Thread t1 = new Thread(reentrantLock::increment,"Thread 1");
        Thread t2 = new Thread(reentrantLock::increment,"Thread 2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

         */

        ReadWriteLockExample readWriteLock = new ReadWriteLockExample();
        Thread writerThread = new Thread(()-> readWriteLock.writeData(49),"Writer Thread");

        Thread reader1 = new Thread(readWriteLock::readData, "Reader 1");
        Thread reader2 = new Thread(readWriteLock::readData, "Reader 2");

        writerThread.start();
        reader1.start();
        reader2.start();

        writerThread.join();
        reader1.join();
        reader2.join();


    }

}

















