import java.util.Scanner; // For using Scanner!

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Ask for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Output
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}
