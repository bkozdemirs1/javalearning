public class StringComparison {
    
  public static void main(String[] args) {
        String a = "Java";
        String b = "java";

        // equals() → checks if two strings are equal
        System.out.println("equals: " + a.equals(b));

        // equalsIgnoreCase() → ignores case sensitivity
        System.out.println("equalsIgnoreCase: " + a.equalsIgnoreCase(b));

        // compareTo() → compares alphabetically
        System.out.println("compareTo: " + a.compareTo(b));
    }
}
