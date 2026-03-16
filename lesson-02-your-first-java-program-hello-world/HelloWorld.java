/**
 * Lesson 2 – Your First Java Program: Hello, World!
    *
    * How to run:
    *   1. Compile:  javac HelloWorld.java
    *   2. Run:      java HelloWorld
    *
    * Every Java beginner starts here. Let's understand every single line.
    */
public class HelloWorld {           // 1. class name must match filename exactly

    // 2. main() is the entry point – Java starts here
    public static void main(String[] args) {

          // 3. System.out.println() prints text + a newline
          System.out.println("Hello, World!");

          // --- Let's explore print vs println ---
          System.out.print("Hello");      // no newline at end
          System.out.print(", ");
              System.out.println("Java!");    // newline added here  => "Hello, Java!"

          // --- Printing numbers ---
          System.out.println(42);
              System.out.println(3.14);
              System.out.println(true);

          // --- Printing expressions ---
          System.out.println(2 + 3);          // 5
          System.out.println("2 + 3 = " + (2 + 3)); // 2 + 3 = 5

          // --- Multi-line output using \n ---
          System.out.println("Line 1\nLine 2\nLine 3");

          // --- Formatted output (Java 15+) ---
          String name = "World";
              System.out.printf("Hello, %s! You are learning Java.%n", name);

          System.out.println("--- End of HelloWorld ---");
    }
}
