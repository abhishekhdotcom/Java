package Ed_v33_Ch3_Two_Way_Create_Threads;

// 2nd way to create Threads
public class India implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

}
