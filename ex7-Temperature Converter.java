import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("******************************");
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("******************************");

        Scanner scanner = new Scanner(System.in);

        System.out.println("From Celsius to Fahrenheit --> 1");
        System.out.println("From Fahrenheit to Celsius --> 2");

        System.out.print("Please make your choice: ");
        int number = scanner.nextInt();

        double c, f; 

        switch (number) {
            case 1:
                System.out.print("Please enter temperature in Celsius: ");
                c = scanner.nextDouble();
                f = (c * 9.0 / 5) + 32;
                System.out.println(c + " °C = " + f + " °F");
                break;

            case 2:
                System.out.print("Please enter temperature in Fahrenheit: ");
                f = scanner.nextDouble();
                c = (f - 32) * 5.0 / 9;
                System.out.println(f + " °F = " + c + " °C");
                break;

            default:
                System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        scanner.close();
    }
}
