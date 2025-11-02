import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double total = 0;
		double discount = 0;
		double sedan = 700,  SUV = 1000,  Hatchback = 500;
		int id = (int)(Math.random() * 100000) + 1;

		System.out.println("Welcome to FastCar Rental System!");
		System.out.print("Enter your name: ");
		String customer_name = scanner.nextLine();

		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		scanner.nextLine();

		if(age < 18) {

			System.out.println("You must be over 18 to rent a car.");
		}
		else {

			System.out.println("Choose car type: ");
			System.out.println("1. Sedan 700 TL/day (4 seats, economic) ");
			System.out.println("2. SUV 1000 TL/day (7 seats, 4x4) ");
			System.out.println("3. Hatchback 500 TL/day (4 seats, city car) ");
			System.out.print("Your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Enter rental days: ");
			int rentday = scanner.nextInt();
			scanner.nextLine();

			if (choice == 1 && rentday >= 7 ) {

				discount = (sedan*rentday)*0.1;
				total += sedan*rentday;
				total -= discount;

			}

			else if (choice == 2 && rentday >= 7 ) {

				discount = (SUV*rentday)*0.1;
				total += SUV*rentday;
				total -= discount;
			}

			else if (choice == 3 && rentday >= 7 ) {

				discount = (Hatchback*rentday)*0.1;
				total += Hatchback*rentday;
				total -= discount;
			}
			else {

				System.out.println("Please make your choice range in 1-3!");
			}

			System.out.print("Would you like insurance for +200 TL/day? (yes/no)");
			String insperday = scanner.nextLine();

			if (insperday.equals("yes")) {
				total += rentday * 200;
			}

			System.out.println("---------- RENTAL SUMMARY ----------");
			System.out.println("Customer Name: "+customer_name);
			System.out.println("Customer Age: "+age);
			System.out.println("Car ID: "+"#CAR"+id);
			if(choice == 1) {

				System.out.println("Car Type: Sedan");
			}

			else if(choice == 2) {

				System.out.println("Car Type: SUV");
			}

			else {

				System.out.println("Car Type: Hatchback");
			}

			System.out.println("Rental Days: "+rentday);
			System.out.println("Base Total: "+(total+discount));
			System.out.println("Discount(%10): "+discount);
			System.out.println("Total Insurance: "+(200*rentday));
			System.out.println("----------------------------------");
			System.out.println("Final Total: "+total);
		}
	}
}
