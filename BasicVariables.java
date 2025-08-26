public class BasicVariables {
    public static void main(String[] args) {
        
        int age = 18;                // integer (whole number)
        double pi = 3.14159;         // decimal number (more precise)
        float price = 19.99f;        // decimal number (requires 'f' at the end)
        char grade = 'A';            // single character
        boolean isStudent = true;    // true or false value
        String name = "Burak Kaan";       // text (non-primitive)

        System.out.println("Name: " + name);         // + combines text and variable
        System.out.println("Age: " + age);           // + joins string with int
        System.out.println("Price: " + price);       // + joins string with float
        System.out.println("Pi: " + pi);             // + joins string with double
        System.out.println("Grade: " + grade);       // + joins string with char
        System.out.println("Is Student? " + isStudent); // + joins string with boolean
    }
}
