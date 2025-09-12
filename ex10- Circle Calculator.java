import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num;
		double r, pi=3.14, result=0 ;

		System.out.println("**************");
		System.out.println("Welcome to the Circle Calculation! ");
		System.out.println("**************");

		while(true) {

			System.out.println("For Area --> 1 ");
			System.out.println("For Perimeter --> 2 ");
			System.out.println("For Both --> 3");
			System.out.println("For Exit --> 4 ");
			System.out.print("Please make your choice: ");
			
      num = scanner.nextInt();
			scanner.nextLine();

			switch(num) {

			case 1:

				System.out.print("Please enter radius: ");
				r = scanner.nextDouble();
				scanner.nextLine();
				result = (pi)*(r*r);
				System.out.println("Your area is: "+result);

				break;

			case 2:

				System.out.println("Please enter your radius: ");
				r = scanner.nextDouble();
				scanner.nextLine();
				result = 2*pi*r;
				System.out.println("Your perimeter is: "+result);

				break;

			case 3:

				System.out.println("Please enter your radius: ");
				r = scanner.nextDouble();
				scanner.nextLine();
				result = (pi)*(r*r);
				double result2 = 2*pi*r;
				System.out.println("Your area is: "+result);
				System.out.println("Your perimeter is: "+result2);

				break;

			case 4:

				System.out.println("Exiting the system... Goodbye! ");
				
				System.exit(0);

				break;

			default:

				System.out.println("Please make your choice between 1-4! ");

				break;
			}
		}
	}
}
