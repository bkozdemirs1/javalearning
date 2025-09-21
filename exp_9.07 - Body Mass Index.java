import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("****************");
		System.out.println("Welcome!");
		System.out.println("****************");

		double height,weight,bmi;

		System.out.println("Please enter your weight: ");
		weight = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Please enter your height (as meter) : ");
		height = scanner.nextDouble();
		scanner.nextLine();

		bmi = (weight) / (height*height);

		if(bmi<18.5) {

			System.out.println("Skinny");
			System.out.println("Your height: "+height+" "+"your weight: "+weight);
			System.out.println("Your Body Mass Index: "+bmi);

		}

		else if(bmi >= 18.5 && bmi < 25) {

			System.out.println("Normal");
			System.out.println("Your height: "+height+" "+"your weight: "+weight);
			System.out.println("Your Body Mass Index: "+bmi);

		}

		else if(bmi >= 25 && bmi < 30) {

			System.out.println("Overweight");
			System.out.println("Your height: "+height+" "+"your weight: "+weight);
			System.out.println("Your Body Mass Index: "+bmi);

		}

		else {

			System.out.println("Obese");
			System.out.println("Your height: "+height+" "+"your weight: "+weight);
			System.out.println("Your Body Mass Index: "+bmi);
		}
	}
}
