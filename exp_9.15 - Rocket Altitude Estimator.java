import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double v0 = 0, Vb = 0, a = 0, t = 0, Hb = 0, tc = 0, Hc = 0, Hmax = 0;
		double g = 9.81;

		boolean hasData = false;

		while(true) {

			System.out.println("\n******** ROCKET ALTITUDE ESTIMATOR ********");
			System.out.println("1 - Calculate Rocket Maximum Altitude");
			System.out.println("2 - Show Last Calculation Details");
			System.out.println("3 - Reset Data");
			System.out.println("0 - Exit");
			System.out.println("*******************************************");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();

			switch(choice) {

			case 1:
				
				System.out.print("Enter initial velocity (m/s): ");
				v0 = scanner.nextDouble();
				
				System.out.print("Enter engine burn time (seconds): ");
				t =  scanner.nextDouble();
			
				System.out.print("Enter rocket acceleration (m/s^2): ");
				a = scanner.nextDouble();
				
				Vb = v0 + (a - g) * t;
				Hb = v0*t + 0.5*(a - g)*t*t;
				tc = Vb / g;
				Hc = 0.5 * (Vb*Vb / g);
				Hmax = Hb + Hc;

				hasData = true;

				System.out.println("\n----- CALCULATION RESULTS -----");
				System.out.println("Burn-out velocity : " + Vb + " m/s");
				System.out.println("Burn-out altitude : " + Hb + " meters");
				System.out.println("Coasting time     : " + tc + " seconds");
				System.out.println("Extra altitude    : " + Hc + " meters");
				System.out.println("--------------------------------");
				System.out.println("MAXIMUM ALTITUDE  : " + Hmax + " meters\n");

				break;

			case 2:
			
				if(!hasData) {
					
					System.out.println("No previous calculation found!");
				} 
				
				else {
					System.out.println("\n----- LAST CALCULATION -----");
					System.out.println("Initial velocity : " + v0);
					System.out.println("Burn time        : " + t);
					System.out.println("Acceleration     : " + a);
					System.out.println("Burn-out V       : " + Vb);
					System.out.println("Burn-out H       : " + Hb);
					System.out.println("Coast time       : " + tc);
					System.out.println("Extra altitude   : " + Hc);
					System.out.println("MAX ALTITUDE     : " + Hmax);
				}
				break;

			case 3:
				
				hasData = false;
				System.out.println("All data reset successfully!");
				break;

			case 0:
				System.out.println("Exiting program...");
				return;

			default:
				System.out.println("Invalid choice, please pick a number between 0-3.");
			}
		}
	}
}
