package classroom;

public class FirstHomeWork {

    public static void main(String[] args) {

        // Easy peasy:
        int num = 0;
        if (num >= 0) {
            System.out.println("Positive number.");
        }

        // Odd or even:
        int num2 = 8;
        if (num2 % 2 == 0) {
            System.out.println("Even number.");
        }

        // Age group classifier:
        int age = 18;
        if (age < 18) {
            System.out.println("Teenager.");
        } else {
            System.out.println("Adult.");
        }

        // Leap year checker:
        int year = 2024;
        if (year % 4 == 0) {
            System.out.println("Leap year.");
        }

        // Multiple conditions:
        int num3 = 98;
        if (num3 >= 0 && num3 % 2 == 0 && num3 < 100) {
            System.out.println("Valid number.");
        }

        // Character type identifier:
        char letter = 'i';
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("Vowel.");
        }

        // BMI calculator:
        int weight = 100;
        int height = 180;
        double heightx2 = height * height;
        double BMI = weight / heightx2 * 10000;
        // Tut ne ponimaju pochemu ne rabotaet vot takaja formula.. :
        // double BMI = ((weight / (height * height)) * 10000);
        if (BMI < 18.5) {
            System.out.println("Underweight.");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Healthy Weight.");
        } else if (BMI >= 25.0 && BMI <= 29.9) {
            System.out.println("Overweight.");
        } else if (BMI >= 30.0) {
            System.out.println("Obesity.");
        }

        // The final grade:
        double math = 99.6;
        double english = 78.9;
        double science = 98.7;
        double average = (math + english + science) / 3;
        if (average >= 90) {
            System.out.println("Your final score is A.");
        } else if (average > 80 && average < 89) {
            System.out.println("Your final score is B.");
        } else if (average > 70 && average < 79) {
            System.out.println("Your final score is C.");
        } else if (average > 60 && average < 69) {
            System.out.println("Your final score is D.");
        } else if (average < 60) {
            System.out.println("Your final score is E.");
        }

        // File extension checker:
        String fileName = "java.doc";
        if (fileName.endsWith(".txt")) {
            System.out.println("Valid file extension.");
        } else if (fileName.endsWith(".doc")) {
            System.out.println("Valid file extension.");
        } else if (fileName.endsWith(".pdf")) {
            System.out.println("Valid file extension.");
        } else
            System.out.println("Invalid file extension.");
    }
}
