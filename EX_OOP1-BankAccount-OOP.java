import java.util.Scanner;

class BankAccount {
	private String owner;
	private double balance;

	BankAccount(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}

	void deposit(double amount) {
		balance += amount;
		System.out.println(amount + " deposited. New balance: " + balance);
	}

	void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient funds! Please try again!");
		} else {
			balance -= amount;
			System.out.println(amount + " withdrawn. New balance: " + balance);

		}

	}

	void showInfo() {
		System.out.println(owner + "'s balance: " + balance);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your name: ");
		String owner = scanner.nextLine();

		System.out.println("Please enter your starting balance: ");
		double balance = scanner.nextDouble();
		scanner.nextLine();

		BankAccount account1 = new BankAccount(owner, balance);

		account1.showInfo();

		System.out.println("Enter deposit amount: ");
		double depositAmount = scanner.nextDouble();
		scanner.nextLine();
		account1.deposit(depositAmount);

		System.out.println("Enter withdrawal amount: ");
		double withdrawAmount = scanner.nextDouble();
		scanner.nextLine();
		account1.withdraw(withdrawAmount);

		scanner.close();
	}
}
