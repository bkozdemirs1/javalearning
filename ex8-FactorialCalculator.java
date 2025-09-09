import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("**************************");
		System.out.println("Welcome to the Factorial Calculator!");
		System.out.println("**************************");

		Scanner scanner = new Scanner(System.in);

		int number;
		int Factorial=1;

		System.out.print("Please enter your number: ");

		number=scanner.nextInt();
		scanner.nextLine();

		for(int i=1; i<=number; i++) {

			Factorial*=i;

			System.out.println(i+"! = "+Factorial);
		}

	}
}
