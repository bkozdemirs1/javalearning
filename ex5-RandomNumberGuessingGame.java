import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("WELCOME TO THE NUMBER GUESSING GAME, ARE YOU READY!");

		int guesscounter=0;

		Scanner scanner = new Scanner(System.in);

		int secretNumber = (int)(Math.random() * 100) + 1;

		System.out.print("Please make your guess! : ");

		int guess;

		while(true) {

			guess = scanner.nextInt();
			scanner.nextLine();

			if(guess==secretNumber) {

				System.out.println("Congratulations! You've found it. Want to play another round??");

				guesscounter++;

				System.out.println("Total guess count: "+guesscounter);
				break;
			}

			else if(guess>=secretNumber) {

				System.out.println("Too high! Please try again!");

				guesscounter++;

				System.out.println("Total guess count: "+guesscounter);

			}

			else {

				System.out.println("Too low! Please try again!");

				guesscounter++;

				System.out.println("Total guess count: "+guesscounter);

			}

		}

	}

}
