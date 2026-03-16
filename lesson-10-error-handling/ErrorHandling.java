public class ErrorHandling {

    static void divide(int a, int b) {
              try {
                            int result = a / b;
                            System.out.println(a + " / " + b + " = " + result);
              } catch (ArithmeticException e) {
                            System.out.println("Cannot divide by zero: " + e.getMessage());
              }
    }

    public static void main(String[] args) {

          System.out.println("=== Basic try/catch ===");
              divide(10, 2);
              divide(10, 0);

          System.out.println("\n=== try / catch / finally ===");
              try {
                            System.out.println("In try block");
                            int[] arr = new int[3];
                            arr[10] = 5;
                            System.out.println("This line is never reached");
              } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Caught: " + e.getMessage());
              } finally {
                            System.out.println("Finally always runs");
              }

          System.out.println("\n=== Multiple catch blocks ===");
              Object[] mixed = {"hello", null, 42};
              for (Object obj : mixed) {
                            try {
                                              String s = (String) obj;
                                              System.out.println("Length: " + s.length());
                            } catch (NullPointerException e) {
                                              System.out.println("Caught NullPointerException");
                            } catch (ClassCastException e) {
                                              System.out.println("Caught ClassCastException: not a String");
                            }
              }

          System.out.println("\n=== Throwing an exception ===");
              try {
                            int age = -5;
                            if (age < 0) {
                                              throw new IllegalArgumentException("Age cannot be negative: " + age);
                            }
              } catch (IllegalArgumentException e) {
                            System.out.println("Caught: " + e.getMessage());
              }

          System.out.println("\n=== NumberFormatException ===");
              String[] inputs = {"42", "hello", "100"};
              for (String input : inputs) {
                            try {
                                              int value = Integer.parseInt(input);
                                              System.out.println("Parsed: " + value);
                            } catch (NumberFormatException e) {
                                              System.out.println("Invalid number: '" + input + "'");
                            }
              }
    }
}
