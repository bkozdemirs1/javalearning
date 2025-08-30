public class BreakExample {
    
  public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at: " + i);
                break; // loop stops here
            }
            System.out.println("Number: " + i);
        }
    }
}
