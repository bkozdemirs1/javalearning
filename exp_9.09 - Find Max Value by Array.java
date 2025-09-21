import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        int arraysize;
        
        System.out.println("Please enter your array range: ");
        arraysize = scanner.nextInt();
        scanner.nextLine();
        
        int[] arr = new int[arraysize];
        int max = arr[0];
    
        System.out.print("Please enter your values: ");
        
        for(int i=0;i<arr.length;i++){
            
            System.out.print("\nElement "+(i+1)+":");
            
            arr[i] = scanner.nextInt();
            
            if (arr[i] > max) {
            max = arr[i];
        }
            
        }
        
       System.out.println("Max value: "+max);
    }
}
