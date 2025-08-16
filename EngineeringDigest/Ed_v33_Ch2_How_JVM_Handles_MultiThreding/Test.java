package Ed_v33_Ch2_How_JVM_Handles_MultiThreding;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello Developer");

        String thread = Thread.currentThread().getName(); // Get Current Thread Name
        System.out.println(thread);
    }
}
