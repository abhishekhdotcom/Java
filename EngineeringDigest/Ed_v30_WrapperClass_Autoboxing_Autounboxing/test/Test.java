package Ed_v30_WrapperClass_Autoboxing_Autounboxing.test;

public class Test {
    public static void main(String[] args) {
        int a = 1; // primitive data store in Stack
        Integer b = 1; // Object data store in Heap
        int i = b; // AutoUnBoxing
        boolean hasGraphicCard = true; // primitive data store in Stack
        Boolean isGamingLaptop = false; // AutoBoxing
        Float f = 1.2f;
        Double d = 1.2;
        Character c = 'A';
        Byte bb = 1;
        Short s = 2;
        Long l = 123l;

        System.out.println("Max Value: " + Integer.max(8, 14));
        System.out.println("Binary value: " + Integer.toBinaryString(10));
        
        String ss = "123";
        System.out.println(Integer.valueOf(ss));
    }
}
