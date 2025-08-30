import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int arrayrange;

		System.out.print("Please enter your range: ");

		arrayrange  = scanner.nextInt();
		scanner.nextLine();

		int[] numbers = new int[arrayrange];

		System.out.print("Please enter your numbers: ");

		for(int i=0; i<numbers.length; i++) {

			numbers[i]=scanner.nextInt();
		}

		for(int num:numbers) {
      boolean iseven=true;

			if(num%2==0) {
				iseven=true;
			}

			else {
				iseven=false;
			}
			if(iseven) {
				System.out.println("Even-Number: "+num);
			}
			else {
				System.out.println("Odd-Number: "+num);
			}

		}

	}
}
