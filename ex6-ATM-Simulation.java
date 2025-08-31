import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("*****************************");
		System.out.println("WELCOME TO THE ATM SIMULATION");
		System.out.println("*****************************");

		double balance = 2500;

		while (true) {
			
      System.out.println("\n1 - Balance Inquiry");
			System.out.println("2 - Deposit");
			System.out.println("3 - Withdraw");
			System.out.println("0 - Exit");
			System.out.println("*****************************");

			System.out.print("Please make your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you for using our ATM. Goodbye!");
				return;

			case 1:
				System.out.println("Your current balance is: " + balance + " TL");
				break;

			case 2:
				System.out.print("Enter amount to deposit: ");
				double deposit = scanner.nextDouble();
				balance += deposit; 
				System.out.println("You have successfully deposited: " + deposit);
				System.out.println("Your new balance is: " + balance + " TL");
				break;

			case 3:
				System.out.print("Enter amount to withdraw: ");
				double withdraw = scanner.nextDouble();
				if (withdraw > balance) {
					System.out.println("Insufficient balance!");
				} 
        else {
					balance -= withdraw;
					System.out.println("You have successfully withdrawn: " + withdraw);
					System.out.println("Your new balance is: " + balance + " TL");
				}
				
          break;

			default:
				System.out.println("Invalid choice! Please try again.");
			}
		}
	}
}
