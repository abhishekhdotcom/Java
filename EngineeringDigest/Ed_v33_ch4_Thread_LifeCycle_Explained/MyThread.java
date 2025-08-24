package Ed_v33_ch4_Thread_LifeCycle_Explained;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Running");
        // Create Thread Method
        try {
            Thread.sleep(200); // pause t1 Method
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState()); // New thread
        t1.start();
        System.out.println(t1.getState()); // Runnable thread

        // Create Thread Method
        Thread.sleep(100); // pause main Method

        System.out.println(t1.getState()); // Thread Timed_waiting
        t1.join();
        System.out.println(t1.getState());// Thread Terminated
    }
}
