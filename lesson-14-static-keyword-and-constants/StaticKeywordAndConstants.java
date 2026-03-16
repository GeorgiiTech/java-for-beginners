// Utility-style class with constants and static methods
class MathUtils {
      // Constants: public static final (by convention, ALL_CAPS)
    public static final double PI      = 3.141592653589793;
      public static final double E       = 2.718281828459045;
      public static final int    MAX_INT = Integer.MAX_VALUE;

    // Static field shared across ALL instances
    private static int callCount = 0;

    // Static initializer block – runs once when class is loaded
    static {
              System.out.println("[MathUtils loaded]");
    }

    // Static methods – called on the class, not on instances
    public static double circleArea(double r) {
              callCount++;
              return PI * r * r;
    }

    public static double circumference(double r) {
              callCount++;
              return 2 * PI * r;
    }

    public static int getCallCount() { return callCount; }

    // Private constructor – prevents instantiation (utility class pattern)
    private MathUtils() {}
}

// Class demonstrating static vs instance fields
class Counter {
      private static int totalCreated = 0;  // shared by all Counter objects
    private int id;                        // unique per object

    Counter() {
              totalCreated++;
              this.id = totalCreated;
    }

    int getId()                  { return id; }
      static int getTotalCreated() { return totalCreated; }
}

public class StaticKeywordAndConstants {
      public static void main(String[] args) {

          // --- Constants ---
          System.out.println("=== Constants ===");
                System.out.println("PI      = " + MathUtils.PI);
                System.out.println("E       = " + MathUtils.E);
                System.out.println("MAX_INT = " + MathUtils.MAX_INT);

          // --- Static methods (no object needed) ---
          System.out.println("\n=== Static Methods ===");
                double r = 5.0;
                System.out.printf("Circle area (r=%.1f)      = %.4f%n", r, MathUtils.circleArea(r));
                System.out.printf("Circumference (r=%.1f)    = %.4f%n", r, MathUtils.circumference(r));
                System.out.println("Total calls to MathUtils  = " + MathUtils.getCallCount());

          // --- Static vs instance fields ---
          System.out.println("\n=== Static vs Instance Fields ===");
                Counter c1 = new Counter();
                Counter c2 = new Counter();
                Counter c3 = new Counter();

          System.out.println("c1.id = " + c1.getId());           // 1  (instance)
          System.out.println("c2.id = " + c2.getId());           // 2  (instance)
          System.out.println("c3.id = " + c3.getId());           // 3  (instance)
          System.out.println("Total created = " + Counter.getTotalCreated()); // 3 (static)

          // --- final local variable (cannot be reassigned) ---
          System.out.println("\n=== final local variable ===");
                final int MAX_RETRIES = 3;
                System.out.println("MAX_RETRIES = " + MAX_RETRIES);
                // MAX_RETRIES = 5;  // COMPILE ERROR – cannot reassign final
      }
}
