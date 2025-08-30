import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int arraysize;

		System.out.print("Please enter your range: ");

		arraysize = scanner.nextInt();
		scanner.nextLine();

		int[] numbers = new int[arraysize];

		System.out.print("Please enter your numbers: ");

		for(int i=0; i<numbers.length; i++) {

			numbers[i] = scanner.nextInt();

		}

		for(int num:numbers) {

			boolean isprime=true;

			if(num<=1) {
				isprime=false;
			}

			else {
				for(int i=2; i<num; i++) {
					if(num%i==0) {
						isprime=false;
						break;
					}

				}

			}

			if(isprime) {
				System.out.println("Prime-Number: "+num);
			}
			else {
				System.out.println("Non-Prime Number: "+num);
			}
		}

	}

}
