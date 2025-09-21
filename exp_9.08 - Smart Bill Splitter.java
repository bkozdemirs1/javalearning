import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("***************");
		System.out.println("Welcome!");
		System.out.println("****************");

		double bill;
		double tip;
		int person;
		double tip_amount;
		double total_amount;
		double each_person;

		System.out.println("Enter the bill amount: ");
		bill = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Enter the tip percentage: ");
		tip = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("How many people to split the bill: ");
		person = scanner.nextInt();
		scanner.nextLine();

		tip_amount = bill * (tip / 100);

		total_amount = bill + tip_amount;

		each_person = total_amount / person;
		
		System.out.println("Tip amount: "+tip_amount);
		System.out.println("Total amount (bill + tip): "+total_amount);
		System.out.println("Each person should pay: "+each_person);
	}
}
