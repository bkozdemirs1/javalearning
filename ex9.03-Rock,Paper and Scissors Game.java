import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int user;
		int userScore = 0, botScore = 0;

		System.out.println("****************");
		System.out.println("Welcome To The Rock, Paper and Scissors Game!");
		System.out.println("****************");

		do {

			System.out.println("\nFor Rock --> 1");
			System.out.println("For Paper --> 2");
			System.out.println("For Scissors --> 3");
			System.out.println("For Exit --> 0");
			System.out.print("Please make your choice: ");

			user = scanner.nextInt();
			scanner.nextLine();

			if (user == 0) {

				System.out.println("Game Over!");
				break;
			}

			int bot = (int)(Math.random() * 3) + 1;

			if (user == bot) {

				System.out.println("Draw, no points!");
			}
			else if (user == 1 && bot == 3) {

				System.out.println("You won! (Rock beats Scissors)");

				userScore++;
			}
			else if (user == 2 && bot == 1) {

				System.out.println("You won! (Paper beats Rock)");

				userScore++;
			}
			else if (user == 3 && bot == 2) {

				System.out.println("You won! (Scissors beats Paper)");

				userScore++;
			}
			else {

				System.out.println("Computer wins!");

				botScore++;
			}

			System.out.println("Your total wins: " + userScore);
			System.out.println("Computer's total wins: " + botScore);



		} while (user != 0);

		if (userScore > botScore) {

			System.out.println("You are the Champion of Rock , Paper and Scissors Game!");
		}

		else {

			System.out.println("Computer is the Champion but don't worry, try again!");
		}
	}
}
