import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name,phonenumber;
        
        System.out.print("Please enter your name: ");
        name = scanner.nextLine();
        
        System.out.print("Please enter your phone number: ");
        phonenumber = scanner.nextLine();
        
        double result = 0; 
        int p_counter = 0 , b_counter = 0 , pt_counter = 0 , s_counter = 0;  

        while (true) {

            System.out.println("-------------MENU-----------");
            System.out.println("1. Pizza - 120 TL");
            System.out.println("2. Burger - 90 TL");
            System.out.println("3. Pasta - 70 TL");
            System.out.println("4. Salad - 50 TL");
            System.out.println("5. Exit");
            System.out.println("----------------------------");

            System.out.print("Please make your choice: ");
            int menu = scanner.nextInt();

            if (menu == 5) {
                System.out.println("Exiting... Goodbye!");
                break;
            }

            int amount = 0;

            if (menu >= 1 && menu <= 4) {
                System.out.print("How many would you like? ");
                amount = scanner.nextInt();
            }

            if (menu == 1) {
                result += 120 * amount;
                p_counter++;
            } 
            else if (menu == 2) {
                result += 90 * amount;
                b_counter+=amount;
            }
            else if (menu == 3) {
                result += 70 * amount;
                pt_counter+=amount;
            }
            else if (menu == 4) {
                result += 50 * amount;
                s_counter+=amount;
            }
            else {
                System.out.println("Please enter your choice between 1-5!");
            }
        }
    
        System.out.println("--------------ORDER SUMMARY--------------");
        System.out.println("Customer:"+name);
        System.out.println("Phone:"+phonenumber);
        System.out.println("Items Ordered:");
        System.out.println("Pizza: "+p_counter+"*"+"120 TL");
        System.out.println("Burger:" +b_counter+"*"+"90 TL");
        System.out.println("Pasta:" +pt_counter+"*"+"70 TL");
        System.out.println("Salad:" +s_counter+"*"+"50 TL");
        System.out.println("Total Amount: "+result+" "+"TL");
        System.out.println("------------------------------------------");
    }
}
