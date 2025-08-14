package com.engineeringdigest.corejava.enums;

public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    // Method
    public void displayDay() {
        System.out.println("Today is " + this.name());
    }
}
