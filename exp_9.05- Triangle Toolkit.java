import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*************");
		System.out.println("Welcome!");
		System.out.println("************");

		double side_a, side_b, side_c;

		System.out.print("Enter the first side of the right triangle (a): ");
		side_a = scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Enter the second side of the right triangle (b): ");
		side_b = scanner.nextDouble();
		scanner.nextLine();

		side_c = Math.sqrt((side_a*side_a) + (side_b*side_b));

		double area = (side_a * side_b) / 2;

		System.out.println("Hypotenuse (c) =  "+side_c);
		System.out.println("Area = "+ area);

		double angle_A_rad = Math.asin(side_a / side_c);
		double angle_B_rad = Math.asin(side_b / side_c);

		double angle_A_deg = angle_A_rad * 180.0 / Math.PI;
		double angle_B_deg = angle_B_rad * 180.0 / Math.PI;

		System.out.println("Angle opposite side a (A) = " + angle_A_deg + " degrees");
		System.out.println("Angle opposite side b (B) = " + angle_B_deg + " degrees");
	}
}
