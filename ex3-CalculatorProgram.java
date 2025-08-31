import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator Program!");

        double x, y;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("**************************");
            System.out.println("1 --> Addition (+) ");
            System.out.println("2 --> Substraction (-) ");
            System.out.println("3 --> Multiplication (x) ");
            System.out.println("4 --> Division (/) ");
            System.out.println("5 --> Modulus (%) ");
            System.out.println("0 --> Exit ");
            System.out.println("**************************");
            System.out.print("Please make your decision: ");

            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    System.out.println("You've chosen Addition!");
                    System.out.print("Please enter 2 values: ");
                    x = scanner.nextDouble();
                    y = scanner.nextDouble();
                    System.out.println("The result is: " + (x + y));
                    break;

                case 2:
                    System.out.println("You've chosen Substraction!");
                    System.out.print("Please enter 2 values: ");
                    x = scanner.nextDouble();
                    y = scanner.nextDouble();
                    System.out.println("The result is: " + (x - y));
                    break;

                case 3:
                    System.out.println("You've chosen Multiplication!");
                    System.out.print("Please enter 2 values: ");
                    x = scanner.nextDouble();
                    y = scanner.nextDouble();
                    System.out.println("The result is: " + (x * y));
                    break;

                case 4:
                    System.out.println("You've chosen Division!");
                    System.out.print("Please enter 2 values: ");
                    x = scanner.nextDouble();
                    y = scanner.nextDouble();
                    if (y == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                    } else {
                        System.out.println("The result is: " + (x / y));
                    }
                    break;

                case 5:
                    System.out.println("You've chosen Modulus!");
                    System.out.print("Please enter 2 values: ");
                    x = scanner.nextDouble();
                    y = scanner.nextDouble();
                    System.out.println("The result is: " + (x % y));
                    break;

                case 0:
                    System.out.println("Exiting program... Goodbye!");
                    return; // direkt programı kapatır

                default:
                    System.out.println("Please make your choice between 0-5!");
                    continue;
            }
        }
    }
}
