public class ThreadPriorityExample {

    public static void main(String[] args) {

        Thread highPriorityThread = new Thread(()->{
            for (int i = 1; i <= 5; i++){
                System.out.println("High-priority thread: " + i);
            }
        }, "High Priority Thread");

        Thread mediumPriorityThread = new Thread(()->{
            for (int i = 1; i <= 5; i++){
                System.out.println("Medium-priority thread: " + i);
            }
        }, "Medium Priority Thread");

        Thread lowPriorityThread = new Thread(()->{
            for (int i = 1; i <= 5; i++){
                System.out.println("Low-priority thread: " + i);
            }
        }, "Low Priority Thread");

        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        mediumPriorityThread.setPriority(Thread.NORM_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        highPriorityThread.start();
        mediumPriorityThread.start();
        lowPriorityThread.start();

    }

}
