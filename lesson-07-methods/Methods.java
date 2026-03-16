public class Methods {

    // --- void method (no return value) ---
    static void greet(String name) {
              System.out.println("Hello, " + name + "!");
    }

    // --- method with return value ---
    static int add(int a, int b) {
              return a + b;
    }

    static double circleArea(double radius) {
              return Math.PI * radius * radius;
    }

    // --- Method overloading (same name, different parameters) ---
    static int multiply(int a, int b)              { return a * b; }
      static double multiply(double a, double b)     { return a * b; }
      static int multiply(int a, int b, int c)       { return a * b * c; }

    // --- Recursion: factorial ---
    static long factorial(int n) {
              if (n <= 1) return 1;          // base case
          return n * factorial(n - 1);  // recursive call
    }

    // --- Recursion: Fibonacci ---
    static int fibonacci(int n) {
              if (n <= 1) return n;
              return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // --- Varargs (variable number of arguments) ---
    static int sum(int... numbers) {
              int total = 0;
              for (int n : numbers) total += n;
              return total;
    }

    public static void main(String[] args) {

          // void method call
          System.out.println("=== void method ===");
              greet("Java Learner");
              greet("Georgii");

          // method with return value
          System.out.println("\n=== methods with return values ===");
              int result = add(5, 3);
              System.out.println("add(5, 3) = " + result);
              System.out.printf("circleArea(5.0) = %.2f%n", circleArea(5.0));

          // method overloading
          System.out.println("\n=== method overloading ===");
              System.out.println("multiply(3, 4)        = " + multiply(3, 4));
              System.out.println("multiply(2.5, 4.0)    = " + multiply(2.5, 4.0));
              System.out.println("multiply(2, 3, 4)     = " + multiply(2, 3, 4));

          // recursion
          System.out.println("\n=== recursion: factorial ===");
              for (int i = 0; i <= 10; i++) {
                            System.out.println(i + "! = " + factorial(i));
              }

          System.out.println("\n=== recursion: fibonacci ===");
              System.out.print("Fibonacci: ");
              for (int i = 0; i < 10; i++) {
                            System.out.print(fibonacci(i) + " ");
              }
              System.out.println();

          // varargs
          System.out.println("\n=== varargs ===");
              System.out.println("sum(1)           = " + sum(1));
              System.out.println("sum(1,2,3)       = " + sum(1, 2, 3));
              System.out.println("sum(1,2,3,4,5)   = " + sum(1, 2, 3, 4, 5));
    }
}
