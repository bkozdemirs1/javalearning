import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double result = 0;
		double hometax = 0;
		double discount = 0;
		double business_tax = 0;
		double creditcardtax = 0;
		double cashdiscount = 0;

		int id = (int)(Math.random() * 10000) + 1;

		System.out.print("Please enter your name: ");
		String name = scanner.nextLine();

		System.out.print("Enter customer type (home/business): ");
		String customer_type = scanner.nextLine();

		System.out.print("Enter payment method (cash/credit card): ");
		String payment_method = scanner.nextLine();

		System.out.print("Enter water usage as m³ (1mB3 water = 5 TL): ");
		Double water_usage = scanner.nextDouble();
		scanner.nextLine();

		if(water_usage >= 50 && customer_type.equals("business") ) {

			business_tax = (water_usage)*0.2;
			result += (water_usage*5) + business_tax;
		}

		else if(water_usage >= 50 && customer_type.equals("home") ) {

			hometax = (water_usage)*0.1;
			result += (water_usage*5) + hometax;
		}

		else {

			result += (water_usage*5);
		}

		if (result > 1000 && payment_method.equals("cash")) {
			cashdiscount = ((water_usage) * 5) * 0.02;
			discount = ((water_usage) * 5) * 0.05;
			result -= discount + cashdiscount;
		}

		else if (result > 1000 && payment_method.equals("credit card")) {
			discount = ((water_usage) * 5) * 0.05;
			creditcardtax = ((water_usage) * 5) * 0.02;
			result = result - discount + creditcardtax;
		}


		System.out.println("-------------------------------");
		System.out.println("Customer Name: "+name);
		System.out.println("Subscription ID: "+id);
		System.out.println("Customer Type: "+customer_type);
		System.out.println("Payment Method: "+payment_method);
		System.out.println("-------------------------------");
		
		System.out.println("Base Total: "+(water_usage*5)+" "+"TL");
		System.out.println("Home Tax(%10): "+"+"+hometax+" "+"TL");
		System.out.println("Business Tax(%20): "+"+"+business_tax+" "+"TL");
		System.out.println("Discount For Over 1000 TL (%5): "+"-"+discount+" "+"TL");
		System.out.println("Credit Card Fee(%2): "+"+"+creditcardtax+" "+"TL");
		System.out.println("Cash Discount(%2): "+"-"+cashdiscount+" "+"TL");
		System.out.println("-------------------------------");
		
		System.out.println("Final Total: "+result+" "+"TL");
		System.out.println("Thank you for choosing our service!");
	}
}
