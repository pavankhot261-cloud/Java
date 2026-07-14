public class Practical1 {
    public static void main(String[] args) {

        // Hello World
        System.out.println("Hello, World!");

        // Variables and Data Types
        int age = 20;
        double salary = 35000.75;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Rahul";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);

        // Implicit Type Casting
        int marks = 90;
        double totalMarks = marks; // int to double

        System.out.println("Implicit Type Casting: " + totalMarks);

        // Explicit Type Casting
        double percentage = 89.75;
        int finalMarks = (int) percentage; // double to int

        System.out.println("Explicit Type Casting: " + finalMarks);
        System.out.println("Converted Value: " + finalMarks);
    }
}
