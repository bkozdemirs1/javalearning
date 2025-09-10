import java.util.Scanner;

class Taxi {

	private String plate;
	private String driver;
	private double totalDistance=0;
	private double totalEarnings=0;
	private double longestRide = 0;


	Taxi(String plate,String driver,double totalDistance,double totalEarnings) {

		this.plate = plate;
		this.driver = driver;
		this.totalDistance = totalDistance;
		this.totalEarnings = totalEarnings;
	}

	void pickUp(double km) {

		totalDistance+=km;

		if (km > longestRide) {
			longestRide = km;
		}

		System.out.println("Total Distance is: " + totalDistance);
	}

	void dropoff(double fare) {

		totalEarnings+=fare;

		System.out.println("Passenger dropped off. Earned: "+totalEarnings+"TL");

		System.out.println("Total Earning is: "+totalEarnings+"TL");

	}

	void showInfo() {

		System.out.println("Taxi Info: ");
		System.out.println("Driver name: "+driver);
		System.out.println("Taxi's Plate: "+plate);
		System.out.println("Total Distance: "+totalDistance);
		System.out.println("Total Earning: "+totalEarnings);
		if (totalDistance > 0) {
			System.out.println("Average earning per km: " + (totalEarnings / totalDistance) + " TL/km");
		}

		System.out.println("Longest ride: " + longestRide + " km");
	}
}

public class Main
{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter Driver name: ");

		String b = scanner.nextLine();

		System.out.print("Enter taxi plate: ");

		String a = scanner.nextLine();

		System.out.println("Taxi " + a + " with driver " + b + " created successfully!");

		Taxi t1 = new Taxi(a,b,0,0);

		while(true) {
			System.out.println("\n1 Pick up passenger (add distance)");
			System.out.println("2 --> Drop off passenger (add fare)");
			System.out.println("3 --> Show taxi info");
			System.out.println("4 --> Exit");
			System.out.print("Please make your choice: ");

			int num = scanner.nextInt();
			scanner.nextLine();

			switch(num) {

			case 1:
				System.out.print("Enter distance (km): ");
				double c = scanner.nextDouble();
				scanner.nextLine();

				t1.pickUp(c);

				break;

			case 2:

				System.out.print("Enter fare amount: ");

				double d = scanner.nextDouble();
				scanner.nextLine();

				t1.dropoff(d);

				break;

			case 3:
				t1.showInfo();

				break;

			case 4:

				System.out.println("Exiting... Goodbye!");

				System.exit(0);

				return;

			default:

				System.out.println("Invalid choice! Please select 1-4.");

				break;
			}
		}
	}
}
