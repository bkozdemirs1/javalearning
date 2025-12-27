import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList <String> products = new ArrayList<>();
		ArrayList <Double> prices = new ArrayList<>();
		ArrayList <Integer> quantity = new ArrayList<>();

		double result = 0;

		while(true) {

			System.out.println("-------------MENU-----------");
			System.out.println("1. Add Product");
			System.out.println("2. View Card");
			System.out.println("3. Remove Product");
			System.out.println("4. Show Total");
			System.out.println("5. Clear Cart");
			System.out.println("0. Exit");
			System.out.println("----------------------------");

			System.out.print("Please make your choice: ");
			int menu = scanner.nextInt();
			scanner.nextLine();

			if (menu == 0) {

				System.out.println("Exiting... Goodbye!");
				break;
			}

			if (menu == 1) {

				System.out.print("Enter product name: ");
				String a = scanner.nextLine();
				products.add(a);

				System.out.print("How many would you like? ");
				int q = scanner.nextInt();
				scanner.nextLine();
				quantity.add(q);

				System.out.print("Enter product price: ");
				double b = scanner.nextDouble();
				scanner.nextLine();
				prices.add(b);
				result += (b*q);

				System.out.println("Item added to your cart !");
			}

			else if (menu == 2) {

				if(products.size() == 0){
				    
				    System.out.println("There is no item in your cart yet !");
				    System.out.println("Please add item first !");
				}
				
				else {
				    
				    for(int i=0; i<products.size(); i++) {

					System.out.println((i+1) + ". " + products.get(i) + " - " + prices.get(i) + "*"+quantity.get(i)+"="+(prices.get(i)*quantity.get(i))+" "+"TL");
				}
	
				}
			}

			else if (menu == 3) {

				System.out.print("Enter index to remove (0-based): ");
				int index = scanner.nextInt();
				scanner.nextLine();
				products.remove(index);
				System.out.println("Item removed from your cart !");

			}

			else if (menu == 4) {

				for(int i=0; i<products.size(); i++) {

					System.out.println("Total Price: "+prices.get(i)+" "+"TL");
				}
			}

			else if (menu == 5) {

				products.clear();
				prices.clear();
				result = 0;

			}
		}
	}
}
