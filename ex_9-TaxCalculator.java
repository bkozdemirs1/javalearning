import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double price, pricewithtax, tax_percentage = 0.18;

		System.out.print("Please enter the amount of the product: ");
		price = scanner.nextDouble();
		scanner.nextLine();

		pricewithtax = price + (price*tax_percentage);

		System.out.println("Product's amount with tax: "+pricewithtax);

		scanner.close();
	}
}
