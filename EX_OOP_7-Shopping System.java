import java.util.ArrayList;
import java.util.Scanner;

class Shopping {
	private String productName;
	private double productPrice;

	Shopping(String productName, double productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}

	void showInfo() {
		System.out.println(productName + " - " + productPrice + " TL");
	}

	double getPrice() {
		return productPrice;
	}
}

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Shopping> cart = new ArrayList<>();

		int choice;

		System.out.println("*************");
		System.out.println("Welcome!");
		System.out.println("*************");

		while (true) {
			System.out.println("\n1. Add Product");
			System.out.println("2. View Cart");
			System.out.println("0. Exit");
			System.out.print("Please make your choice: ");

			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:

				System.out.print("Product Name: ");
				String name = scanner.nextLine();

				System.out.print("Product's Price: ");
				double price = scanner.nextDouble();
				scanner.nextLine();

				cart.add(new Shopping(name, price));
				System.out.println("Product added successfully!");

				break;

			case 2:

				if (cart.isEmpty()) {
					System.out.println("Your cart is empty!");
				} else {
					double total = 0;
					System.out.println("Products in your cart:");
					for (Shopping s : cart) {
						s.showInfo();
						total += s.getPrice();
					}
					System.out.println("Total Price: " + total + " TL");
				}
				break;

			case 0:

				System.out.println("Exiting...");
				return;

			default:

				System.out.println("Invalid choice!");

			}
		}

		scanner.close();
	}
}
