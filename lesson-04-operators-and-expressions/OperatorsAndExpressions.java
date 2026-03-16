public class OperatorsAndExpressions {
      public static void main(String[] args) {

          // --- Arithmetic Operators ---
          System.out.println("=== Arithmetic Operators ===");
                int a = 10, b = 3;
                System.out.println("a = " + a + ", b = " + b);
                System.out.println("a + b  = " + (a + b));   // 13
          System.out.println("a - b  = " + (a - b));   // 7
          System.out.println("a * b  = " + (a * b));   // 30
          System.out.println("a / b  = " + (a / b));   // 3  (integer division!)
          System.out.println("a % b  = " + (a % b));   // 1  (remainder)

          // Avoid integer division pitfall
          double result = (double) a / b;
                System.out.println("(double)a / b = " + result); // 3.333...

          // --- Increment / Decrement ---
          System.out.println("\n=== Increment / Decrement ===");
                int x = 5;
                System.out.println("x   = " + x);
                System.out.println("x++ = " + x++);  // post-increment: prints 5, then x becomes 6
          System.out.println("x   = " + x);    // 6
          System.out.println("++x = " + (++x));  // pre-increment: x becomes 7, prints 7

          // --- Assignment Operators ---
          System.out.println("\n=== Assignment Operators ===");
                int n = 10;
                n += 5;  System.out.println("n += 5  => " + n);  // 15
          n -= 3;  System.out.println("n -= 3  => " + n);  // 12
          n *= 2;  System.out.println("n *= 2  => " + n);  // 24
          n /= 4;  System.out.println("n /= 4  => " + n);  // 6
          n %= 4;  System.out.println("n %= 4  => " + n);  // 2

          // --- Comparison Operators ---
          System.out.println("\n=== Comparison Operators ===");
                int p = 7, q = 10;
                System.out.println("p == q: " + (p == q));   // false
          System.out.println("p != q: " + (p != q));   // true
          System.out.println("p <  q: " + (p < q));    // true
          System.out.println("p >  q: " + (p > q));    // false
          System.out.println("p <= q: " + (p <= q));   // true
          System.out.println("p >= q: " + (p >= q));   // false

          // --- Logical Operators ---
          System.out.println("\n=== Logical Operators ===");
                boolean t = true, f = false;
                System.out.println("t && f : " + (t && f));  // false (AND)
          System.out.println("t || f : " + (t || f));  // true  (OR)
          System.out.println("!t     : " + (!t));       // false (NOT)

          // Short-circuit evaluation
          int counter = 0;
                boolean shortCircuit = (counter > 0) && (++counter > 0); // right side never evaluated
          System.out.println("\nShort-circuit AND, counter stays: " + counter); // 0

          // --- Ternary Operator ---
          System.out.println("\n=== Ternary Operator ===");
                int age = 20;
                String status = (age >= 18) ? "Adult" : "Minor";
                System.out.println("age=" + age + " => " + status);

          // --- String Concatenation with + ---
          System.out.println("\n=== String Concatenation ===");
                String firstName = "Java";
                int version = 21;
                System.out.println(firstName + " " + version);         // Java 21
          System.out.println("2 + 2 = " + (2 + 2));             // 2 + 2 = 4
          System.out.println("concat: " + 1 + 2);               // concat: 12 (watch out!)
          System.out.println("concat: " + (1 + 2));             // concat: 3
      }
}
