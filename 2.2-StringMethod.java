public class StringMethods {
    
  public static void main(String[] args) {
        String name = "Burak";

        // toUpperCase() → converts to uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        // toLowerCase() → converts to lowercase
        System.out.println("Lowercase: " + name.toLowerCase());

        // charAt() → gets character at index
        System.out.println("First char: " + name.charAt(0));

        // substring() → gets part of the string
        System.out.println("Substring(1,4): " + name.substring(1, 4));
    }
}
