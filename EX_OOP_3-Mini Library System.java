import java.util.Scanner;

class Library {
	
	private String bookname;
	private String author;
	private int year;
	private int howmany = 5;

	Library(String bookname,String author,int year) {

		this.bookname = bookname;
		this.author = author;
		this.year = year;
	}

	void borrow(int b) {

		if((howmany-b)<0) {

			System.out.println("Sorry,"+" "+bookname+" is not available right now.");
		}

		else {
			System.out.println(b+" "+bookname+" "+"has been borrowed successfully!");
			howmany-=b;

			System.out.println("The remaining number of books from "+bookname+" "+"is: "+howmany);

		}
	}

	void returnbook(int c) {

		System.out.println(bookname+" "+"has been returned. Thank you!");
		howmany+=c;
		System.out.println("There are total"+" "+howmany+" "+bookname);

	}

	void showInfo() {

		System.out.println("Current book Info: ");
		System.out.println("Title: "+ bookname);
		System.out.println("Author: "+ author);
		System.out.println("Year: "+ year);
		System.out.println("Available copies: " + howmany);


	}
}

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter your book name: ");

		String name = scanner.nextLine();

		System.out.print("\nPlease enter your book's author: ");

		String writer = scanner.nextLine();

		System.out.print("\nPlease enter your book's year: ");

		int date = scanner.nextInt();
		scanner.nextLine();

		System.out.println("\n"+name+" "+"by"+" "+writer+" "+"has been created!");

		Library b1 = new Library(name,writer,date);

		System.out.println("\nLibrary System Started!");
		System.out.println("\nBooks loaded into the library...");

		while(true) {

			System.out.println("\nFor borrow the book --> 1");
			System.out.println("\nFor return the book --> 2");
			System.out.println("\nFor see the book's Info --> 3");
			System.out.println("\nExit --> 4");
			System.out.print("\nPlease make your choice: ");

			int number = scanner.nextInt();
			scanner.nextLine();

			switch(number) {

			case 1:

				System.out.print("How many book you want to borrow: ");
				int a = scanner.nextInt();
				scanner.nextLine();

				b1.borrow(a);

				break;

			case 2:

				System.out.print("How many book you want to return: ");

				int x = scanner.nextInt();
				scanner.nextLine();

				b1.returnbook(x);

				break;

			case 3:

				b1.showInfo();

				break;

			case 4:

				System.out.println("Exiting the program... Goodbye!");

				return;

			default:

				System.out.println("Invalid choice! Please select 1-4.");
				
				break;

			}
		}
	}
}
