public class DataTypes {
    public static void main(String[] args) {
        //First comment

        /* Hello world
        I am working on this file
        Please do not hesitate to ask me
        If you have a questions!
         */

        // Variables: int
        int numberOfStudents = 30;
        int maxScore = 100;
        System.out.println(numberOfStudents);
        System.out.println(maxScore);

        // Variables: double
        double temperature = 3.4;
        double price = 999.99;
        System.out.println(temperature);
        System.out.println(price);

        // Variables: float
        float pi = 3.14f;
        float radius = 5.5f;
        float area = pi * radius * radius;
        System.out.println(area);

        // Casting
        int areaInteger = (int) area;
        System.out.println (Math.round(area));

        //Char
        char symbol = '$'
        System.out.println(symbol);

        // Exercise: achii table
        char k = 1;
        System.out.println(k);
        char s = 2;
        System.out.println(s);
        char e = 3;
        System.out.println(e);
        char n = 4;
        System.out.println(n);
        char i = 5;
        System.out.println(i);
        char j = 6;
        System.out.println(j);
        char a = 7;
        System.out.println(a);

        // Boolen is / has  (returns true or false)
        boolean isRaining = false;
        boolean hasPassedExercise = true;
        boolean isSummer = false;
        System.out.println(isRaining);
        System.out.println(hasPassedExercise);
        System.out.println(isSummer);
    }
}