import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double last_m1 = 0, last_v1 = 0, last_m2 = 0, last_v2 = 0;
        double last_v1_final = 0, last_v2_final = 0;
        double last_p_before = 0, last_p_after = 0;
        double last_ke_before = 0, last_ke_after = 0;
        String last_type = "NONE";
        boolean hasdata = false;

        while (true) {

            System.out.println("\n******** COLLISION SIMULATOR ********");
            System.out.println("1 - Simulate Elastic Collision");
            System.out.println("2 - Simulate Inelastic Collision (stick together)");
            System.out.println("3 - Collision with Coefficient of Restitution (0  or  1)");
            System.out.println("4 - Show Last Calculation");
            System.out.println("5 - Reset Last Data");
            System.out.println("0 - Exit");
            System.out.println("*****************************************");
            
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            switch (choice) {

                case 1: 
                {
                    System.out.print("Enter mass of object 1 (kg): ");
                    double m1 = scanner.nextDouble();

                    System.out.print("Enter velocity of object 1 (m/s): ");
                    double v1 = scanner.nextDouble();

                    System.out.print("Enter mass of object 2 (kg): ");
                    double m2 = scanner.nextDouble();

                    System.out.print("Enter velocity of object 2 (m/s): ");
                    double v2 = scanner.nextDouble();

                   
                    double v1f = ((m1 - m2) / (m1 + m2)) * v1 + (2 * m2 / (m1 + m2)) * v2;
                    double v2f = (2 * m1 / (m1 + m2)) * v1 + ((m2 - m1) / (m1 + m2)) * v2;

                    double P_before = m1 * v1 + m2 * v2;
                    double P_after = m1 * v1f + m2 * v2f;

                    double KE_before = 0.5 * m1 * v1 * v1 + 0.5 * m2 * v2 * v2;
                    double KE_after = 0.5 * m1 * v1f * v1f + 0.5 * m2 * v2f * v2f;

                    System.out.println("\n----- COLLISION RESULT (ELASTIC) -----");
                    System.out.println("Final velocity of object 1: " + v1f + " m/s");
                    System.out.println("Final velocity of object 2: " + v2f + " m/s");
                    System.out.println("--------------------------------------");
                    System.out.println("Momentum before: " + P_before);
                    System.out.println("Momentum after : " + P_after);
                    System.out.println("Energy before: " + KE_before);
                    System.out.println("Energy after : " + KE_after);
                    System.out.println("--------------------------------------");

                    last_m1 = m1; last_v1 = v1; last_m2 = m2; last_v2 = v2;
                    last_v1_final = v1f; last_v2_final = v2f;
                    last_p_before = P_before; last_p_after = P_after;
                    last_ke_before = KE_before; last_ke_after = KE_after;
                    last_type = "ELASTIC";
                    hasdata = true;
                    break;
                }

                case 2: 
                {
                    System.out.print("Enter mass of object 1 (kg): ");
                    double m1 = scanner.nextDouble();

                    System.out.print("Enter velocity of object 1 (m/s): ");
                    double v1 = scanner.nextDouble();

                    System.out.print("Enter mass of object 2 (kg): ");
                    double m2 = scanner.nextDouble();

                    System.out.print("Enter velocity of object 2 (m/s): ");
                    double v2 = scanner.nextDouble();

                    
                    double Vf = (m1 * v1 + m2 * v2) / (m1 + m2);

                    double P_before = m1 * v1 + m2 * v2;
                    double P_after = (m1 + m2) * Vf;

                    double KE_before = 0.5 * m1 * v1 * v1 + 0.5 * m2 * v2 * v2;
                    double KE_after = 0.5 * (m1 + m2) * Vf * Vf;

                    System.out.println("\n----- COLLISION RESULT (INELASTIC) -----");
                    System.out.println("Final velocity (both objects stuck): " + Vf + " m/s");
                    System.out.println("----------------------------------------");
                    System.out.println("Momentum before: " + P_before);
                    System.out.println("Momentum after : " + P_after);
                    System.out.println("Energy before: " + KE_before);
                    System.out.println("Energy after : " + KE_after);
                    System.out.println("----------------------------------------");

                    last_m1 = m1; last_v1 = v1; last_m2 = m2; last_v2 = v2;
                    last_v1_final = Vf; last_v2_final = Vf;
                    last_p_before = P_before; last_p_after = P_after;
                    last_ke_before = KE_before; last_ke_after = KE_after;
                    last_type = "INELASTIC";
                    hasdata = true;
                    break;
                }

                case 3: 
                {
                    System.out.print("Enter mass of object 1 (kg): ");
                    double m1 = scanner.nextDouble();

                    System.out.print("Enter velocity of object 1 (m/s): ");
                    double v1 = scanner.nextDouble();

                    System.out.print("Enter mass of object 2 (kg): ");
                    double m2 = scanner.nextDouble();

                    System.out.print("Enter velocity of object 2 (m/s): ");
                    double v2 = scanner.nextDouble();

                    System.out.print("Enter coefficient of restitution e (0..1): ");
                    double e = scanner.nextDouble();

                    double v1f = ((m1 * v1 + m2 * v2) - m2 * e * (v1 - v2)) / (m1 + m2);
                    double v2f = ((m1 * v1 + m2 * v2) + m1 * e * (v1 - v2)) / (m1 + m2);

                    double P_before = m1 * v1 + m2 * v2;
                    double P_after = m1 * v1f + m2 * v2f;

                    double KE_before = 0.5 * m1 * v1 * v1 + 0.5 * m2 * v2 * v2;
                    double KE_after = 0.5 * m1 * v1f * v1f + 0.5 * m2 * v2f * v2f;

                    System.out.println("\n----- COLLISION RESULT (e = " + e + ") -----");
                    System.out.println("Final velocity object 1: " + v1f + " m/s");
                    System.out.println("Final velocity object 2: " + v2f + " m/s");
                    System.out.println("--------------------------------------------");
                    System.out.println("Momentum before: " + P_before);
                    System.out.println("Momentum after : " + P_after);
                    System.out.println("Energy before: " + KE_before);
                    System.out.println("Energy after : " + KE_after);
                    System.out.println("--------------------------------------------");

                    last_m1 = m1; last_v1 = v1; last_m2 = m2; last_v2 = v2;
                    last_v1_final = v1f; last_v2_final = v2f;
                    last_p_before = P_before; last_p_after = P_after;
                    last_ke_before = KE_before; last_ke_after = KE_after;
                    last_type = "RESTITUTION (e = " + e + ")";
                    hasdata = true;
                    break;
                }

                case 4: 
                {
                    if (!hasdata) {
                        
                        System.out.println("No calculation stored!");
                        break;
                    }
                  
                    System.out.println("\n----- LAST CALCULATION -----");
                    System.out.println("Type: " + last_type);
                    System.out.println("m1: " + last_m1 + " kg, v1: " + last_v1);
                    System.out.println("m2: " + last_m2 + " kg, v2: " + last_v2);
                    System.out.println("Final v1: " + last_v1_final);
                    System.out.println("Final v2: " + last_v2_final);
                    System.out.println("Momentum before: " + last_p_before);
                    System.out.println("Momentum after : " + last_p_after);
                    System.out.println("Energy before: " + last_ke_before);
                    System.out.println("Energy after : " + last_ke_after);
                    System.out.println("----------------------------");
                    break;
                }

                case 5: 
                {
                    hasdata = false;
                    System.out.println("All stored data cleared.");
                    break;
                }

                default:  
                    System.out.println("Invalid choice. Please select your number between 0-5! ");
            }
        }
        scanner.close();
    }
}
