import java.util.Scanner;

class Queue {
    private String name = "Burak Kaan";
    private String surname = "Özdemir";
    private long id = 15008419570L;
    private int linenum;

    Queue(String name, String surname, long id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.linenum = 0;
    }

    boolean setLineNum(String a, String b, double c) {
        if(name.equalsIgnoreCase(a) && surname.equalsIgnoreCase(b) && id == c) {
            System.out.println("User's Information is correct!");
            linenum = (int)(Math.random() * 100) + 1;
            System.out.println("Your line number: " + linenum);
            return true; 
        } else {
            System.out.println("User's Information is wrong, please try again!");
            return false; 
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue q1 = new Queue("Burak Kaan", "Özdemir", 15008419570L);

        System.out.println("Welcome to the Queue System!");
        boolean correct = false;

        while(!correct) {
            System.out.print("\nPlease enter your name: ");
            String n1 = scanner.nextLine();

            System.out.print("Please enter your surname: ");
            String s1 = scanner.nextLine();

            System.out.print("Please enter your personal-id: ");
            long tc = scanner.nextLong();
            scanner.nextLine(); 

            correct = q1.setLineNum(n1, s1, tc);
        }

        System.out.println("Thank you! Your position has been registered.");
    }
}
