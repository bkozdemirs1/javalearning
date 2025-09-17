import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("***********************");
		System.out.println("Welcome!");
		System.out.println("****************");

		double x,y,result1,result2;

		System.out.print("Please enter the long side: ");
		x=scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Please enter the short side: ");
		y=scanner.nextDouble();
		scanner.nextLine();

		result1 = (2*x)+(2*y);
		result2 = (x*y);

		System.out.println("Perimeter of the rectangle: "+result1);
		System.out.println("Area of the rectangle: "+result2);

		scanner.close();

	}
}
