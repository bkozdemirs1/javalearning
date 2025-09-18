import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*************");
		System.out.println("Welcome!");
		System.out.println("************");

        double x , y;
        
        System.out.print("Enter X coordinate: ");
        x = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Enter Y coordinate: ");
        y = scanner.nextDouble();
        scanner.nextLine();
        
        if(x == 0 && y == 0)
        
        System.out.println("The point "+x+","+y+" "+"is at the Origin. ");
        
        else if(x == 0)
        
        System.out.println("The point "+x+","+y+" "+"is on the Y-axis. ");
        
        else if(y == 0)
        
        System.out.println("The point "+x+","+y+" "+"is on the X-axis. ");
        
        else if(x > 0 && y > 0)
        
        System.out.println("The point "+x+","+y+" "+"is in Quadrant 1. ");
        
        else if(x < 0 && y > 0)
        
        System.out.println("The point "+x+","+y+" "+"is in Quadrant 2. ");
        
         else if(x < 0 && y < 0)
         
         System.out.println("The point "+x+","+y+" "+"is in Quadrant 3. ");
         
         else
         
         System.out.println("The point "+x+","+y+" "+"is in Quadrant 4. ");
         
         scanner.close();
        
    }
}
