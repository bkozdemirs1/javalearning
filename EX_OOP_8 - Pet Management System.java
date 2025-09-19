import java.util.Scanner;
import java.util.ArrayList;

class Pet {

	private String name;
	private String type;
	private int age;

	Pet(String name,String type,int age) {

		this.name = name;
		this.type = type;
		this.age = age;
	}

	void setName(String n) {
		this.name = n;
	}

	String getName() {
		return name;
	}

	void setType(String t) {

		this.type = t;
	}

	String getType() {
		return type;
	}

	void setAge(int a) {
		this.age = a;
	}

	int getAge() {
		return age;
	}

}

class Owner {

	private String name;
	private String phoneNumber;
	ArrayList<Pet> pets;

	Owner(String name,String phoneNumber) {

		this.name = name;
		this.phoneNumber = phoneNumber;
		this.pets = new ArrayList<>();
	}

	void setOwnerName(String a) {

		this.name = a;
	}

	String getOwnerName() {

		return name;
	}

	void setOwnerPhoneNumber(String p) {

		this.phoneNumber = p;
	}

	String getOwnerPhoneNumber() {

		return phoneNumber;
	}

	void addPet(Pet a) {

		pets.add(a);
	}

	void removePet(Pet a) {

		pets.remove(a);
	}

	void UpdatePet(Pet p, String new_name, String new_type, int new_age) {

		p.setName(new_name);
		p.setType(new_type);
		p.setAge(new_age);

		System.out.println("Pet's Current Name: " + p.getName());
		System.out.println("Pet's Current Type: " + p.getType());
		System.out.println("Pet's Current Age: " + p.getAge());
	}

	void AddedSuccessfully() {

		System.out.println("Your Pet has been added successfully!");
	}


	void showPet() {

		System.out.println("Pet Info: ");

		for(Pet p:pets) {
			System.out.println(p.getName()+" "+p.getType()+" "+p.getAge()+" "+"Owner: "+getOwnerName());
		}

	}

	void showOwner() {

		System.out.println("Owner Info: ");
		System.out.println("Owner's Name: "+getOwnerName());
		System.out.println("Owner's Phone Number: "+getOwnerPhoneNumber());
	}

}

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("***************");
		System.out.println("Welcome!");
		System.out.println("***************");

		Owner o1 = null;

		while(true) {

			System.out.println("***************");
			System.out.println(" 1 --> Add a Pet ");
			System.out.println(" 2 --> Show Pets");
			System.out.println(" 3 --> Update Pet's Info");
			System.out.println(" 4 --> Show Owner Info: ");
			System.out.println(" 5 --> Remove a Pet ");
			System.out.println(" 0 --> Exit");
			System.out.println("***************");

			System.out.print("Please make your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch(choice) {

			case 1:

				System.out.print("Enter Pet's name: ");
				String petName = scanner.nextLine();

				System.out.print("Enter Pet's type: ");
				String petType = scanner.nextLine();

				System.out.print("Enter Pet's age: ");
				int petAge = scanner.nextInt();
				scanner.nextLine();

				Pet p1 = new Pet(petName, petType, petAge);

				if (o1 == null) {

					System.out.print("Owner's Name: ");
					String ownerName = scanner.nextLine();

					System.out.print("Owner's Phone Number: ");
					String ownerPhone = scanner.nextLine();

					o1 = new Owner(ownerName, ownerPhone);
				}

				o1.addPet(p1);

				o1.AddedSuccessfully();

				break;

			case 2:

				if(o1 != null) {

					o1.showPet();
				}

				else {

					System.out.println("No owner found! Please add a pet first.");
				}

				break;

			case 3:

				if(o1 != null) {

					o1.showPet();
				}

				else {

					System.out.println("No owner found! Please add a pet first.");
				}

				System.out.println("Which pet do you want to update?");
				System.out.print("Please enter a index (0 is the first pet!): ");

				int index = scanner.nextInt();
				scanner.nextLine();

				if(index >= 0 && index < o1.pets.size()) {

					Pet selectedpet = o1.pets.get(index);

					System.out.print("Enter a new pet name: ");
					String name = scanner.nextLine();


					System.out.print("Enter a new pet type: ");
					String type = scanner.nextLine();

					System.out.print("Enter a new pet age: ");
					int age = scanner.nextInt();

					o1.UpdatePet(selectedpet,name,type,age);
				}

				else {

					System.out.println("Invalid index! Try again.");
				}

				break;

			case 4:

				if(o1 != null) {

					o1.showOwner();
				}

				else {

					System.out.println("No Data Found , Please Add a Owner Info ");
				}

				break;

			case 5:

				if(o1 != null) {

					o1.showPet();
				}

				else {

					System.out.println("No owner found! Please add a pet first.");
				}

				System.out.println("Which pet do you want to remove?");
				System.out.println("Please enter a index starts from 0");

				int remove_index = scanner.nextInt();
				scanner.nextLine();

				if(remove_index >= 0 && remove_index < o1.pets.size()) {

					Pet removepet = o1.pets.get(remove_index);
					o1.removePet(removepet);
					System.out.println("Pet removed successfully!");
				}

				else {

					System.out.println("Invalid index! Try again.");
				}


				break;

			case 0:

				System.out.println("Exiting The System... Goodbye!");

				System.exit(0);

				break;

			default:

				System.out.println("Please make choice range in 0-5");

				break;
			}
		}
	}
}
