import java.util.Scanner;

public class UserInput {
      public static void main(String[] args) {

          // Create a Scanner attached to standard input (keyboard)
          Scanner scanner = new Scanner(System.in);

          // --- Reading a String ---
          System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.println("Hello, " + name + "!");

          // --- Reading an integer ---
          System.out.print("Enter your age: ");
                while (!scanner.hasNextInt()) {
                              System.out.print("Please enter a valid integer age: ");
                              scanner.next(); // discard invalid input
                }
                int age = scanner.nextInt();
                scanner.nextLine(); // consume leftover newline
          System.out.println("In 10 years you will be " + (age + 10));

          // --- Reading a double ---
          System.out.print("Enter your height in metres (e.g. 1.75): ");
                while (!scanner.hasNextDouble()) {
                              System.out.print("Please enter a valid decimal number: ");
                              scanner.next();
                }
                double height = scanner.nextDouble();
                scanner.nextLine();
                System.out.printf("Your height is %.2f m%n", height);

          // --- Reading multiple values on one line ---
          System.out.print("Enter two numbers separated by space: ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Sum: " + (x + y) + ", Product: " + (x * y));

          // --- Reading a yes/no answer ---
          System.out.print("Are you a Java developer? (yes/no): ");
                String answer = scanner.nextLine().trim().toLowerCase();
                if (answer.equals("yes")) {
                              System.out.println("Great, keep coding!");
                } else {
                              System.out.println("You will be soon!");
                }

          // Always close the scanner when done
          scanner.close();
                System.out.println("Scanner closed. Goodbye, " + name + "!");
      }
}
