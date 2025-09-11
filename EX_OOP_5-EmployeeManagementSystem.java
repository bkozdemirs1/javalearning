import java.util.Scanner;

class Employee {

	private String employeeid;
	private String name;
	private String surname;
	private String email;
	private String phoneNumber;
	private String position;
	private String departmentId;
	private double salary;
	private double performanceScore;

	Employee(String employeeid, String name, String surname, String email, String phoneNumber, String position, String departmentId) {
		this.employeeid = employeeid;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.position = position;
		this.departmentId = departmentId;
		this.salary = 0;
		this.performanceScore = 0;
	}

	void addSalary(double amount) {
		salary += amount;
		System.out.println(name + " " + surname + "'s monthly salary: " + salary + " TL");
	}

	void applyPerformance(double score) {
		performanceScore = score;
		salary += (salary * performanceScore) / 10;
		System.out.println(name + " " + surname + "'s performance applied with score: " + performanceScore);
		System.out.println("Total salary with performance bonus: " + salary + " TL");
	}

	void updateEmail(String newEmail) {
		email = newEmail;
		System.out.println("New e-mail has been updated: " + email);
	}

	void updatePhoneNumber(String newPhone) {
		phoneNumber = newPhone;
		System.out.println("New phone number has been updated: " + phoneNumber);
	}

	void updatePosition(String newPosition) {
		position = newPosition;
		System.out.println("New position has been updated: " + position);
	}

	void giveRaise(double amount) {
		salary += amount;
		System.out.println("New salary has been increased: " + salary);
	}

	void deductSalary(double amount) {
		salary -= amount;
		System.out.println("New salary has been decreased: " + salary);
	}

	void showInfo() {
		System.out.println("Employee Info: ");
		System.out.println("Employee Id: " + employeeid);
		System.out.println("Name: " + name);
		System.out.println("Surname: " + surname);
		System.out.println("Salary: " + salary);
		System.out.println("Performance Score: " + performanceScore);
		System.out.println("E-mail: " + email);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Position: " + position);
		System.out.println("Department Id: " + departmentId);
	}

	void showCreatedInfo() {
		System.out.println(
		    "Employee created: " + name + " " + surname +
		    " | ID: " + employeeid +
		    " | Department: " + departmentId +
		    " | Salary: " + salary +
		    " | Position: " + position +
		    " | Phone: " + phoneNumber +
		    " | Email: " + email +
		    " | Performance Score: " + performanceScore
		);
	}

}

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Employee's id: ");
		String idd = scanner.nextLine();

		System.out.print("Enter Employee's name: ");
		String name1 = scanner.nextLine();

		System.out.println("Enter Employee's surname: ");
		String name2 = scanner.nextLine();

		System.out.println("Enter Employee's salary: ");
		double salary1 = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Enter Employee's position: ");
		String po1 = scanner.nextLine();

		System.out.println("Enter Employee's performance score: ");
		double p = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Enter Employee's Department Id: ");
		String dp1 = scanner.nextLine();

		System.out.println("Enter Employee's phone number: ");
		String p1 = scanner.nextLine();

		System.out.println("Enter Employee's e-mail: ");
		String m1 = scanner.nextLine();

		Employee e1 = new Employee(idd, name1, name2, m1, p1, po1, dp1);

		e1.addSalary(salary1);
		e1.applyPerformance(p);
		e1.showCreatedInfo();

		System.out.println("******************************");
		System.out.println(" Welcome to Employee Management System");
		System.out.println("******************************");

		while(true) {
			
			System.out.println("1 --> Update position");
			System.out.println("2 --> Update phone number");
			System.out.println("3 --> Update email");
			System.out.println("4 --> Give raise");
			System.out.println("5 --> Deduct salary");
			System.out.println("6 --> Show employee info");
			System.out.println("7 --> Exit");
			System.out.print("Choose an option: ");

			int num = scanner.nextInt();
			scanner.nextLine();

			switch (num) {

				case 1:
					
					System.out.println("Enter Employee's new position: ");
					String np1 = scanner.nextLine();
					e1.updatePosition(np1);
					break;

				case 2:
					
					System.out.println("Enter Employee's new phone number: ");
					String pn1 = scanner.nextLine();
					e1.updatePhoneNumber(pn1);
					break;

				case 3:
					
					System.out.println("Enter Employee's new e-mail: ");
					String em1 = scanner.nextLine();
					e1.updateEmail(em1);
					break;

				case 4:
					
					System.out.println("Enter Employee's amount of raise: ");
					double r1 = scanner.nextDouble();
					scanner.nextLine();
					e1.giveRaise(r1);
					break;

				case 5:
					
					System.out.println("Enter Employee's amount to deduct: ");
					double d1 = scanner.nextDouble();
					scanner.nextLine();
					e1.deductSalary(d1);
					break;

				case 6:
					
					e1.showInfo();
					break;

				case 7:
					
					System.out.println("Exiting the Program... Goodbye!");
					System.exit(0);
					break;

				default:
					
					System.out.println("Invalid option. Try again.");
					break;
			}
		}
	}
}
