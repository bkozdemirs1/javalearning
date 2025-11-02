import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double score = 0;
		String choice1,choice2,choice3,choice4,choice5;
		int correctanswers = 0;
		int falseanswers = 0;
		int id = (int)(Math.random() * 10000) + 1;

		System.out.print("Enter your name before the Quiz Game starts! :");
		String name = scanner.nextLine();

		System.out.println("=====================================");
		System.out.println("         JAVA QUIZ GAME        ");
		System.out.println("=====================================");

		System.out.println("Question 1: What is the capital of France?");
		System.out.println("a) Paris");
		System.out.println("b) Berlin");
		System.out.println("c) Rome");
		System.out.print("Enter your answer: ");
		choice1 = scanner.nextLine();

		if( choice1.equalsIgnoreCase("a") ) {

			System.out.println("True Answer!");
			score += 20;
			correctanswers++;
		}

		else {

			System.out.println("Wrong answer!");
			falseanswers++;
		}

		System.out.print("Press Enter to continue...");
		scanner.nextLine();

		System.out.println("Question 2: Which planet is known as the Red Planet? ");
		System.out.println("a) Venus");
		System.out.println("b) Mars");
		System.out.println("c) Jupiter");
		System.out.print("Enter your answer: ");
		choice2 = scanner.nextLine();

		if(choice2.equalsIgnoreCase("b") ) {

			System.out.println("True Answer!");
			score += 20;
			correctanswers++;
		}

		else {

			System.out.println("Wrong Answer!");
			falseanswers++;
		}

		System.out.print("Press Enter to continue...");
		scanner.nextLine();

		System.out.println("Question 3: Who developed Java?");
		System.out.println("a) James Gosling");
		System.out.println("b) Elon Musk");
		System.out.println("c) Bill Gates");
		System.out.println("Enter your answer: ");
		choice3 = scanner.nextLine();

		if(choice3.equalsIgnoreCase("a") ) {

			System.out.println("True Answer!");

			score += 20;
			correctanswers++;
		}

		else {

			System.out.println("Wrong Answer!");
			falseanswers++;
		}

		System.out.print("Press Enter to continue...");
		scanner.nextLine();

		System.out.println("Question 4: What is 5 * 6?");
		System.out.println("a) 11");
		System.out.println("b) 25");
		System.out.println("c) 30");
		System.out.print("Enter your answer: ");
		choice4 = scanner.nextLine();

		if(choice4.equalsIgnoreCase("c") ) {

			System.out.println("True Answer!");

			score += 20;
			correctanswers++;
		}

		else {

			System.out.println("Wrong Answer!");
			falseanswers++;
		}

		System.out.print("Press Enter to continue...");
		scanner.nextLine();

		System.out.println("Question 5: Which keyword is used to create a class in Java?");
		System.out.println("a) function");
		System.out.println("b) define");
		System.out.println("c) class");
		System.out.print("Enter your answer: ");
		choice5 = scanner.nextLine();

		if(choice5.equalsIgnoreCase("c") ) {

			System.out.println("True Answer!");

			score += 20;
			correctanswers++;
		}

		else {

			System.out.println("Wrong Answer!");
			falseanswers++;
		}

		System.out.print("Press Enter to see your results!");
		scanner.nextLine();

		System.out.println("----------------Summary----------------");
		System.out.println("Competitor Name: "+name);
		System.out.println("Competitor ID: "+id);
		System.out.println("Correct Answers: "+correctanswers);
		System.out.println("False Answers: "+falseanswers);
		System.out.println("Total Score: "+score);
		System.out.println("Success Rate: "+(correctanswers*20)+"%");
		System.out.println("----------------------------------------");

		if(score>= 70) {

			System.out.println("Well done, keep it up!");
		}

		else if(score <= 69) {

			System.out.println("Nice Try, try again for better result!");
		}
	}
}
