public class ForEachLoop {
   
  public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Using for-each loop to print array elements:");
        for (int num : numbers) { // For-each loop iterates through each element
            System.out.println(num); // Print current element
        }
    }
}
