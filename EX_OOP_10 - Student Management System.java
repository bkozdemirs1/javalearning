import java.util.Scanner;
import java.util.ArrayList;

class Student {

	private String name;
	private String lastName;
	private int id;
	private String department;
	private double gpa;

	Student(String name, String lastName, int id, String department, double gpa) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.department = department;
		this.gpa = gpa;
	}

	void setName(String name) {
		this.name = name;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	void setDepartment(String department) {
		this.department = department;
	}

	void setGpa(double gpa) {
		this.gpa = gpa;
	}

	String getName() {
		return name;
	}

	String getLastName() {
		return lastName;
	}

	int getId() {
		return id;
	}

	String getDepartment() {
		return department;
	}

	double getGpa() {
		return gpa;
	}
}

class StudentManager {

	private ArrayList<Student> students = new ArrayList<>();

	void addStudent(String name, String lastName, int id, String department, double gpa) {

		Student newStudent = new Student(name, lastName, id, department, gpa);
		students.add(newStudent);
		System.out.println("Student added successfully!");
	}

	void removeStudent(int id) {

		if (students.isEmpty()) {
			System.out.println("No student found!");
			return;
		}

		for (int i = 0; i < students.size(); i++) {

			if (students.get(i).getId() == id) {
				students.remove(i);
				System.out.println("Student removed successfully.");

				return;
			}
		}

		System.out.println("Student not found.");
	}

	void showStudents() {

		if (students.isEmpty()) {
			System.out.println("No student found! Please add a student first!");
			return;
		}

		int index = 1;
		for (Student s : students) {
			System.out.println(
			    index + ". Name: " + s.getName() +
			    " | Last Name: " + s.getLastName() +
			    " | ID: " + s.getId() +
			    " | Department: " + s.getDepartment() +
			    " | GPA: " + s.getGpa()
			);
			index++;
		}
	}

	void updateStudent(int id, int choice, String newText, double newGpa) {

		for (Student s : students) {

			if (s.getId() == id) {

				if (choice == 1) {

					s.setName(newText);
					System.out.println("Name updated successfully.");

				} else if (choice == 2) {

					s.setDepartment(newText);
					System.out.println("Department updated successfully.");

				} else if (choice == 3) {

					if (newGpa >= 0.0 && newGpa <= 4.0) {

						s.setGpa(newGpa);
						System.out.println("GPA updated successfully.");
					}
					else {
						System.out.println("Invalid GPA value.");
					}

				} else {
					System.out.println("Invalid update choice.");
				}
				return;
			}
		}

		System.out.println("Student not found.");
	}

	void SearchStudentbyID(int id) {

		for(Student s:students) {

			if(s.getId() == id) {
				System.out.println(
				    ". Name: " + s.getName() +
				    " | Last Name: " + s.getLastName() +
				    " | ID: " + s.getId() +
				    " | Department: " + s.getDepartment() +
				    " | GPA: " + s.getGpa()
				);

				return;
			}

			System.out.println("Student not found.");
		}
	}

	void SearchStudentbyName(String name,String lastName) {

		for(Student s:students) {

			if(s.getName().equalsIgnoreCase(name) && s.getLastName().equalsIgnoreCase(lastName)) {
				System.out.println(
				    ". Name: " + s.getName() +
				    " | Last Name: " + s.getLastName() +
				    " | ID: " + s.getId() +
				    " | Department: " + s.getDepartment() +
				    " | GPA: " + s.getGpa()
				);

				return;
			}

			System.out.println("Student not found.");
		}
	}
}

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		StudentManager manager = new StudentManager();

		while (true) {

			System.out.println("\n************ MENU ************");
			System.out.println("1 -> Add a Student");
			System.out.println("2 -> Remove a Student");
			System.out.println("3 -> Show Students");
			System.out.println("4 -> Update a Student");
			System.out.println("5 -> Search a Student by ID");
			System.out.println("6 -> Search a Student by Name");
			System.out.println("0 -> Exit");
			System.out.println("******************************");
			System.out.print("Please make your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 0:
				System.out.println("Exiting the system... Goodbye!");
				return;

			case 1:
				System.out.print("Student Name: ");
				String name = scanner.nextLine();

				System.out.print("Student Last Name: ");
				String lastName = scanner.nextLine();

				System.out.print("Student Department: ");
				String department = scanner.nextLine();

				System.out.print("Student GPA: ");
				double gpa = scanner.nextDouble();
				scanner.nextLine();

				int id = (int) (Math.random() * 999999) + 1;

				manager.addStudent(name, lastName, id, department, gpa);
				break;

			case 2:
				System.out.print("Enter Student ID to remove: ");
				int removeId = scanner.nextInt();
				manager.removeStudent(removeId);
				break;

			case 3:
				System.out.println("All Students:");
				manager.showStudents();
				break;

			case 4:
				System.out.print("Enter Student ID to update: ");
				int updateId = scanner.nextInt();
				scanner.nextLine();

				System.out.println("1. Update Name");
				System.out.println("2. Update Department");
				System.out.println("3. Update GPA");
				System.out.print("Your choice: ");
				int updateChoice = scanner.nextInt();
				scanner.nextLine();

				if (updateChoice == 1) {
					System.out.print("Enter new name: ");
					String newName = scanner.nextLine();
					manager.updateStudent(updateId, 1, newName, 0);

				} else if (updateChoice == 2) {
					System.out.print("Enter new department: ");
					String newDept = scanner.nextLine();
					manager.updateStudent(updateId, 2, newDept, 0);

				} else if (updateChoice == 3) {
					System.out.print("Enter new GPA: ");
					double newGpa = scanner.nextDouble();
					manager.updateStudent(updateId, 3, "", newGpa);

				} else {
					System.out.println("Invalid update option.");
				}
				break;

			case 5:
				System.out.print("Enter Student ID: ");
				id = scanner.nextInt();
				scanner.nextLine();

				manager.SearchStudentbyID(id);
				break;

			case 6:
				System.out.print("Enter Student Name: ");
				name = scanner.nextLine();

				System.out.print("Enter Student LastName: ");
				lastName = scanner.nextLine();

				manager.SearchStudentbyName(name,lastName);
				break;

        default:
				System.out.println("Invalid menu choice. Please select a number range in 0-5!");
				break;
			}
		}
	}
}
