package Ed_v33_Ch3_Two_Way_Create_Threads;

// 1st way to create Threads
public class World extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

}
