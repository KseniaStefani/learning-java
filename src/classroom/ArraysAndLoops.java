package classroom;

import java.util.Arrays;

public class ArraysAndLoops {
    public static void main(String[] args) {

        // Arrays
        // Bread; Milk; Eggs; Fruits;

        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};

        int[] grades = {7, 9, 10, 6, 5, 4};

        String[] seasons = {"Summer", "Autumn", "Winter", "Spring"};
        System.out.println(Arrays.toString(seasons));

        String eggs = shoppingList[2];
        System.out.println(eggs);

        System.out.println(grades[4]);

        grades[0] = 2;
        System.out.println(grades[0]);
        // Print all grades
        System.out.println(Arrays.toString(grades));

        // Create empty array:
        int[] emptyArrays = new int[4];
        // [0] [0] [0] [0]
        System.out.println(Arrays.toString(emptyArrays));
        emptyArrays[0] = 1;
        emptyArrays[1] = 2;
        emptyArrays[2] = 3;
        emptyArrays[3] = 4;
        System.out.println(Arrays.toString(emptyArrays));

        // Create String array with name;
        // Name count should be 5;
        // And print them all;

        String[] names = {"Ksenija", "Andrejs", "Adrians", "Marks", "Alisa"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        System.out.println(Arrays.toString(names));

        // Create empty double array with size of 5;
        // Print empty array;
        // Update each array value from 0 to a number of your choice;
        // Print them all

        double[] emptyArrayDouble = new double[5];
        System.out.println(Arrays.toString(emptyArrayDouble));
        emptyArrayDouble[0] = 3.14;
        emptyArrayDouble[1] = 9.8;
        emptyArrayDouble[2] = 13.3;
        emptyArrayDouble[3] = 6.4;
        emptyArrayDouble[4] = 45.45;

        System.out.println(Arrays.toString(emptyArrayDouble));

        // Print numbers from 0 to 10;

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // Calculate sum from 1 to 100;
        // Example: 1 + 2 + 3 + n...;

        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum = sum + i;
        }
        System.out.println("Sum: " + sum);

        //for->

        for (String string : shoppingList) {
            System.out.println(string);
        }

        for (String s : shoppingList) {
            System.out.println(s);
        }

        // Print numbers from 10 to 0

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        int counter = 10;
        while (counter >= 0) {
            System.out.println(counter);
            counter = counter - 1;
        }

        // Exercise: Print even numbers from 2 to 100;
        // Print in one line all the numbers;

        for (int i = 2; i <= 100 ; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        for (int i = 2; i <= 100 ; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }








    }
}
