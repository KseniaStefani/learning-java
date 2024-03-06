package classroom;

public class ConditionalStatements {
    public static void main(String[] args) {

        // Conditional statements in Java allow to control the flow of your program based on certain conditions.

        // 'If' statement

        /*
        if(condition) {
        // Code to be executed if the condition is true!
        }
         */

        if (true) {
            System.out.println("This code is executed!");
        }


        int x = 10;
        if(x >5) {
            System.out.println("x is greater than 5");
        }

        if(x >12) {
            System.out.println("x is greater than 12");
        }

        boolean isSpring = false;
        if(isSpring){
            // Will not be executed because isSpring is false
            System.out.println("It is Spring!");
        }

        // What returns true or false
        // Compasion: >, <, ==, >=, <=; !=

        // IF-ELSE

        // Child : <=12 age;
        // Teenager : => 13 & <=19;
        // Adult : => 20 & <=59;
        // Else: Senior

        int age = 60;

        if(age <= 12){
            System.out.println("This is child!");
        } else {
            System.out.println("Something else!");
        }

        // IF-ELSE-IF-ELSE

        if (age <= 12) {
            System.out.println("This is child!");
        } else if (age >= 13 && age <= 19) {
            System.out.println("This is teenager!");
        } else if (age >= 20 && age <=59) {
            System.out.println("This is adult!");
        } else {
            System.out.println("This is senior!");
        }

        // EXERCISE 1
        // Write a Java program that checks if a given number is positive, negative or zero.
        // Step 1: define variable (int number = 10);
        // Step 2: create logic;
        // Step 3: For each condition print out message (is positive, is negative, is zero).

        int num = -1;
        if (num < 0) {
            System.out.println("Is negative!");
        } else if (num > 0) {
            System.out.println("Is positive!");
        } else if (num == 0) {
            System.out.println("Is zero!");
        }

        // EXERCISE 2
        // Write a Java program that determines the time of day based on given hour:
        // If the hour is between 0 and 11, will print: Good morning;
        // If the hour is between 12 and 17, will print: Good afternoon;
        // If the hour is between 18 and 23, will print: Good evening;
        // In all other cases should say that: Invalid hour provided;

        int oclock = 18;
        if (oclock >= 0 && oclock <= 11) {
            System.out.println("Good morning!");
        } else if (oclock >= 12 && oclock <= 17) {
            System.out.println("Good afternoon!");
        } else if (oclock >= 18 && oclock <= 23) {
            System.out.println("Good evening!");
        } else if (oclock >= 24) {
            System.out.println("Invalid hour provided!");
        }

        int hours = 40;
        if (hours >= 0 && hours <= 11) {
            System.out.println("Good morning!");
        } else if (hours >=12 && hours <=17) {
            System.out.println("Good afternoon!");
        } else if (hours >=18 && hours <=23) {
            System.out.println("Good Evening!");
        } else {
            System.out.println("Invalid hour provided!" + hours);
        }

    }


}
