package com.engineeringdigest.corejava.enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(Day.SUNDAY);
        System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY);
        System.out.println(Day.WEDNESDAY);
        System.out.println(Day.THURSDAY);
        System.out.println(Day.FRIDAY);
        System.out.println(Day.SATURDAY);

        // Print Index Of Enum
        Day monday = Day.MONDAY;
        int ordinal = monday.ordinal();
        monday.displayDay();
        System.out.println("Indax Of MONDAY: " + ordinal);

        // Print all Enums
        Day[] values = Day.values();
        for (Object elem : values) {
            System.out.println(elem);
        }

    }
}
