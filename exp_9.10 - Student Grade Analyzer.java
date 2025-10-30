import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int index;
		double average = 0;

		System.out.print("Please enter number of students: ");

		index = scanner.nextInt();
		scanner.nextLine();

		double[] grades = new double[index];

		String[] names = new String[index];

		double maxgrade = Integer.MIN_VALUE;
		double mingrade = Integer.MAX_VALUE;

		for(int i=0; i<grades.length; i++) {

			System.out.print("Enter student name for"+" "+(i+1)+": ");
			names[i] = scanner.nextLine();

			System.out.print("Enter grade for"+" "+names[i]+": ");
			grades[i] = scanner.nextDouble();
			scanner.nextLine();

		}

		System.out.println("---- Class Summary ----");

		for(int i=0; i<grades.length; i++) {

			System.out.print(names[i]+": "+grades[i]+"\n");

		}

		String maxName = "", minName = "";

		for (int i = 0; i < grades.length; i++) {
			average += grades[i];

			if (grades[i] > maxgrade) {
				maxgrade = grades[i];
				maxName = names[i];
			}

			if (grades[i] < mingrade) {
				mingrade = grades[i];
				minName = names[i];
			}
		}

		average /= grades.length;

		System.out.println("Average: " + average);
		System.out.println("Highest Grade: " + maxgrade + " (" + maxName + ")");
		System.out.println("Lowest Grade: " + mingrade + " (" + minName + ")");
	}
}
