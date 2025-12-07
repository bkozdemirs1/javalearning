import java.util.Scanner;
import java.util.ArrayList;

class xPackage {

	private String ownerName;
	private double weight;
	private double distance;
	private double price = 0;

	xPackage(String ownerName, double weight, double distance) {

		this.ownerName = ownerName;
		this.weight = weight;
		this.distance = distance;
		calculatePrice();
	}

	void calculatePrice() {

		price = (weight * 10) + (distance * 2);

		if (weight > 20) {
			price += price * 0.15;
		}

		if (distance > 100) {
			price += 50;
		}
	}

	public String getOwnerName() {
		return ownerName;
	}

	public double getWeight() {
		return weight;
	}

	public double getDistance() {
		return distance;
	}

	public double getPrice() {
		return price;
	}
}

class DeliverySystem {

	ArrayList<xPackage> packages = new ArrayList<>();

	void addPackage(String ownerName, double weight, double distance) {

		xPackage p = new xPackage(ownerName, weight, distance);
		packages.add(p);
		System.out.println("Package added successfully!");
	}

	void showAllPackages() {

		if (packages.isEmpty()) {

			System.out.println("No packages found!");
			return;
		}

		int i = 0;

		for (xPackage p : packages) {
			System.out.println((i + 1) + ". Owner's Name: " + p.getOwnerName() +
			                   " | Weight: " + p.getWeight() + " kg" +
			                   " | Distance: " + p.getDistance() + " km" +
			                   " | Price: " + p.getPrice() + " TL");
			i++;
		}
	}

	void showTotalIncome() {
		double sum = 0;
		for (xPackage p : packages) {
			sum += p.getPrice();
		}
		System.out.println("Total Income: "+sum+" "+"TL");
	}

	void showReport() {

		double totalweight = 0;
		double totalprice = 0;
		double totaldistance = 0;
		double averagedistance = 0;

		if (packages.isEmpty()) {

			System.out.println("No packages found!");
			return;
		}

		int i = 0;

		for(xPackage p:packages) {
			totalweight += p.getWeight();
			totalprice += p.getPrice();
			totaldistance += p.getDistance();
			averagedistance += totaldistance/(i + 1);

			i++;
		}
		System.out.println("Total Price: "+totalprice);
		System.out.println("Total Weight: "+totalweight);
		System.out.println("Total Distance: "+totaldistance);
		System.out.println("Average Distance: "+averagedistance);
	}
}

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		DeliverySystem ds = new DeliverySystem();

		System.out.println("Welcome to Smart Package Delivery System!");
		System.out.println("Press Enter to Continue...");
		scanner.nextLine();

		while (true) {

			int ID = (int)(Math.random() * 99999) + 1;

			System.out.println("***************MENU*************");
			System.out.println("1 - Add Package");
			System.out.println("2 - Show All Packages");
			System.out.println("3 - Show Total Income");
			System.out.println("4 - Packages Report");
			System.out.println("0 - Exit");
			System.out.println("*********************************");

			System.out.print("Please make your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {

			case 1:

				System.out.print("Enter Owner's name: ");
				String name = scanner.nextLine();

				System.out.print("Enter package weight (kg): ");
				double w = scanner.nextDouble();
				scanner.nextLine();

				if( w > 500 ) {
					System.out.println("Overweight! Please add a product lower than 500 Kg!");
				}

				else {

					System.out.print("Enter delivery distance (km): ");
					double d = scanner.nextDouble();
					scanner.nextLine();

					if(d > 500) {

						System.out.println("Overroad! Please add a destination lower than 500 Km!");
					}

					else {

						ds.addPackage(name, w, d);

						System.out.println("Package ID: "+"#"+ID);

						break;
					}
				}

			case 2:

				System.out.println("The owners packages are as follows: ");
				ds.showAllPackages();

				break;

			case 3:

				ds.showTotalIncome();

				break;

			case 4:

				ds.showReport();

				break;

			case 0:

				System.out.println("Exiting The System... Goodbye!");

				return;
			}
		}
	}
}
