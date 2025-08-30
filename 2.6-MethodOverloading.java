public class MethodOverloading {
    // Method overloading: same name, different parameters
    public static int multiply(int a, int b) { 
        return a * b;
    }

    public static double multiply(double a, double b) { // We used "multiply" name also.
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Int multiplication: " + multiply(3, 4));
        System.out.println("Double multiplication: " + multiply(2.5, 4.0));
    }
}
