public class Loops {
      public static void main(String[] args) {

          // --- for loop ---
          System.out.println("=== for loop ===");
                for (int i = 1; i <= 5; i++) {
                              System.out.println("i = " + i);
                }

          // Count down
          System.out.println("\n--- Countdown ---");
                for (int i = 5; i >= 1; i--) {
                              System.out.print(i + " ");
                }
                System.out.println("Go!");

          // --- while loop ---
          System.out.println("\n=== while loop ===");
                int count = 0;
                while (count < 5) {
                              System.out.println("count = " + count);
                              count++;
                }

          // --- do-while loop (always executes at least once) ---
          System.out.println("\n=== do-while loop ===");
                int num = 10;
                do {
                              System.out.println("num = " + num);
                              num++;
                } while (num < 5);   // condition false from start, but body runs once
          System.out.println("After do-while: num = " + num);

          // --- Enhanced for-each loop ---
          System.out.println("\n=== for-each loop ===");
                int[] numbers = {10, 20, 30, 40, 50};
                for (int n : numbers) {
                              System.out.print(n + " ");
                }
                System.out.println();

          String[] fruits = {"Apple", "Banana", "Cherry"};
                for (String fruit : fruits) {
                              System.out.println("Fruit: " + fruit);
                }

          // --- break ---
          System.out.println("\n=== break ===");
                for (int i = 1; i <= 10; i++) {
                              if (i == 6) {
                                                System.out.println("Breaking at i = " + i);
                                                break;
                              }
                              System.out.print(i + " ");
                }
                System.out.println();

          // --- continue ---
          System.out.println("\n=== continue (skip even numbers) ===");
                for (int i = 1; i <= 10; i++) {
                              if (i % 2 == 0) continue;  // skip even
                    System.out.print(i + " ");
                }
                System.out.println();

          // --- Nested loops (multiplication table 3x3) ---
          System.out.println("\n=== Nested loops (multiplication table) ===");
                for (int row = 1; row <= 3; row++) {
                              for (int col = 1; col <= 3; col++) {
                                                System.out.printf("%4d", row * col);
                              }
                              System.out.println();
                }
      }
}
