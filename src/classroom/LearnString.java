package classroom;

public class LearnString {
    public static void main(String[] args) {

        // String
        String name = "Ksenija";
        String lastName = "Stefani";

        System.out.println(name);
        System.out.println(lastName);

        // Exercise: Print name and surname (Example: John Doe);
        // Concatenation
        String fullName = name + " " + lastName; // Ksenija Stefani
        System.out.println(fullName);

        // Same example
        System.out.println(name + " " + lastName);
        System.out.println(String.format("%s %s", name, lastName));

        // Can save into variable
        String myFullName = String.format("%s %s", name, lastName);
        System.out.println(myFullName);

        // Hello, world!
        String hello = "Hello, ";
        String world = "world!";

        String helloWorld = hello.concat(world);
        System.out.println(helloWorld);

        // Exercise:
        // Step 1: Declare a string variable with your name;
        // Step 2: Declare a string variable with your favorite programming language;
        // Step 3: Concatenate the two strings to form a message 'My name is {NAME}. I love coding in {PLANGUAGE};
        // Step 4: Print it out;

        String myname = "Ksenija";
        String planguage = "Java";
        String fullText = "My name is " + myname + ". " + "I love coding in " + planguage;
        System.out.println(fullText);

        String randomString = "some text";
        System.out.println(randomString.toUpperCase());






    }

    public static class Variables {
        public static void main(String[] args) {
        // Variables: int
            int numberOfCalendarDays = 31;
            int numberOfOranges = 10;
            System.out.println(numberOfOranges);
            System.out.println(numberOfCalendarDays);

        // Variables: long
            long phoneNumber = 28202403;
            long cardNumber = 55852456663334L;
            System.out.println(phoneNumber);
            System.out.println(cardNumber);

        // Variables: double
            double change = 0.01;
            double examScore = 77.7;
            System.out.println(change);
            System.out.println(examScore);

        // Variables: float
            float accelerationDueToGravity = 9.8f;
            float mass = 4.5f;
            float gravitationForce = mass * accelerationDueToGravity;
            System.out.println(gravitationForce);

        // Variables: Char
            char s = 83;
            System.out.println(s);
            char t = 84;
            System.out.println(t);
            char e = 69;
            System.out.println(e);
            char f = 70;
            System.out.println(f);
            char a = 65;
            System.out.println(a);
            char n = 78;
            System.out.println(n);
            char i = 73;
            System.out.println(i);

            // Variables: Boolean
            boolean is8ofMarch = false;
            boolean isMarch = true;
            System.out.println(isMarch);
            System.out.println(is8ofMarch);




        }
    }
}