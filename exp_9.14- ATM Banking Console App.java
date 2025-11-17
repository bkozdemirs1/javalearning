import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int pin;
		int acc_id = (int)(Math.random() * 100000) + 1;

		System.out.print("Please enter your 4-digit pin: ");
		pin = scanner.nextInt();
		scanner.nextLine();

		double balance = 10000;
		double totalDeposit = 0;
		double totalWithdraw = 0;

		while(true) {

			if(pin == 1234) {

				System.out.println("You will be transferred to the main menu...");
				System.out.println("Your Account ID: #ID" + acc_id);

				System.out.println("*********MENU***********");
				System.out.println("0- Exit");
				System.out.println("1- Show The Balance");
				System.out.println("2- Deposit");
				System.out.println("3- Withdraw");
				System.out.println("4- Show The Extract");
				System.out.println("5- Change Pin");
				System.out.println("6- Bill Payment");
				System.out.println("************************");

				System.out.print("Please make your choice: ");
				int choice = scanner.nextInt();
				scanner.nextLine();

				switch(choice) {

				case 1:
					System.out.println("Current Balance: " + balance + " TL");
					break;

				case 2:
					System.out.print("Enter deposit amount: ");
					double deposit = scanner.nextDouble();
					scanner.nextLine();

					balance += deposit;
					totalDeposit += deposit;

					System.out.println("Deposit successful!");
					System.out.println("Current Balance: " + balance + " TL");
					break;

				case 3:
					System.out.print("Enter withdraw amount: ");
					double withdraw = scanner.nextDouble();
					scanner.nextLine();

					if(balance >= withdraw) {
						balance -= withdraw;
						totalWithdraw += withdraw;

						System.out.println("Withdraw successful!");
						System.out.println("Current Balance: " + balance + " TL");
					}
					else {
						System.out.println("Insufficient Funds!");
					}
					break;

				case 4:
					System.out.println("Total Deposited: " + totalDeposit + " TL");
					System.out.println("Total Withdrawn: " + totalWithdraw + " TL");
					System.out.println("Net Change: " + (totalDeposit - totalWithdraw) + " TL");
					break;

				case 5:
					System.out.print("Enter your old pin: ");
					int oldPin = scanner.nextInt();
					scanner.nextLine();

					if(pin == oldPin) {
						System.out.print("Enter your new pin: ");
						int newPin1 = scanner.nextInt();
						System.out.print("Enter your new pin again: ");
						int newPin2 = scanner.nextInt();

						if(newPin1 == newPin2) {
							pin = newPin1;
							System.out.println("Your pin has been changed successfully!");
						} else {
							System.out.println("Pins do not match!");
						}
					} else {
						System.out.println("Wrong old pin!");
					}
					break;

				case 6:

					System.out.println("********* BILL PAYMENT **********");
					System.out.println("1 - Electricity Bill (250 TL)");
					System.out.println("2 - Water Bill (150 TL)");
					System.out.println("3 - Internet Bill (300 TL)");
					System.out.println("4 - Exit");
					System.out.println("*********************************");
					System.out.print("Please select the bill you want to pay: ");

					int select = scanner.nextInt();
					scanner.nextLine();

					double amount = 0;
					String billName = "";

					if(select == 1) {
						billName = "Electricity";
						amount = 250;
					}
					else if(select == 2) {
						billName = "Water";
						amount = 150;
					}
					else if(select == 3) {
						billName = "Internet";
						amount = 300;
					}
					else {
						System.out.println("Returning to main menu...");
						break;
					}

					System.out.println("Selected Bill: " + billName);
					System.out.println("Amount to Pay: " + amount + " TL");

					System.out.print("Do you confirm payment? (yes/no): ");
					String confirm = scanner.nextLine();

					if(confirm.equalsIgnoreCase("yes")) {
						if(balance >= amount) {
							balance -= amount;
							System.out.println("Payment completed!");
							System.out.println("Current Balance: " + balance + " TL");
						} else {
							System.out.println("Insufficient balance! Payment failed.");
						}
					} else {
						System.out.println("Payment canceled.");
					}

					break;

				case 0:
					System.out.println("Exiting the System... Goodbye!");
					return;

				default:
					System.out.println("Invalid choice! Try again.");
				}
			}
			else {
				System.out.println("Wrong password, please enter again!");
				break;
			}
		}
	}
}
