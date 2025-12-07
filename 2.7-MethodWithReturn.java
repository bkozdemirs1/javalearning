public class MethodWithReturn {
    // This method returns the square of a number
    public static int square(int n) { //As i mentioned you in lesson 2.4, as you can see i returned some value and int variable replaced the void variable!
        return n * n;
    }

    public static void main(String[] args) {
        int result = square(6); // call method and store result
        System.out.println("Square: " + result);
    }
}
