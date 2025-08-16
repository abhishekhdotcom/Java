package Ed_v33_Ch3_Two_Way_Create_Threads;

public class Test {
    public static void main(String[] args) {
        // 1st Way Threads
        World world = new World();
        world.start(); // call Threads

        // 2nd Way Threads
        India india = new India();
        Thread t1 = new Thread(india);
        t1.start();

        for (int i = 0; i < 100000; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
