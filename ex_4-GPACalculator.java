import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int midterm_1, midterm_2, lab_1, final_1; 
        double gpa;

        System.out.println("*****************************");
        System.out.println("Welcome to GPA Finder Program");
        System.out.println("*****************************");

        System.out.print("Please enter your grades (Midterm1 Midterm2 Lab Final): ");

        midterm_1 = scanner.nextInt();
        midterm_2 = scanner.nextInt();
        lab_1 = scanner.nextInt();
        final_1 = scanner.nextInt();

        gpa = (midterm_1 * 0.2) + (midterm_2 * 0.2) + (lab_1 * 0.2) + (final_1 * 0.4);
       
        double gpa4 = gpa / 25.0;

        System.out.println("Your weighted average is: " + gpa);
        System.out.println("Your GPA (out of 4.0) is: " + gpa4);

        scanner.close();
    }
}
