import java.util.Scanner;

class Car {

    private String carname;
    private String model;
    private double speed;
    private int year;

    Car(String carname, String model, double speed, int year) {
        this.carname = carname;
        this.model = model;
        this.speed = speed;
        this.year = year;
    }

    void accelerate(double s) {
        speed += s;
        System.out.println("Car accelerated. Current speed: " + speed + " km/h");
    }

    void decrease(double d) {
        if (d >= speed) {
            speed = 0;
            System.out.println("Your car has been stopped!");
        } else {
            speed -= d;
            System.out.println("Car slowed down. Current speed: " + speed + " km/h");
        }
    }

    void showInfo() {
        System.out.println("Car Info:");
        System.out.println("Brand: " + carname);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Current Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your car brand: ");
        String carname = scanner.nextLine();

        System.out.print("Please enter your car model: ");
        String model = scanner.nextLine();

        System.out.print("Enter the year of manufacture of your vehicle: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter your initial speed: ");
        double speed = scanner.nextDouble();
        scanner.nextLine();

        Car car1 = new Car(carname, model, speed, year);

        System.out.println("\nCar created: " + carname + " " + model + " " + year + " | speed: " + speed + " km/h");

        while (true) {
            
            System.out.println("\n**********************************");
            System.out.println(" 1 --> Increase Speed ");
            System.out.println(" 2 --> Decrease Speed");
            System.out.println(" 3 --> Show Car's Current Info");
            System.out.println(" 4 --> Exit");
            System.out.println("**********************************");
            System.out.print("Please make your choice: ");

            int number = scanner.nextInt();
            scanner.nextLine();

            switch (number) {
                case 1:
                    System.out.print("Enter the acceleration amount: ");
                    double acc = scanner.nextDouble();
                    scanner.nextLine();
                    car1.accelerate(acc);
                    break;

                case 2:
                    System.out.print("Enter the deceleration amount: ");
                    double dec = scanner.nextDouble();
                    scanner.nextLine();
                    car1.decrease(dec);
                    break;

                case 3:
                    car1.showInfo();
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice! Please select 1-4.");
                    break;
            }
        }
    }
}
