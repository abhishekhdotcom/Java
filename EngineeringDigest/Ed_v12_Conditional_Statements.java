public class Ed_v12_Conditional_Statements {
    public static void main(String[] args) {
        // ----------Relational operators----------
        // Relational operators compare two values and return a boolean result
        int a = 1;
        int b = 2;
        boolean c = a < b;
        boolean d = a == b;
        boolean e = a != b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        char z = 'z';
        char y = 'a';
        boolean x = y == z;
        System.out.println(x);

        // ---------Logical operators----------

        // && logical AND -→ true if both conditions are true
        // || logical OR -→ true if at least one condition is true
        // ! logical NOT -→ inverts the truthiness (true → false, false → true)

        int marks = 35;
        int age = 50;
        // check marks >= 33 and age <= 18
        if (marks >= 33 && age >= 18) {
            System.out.println("Pass");
        }

        // ---------Check age >= 18 or not---------
        int myAge = 15;
        if (myAge >= 18) {
            System.out.println("You are adult!");
        } else {
            System.out.println("You are child!");
        }

        // ---------check multiple conditions---------
        // marks >= 90 --> (Grade A)
        // marks >= 75 --> (Grade B)
        // marks >= 60 --> (Grade C)

        int marks1 = 87;
        if (marks1 >= 90) {
            System.out.println("Grade A");
        } else if (marks1 >= 75) {
            System.out.println("Grade B");
        } else if (marks1 >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }

        // -----------Check week name using 1-7 days with if else if ladder-----------
        int day = 5;

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");

        } else if (day == 3) {
            System.out.println("Wednesday");

        } else if (day == 4) {
            System.out.println("Thursday");

        } else if (day == 5) {
            System.out.println("Friday");

        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Please Enter Correct Week Day!");
        }

        // -----------Check week name using 1-7 days with Switch case-----------
        int days = 3;

        switch (days) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");

            default -> System.out.println("Please Enter valid Day!");
        }
    }
}
