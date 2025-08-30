public class LogicalOperators {
    
  public static void main(String[] args) {
        boolean isStudent = true;
        boolean isMember = false;

        // AND operator
        System.out.println("Student AND Member: " + (isStudent && isMember));

        // OR operator
        System.out.println("Student OR Member: " + (isStudent || isMember));

        // NOT operator
        System.out.println("NOT Student: " + (!isStudent));
    }
}
