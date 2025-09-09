import java.util.Scanner;

class Car {

	private String carname;
	private String model;
	private double speed;

	Car(String carname,String model,double speed) {
		this.carname = carname;
		this.model = model;
		this.speed = speed;

	}

	void accelerate(double s) {

		speed+=s;

		System.out.println("Car has been accelerated "+speed+"km/h");
	}

	void decrease (double d) {

		if(d > speed) {

			System.out.println("Your car has been stopped!");
		}

		else
		{

			speed-=d;

			System.out.println("Car has been decreased "+speed+" " +"km/h");

		}

	}

}

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter your car brand: ");

		String carname = scanner.nextLine();

		System.out.print("Please enter your car model: ");

		String model = scanner.nextLine();

		System.out.print("Please enter your initial speed: ");

		double speed = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Car created: "+carname+" "+model+", "+"speed: "+speed+"km/h");


		Car car1 = new Car(carname,model,speed);

		System.out.println("**********************************");

		System.out.println(" 1--> Increase Speed ");

		System.out.println(" 2--> Decrease Speed");

		System.out.println(" 3--> Exit");

		System.out.println("Please make your choice: ");

		System.out.println("**********************************");

		int number = scanner.nextInt();
		scanner.nextLine();

		switch(number) {

		case 1:

			System.out.print("Enter the acceleration amount: ");

			double acc=scanner.nextDouble();
			scanner.nextLine();

			car1.accelerate(acc);

			break ;

		case 2:

			System.out.print("Enter the deceleration amount: ");

			double dec=scanner.nextDouble();
			scanner.nextLine();

			car1.decrease(dec);

			break;

		case 3:

			System.out.println("Exiting the program. Goodbye!");

			break;

		default:

			System.out.println("Please make your choice range 1-3!");
		}
	}
}
