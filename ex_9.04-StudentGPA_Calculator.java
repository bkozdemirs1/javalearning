import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("****************");
        System.out.println("Please enter Student name: ");
        System.out.println("****************");
        String name = scanner.nextLine();
        

        System.out.print("Please enter your amount of classes: ");
        int amountOfClass = scanner.nextInt();
        scanner.nextLine();

        String[] subjects = new String[amountOfClass];
        double[] grades = new double[amountOfClass];
        int[] coefficients = new int[amountOfClass];

        double gpa = 0;
        double totalCoefficient = 0;

       
        for(int i = 0; i < amountOfClass; i++) {
            
            System.out.print("Enter name of class " + (i+1) + ": ");
            subjects[i] = scanner.nextLine();

            System.out.print("Enter coefficient (like 40 for %40): ");
            coefficients[i] = scanner.nextInt();

            System.out.print("Enter grade (0-100): ");
            grades[i] = scanner.nextDouble();
            scanner.nextLine();

            gpa += (grades[i] * coefficients[i]) / 100.0;
            totalCoefficient += coefficients[i];
        }

        gpa = gpa / (totalCoefficient / 100.0);

        System.out.println("\n**************** REPORT ****************");
        System.out.println("Student: " + name);
        System.out.println("----------------------------------------");
        System.out.printf("%-15s %-10s %-12s\n", "Subject", "Grade", "Coefficient");
        System.out.println("----------------------------------------");
        
        for(int i = 0; i < amountOfClass; i++) {
            
            System.out.printf("%-15s %-10.2f %d%%\n", subjects[i], grades[i], coefficients[i]);
        
        }
        
        System.out.println("----------------------------------------");
        System.out.printf("Final GPA: %.2f\n", gpa);
        System.out.println("****************************************");

        if(gpa >= 50) {
            
            System.out.println(name + " can pass! ");
        } 
        else {
            
            System.out.println(name + " can NOT pass ");
        }
    }
}
