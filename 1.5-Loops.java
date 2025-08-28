public class Loops {
    
  public static void main(String[] args) {
        // For loop
        for(int i=1; i<=5; i++) {
            System.out.println("For loop count: " + i);
        }

        // While loop
        int j=1;
        while(j<=5) {
            System.out.println("While loop count: " + j);
            j++;
        }

        // Do-while loop
        int k=1;
        do {
            System.out.println("Do-While loop count: " + k);
            k++;
        } while(k<=5);
    }
}
