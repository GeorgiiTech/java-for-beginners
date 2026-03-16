public class VariablesAndDataTypes {
      public static void main(String[] args) {

          // --- Primitive Data Types ---

          // Integer types
          byte  byteVal  = 127;
                short shortVal = 32000;
                int   intVal   = 2_000_000;
                long  longVal  = 9_000_000_000L;

          // Floating-point types
          float  floatVal  = 3.14f;
                double doubleVal = 3.141592653589793;

          // Character type
          char charVal = 'J';

          // Boolean type
          boolean isJavaFun = true;

          // --- Printing primitive types ---
          System.out.println("=== Primitive Types ===");
                System.out.println("byte:    " + byteVal);
                System.out.println("short:   " + shortVal);
                System.out.println("int:     " + intVal);
                System.out.println("long:    " + longVal);
                System.out.println("float:   " + floatVal);
                System.out.println("double:  " + doubleVal);
                System.out.println("char:    " + charVal);
                System.out.println("boolean: " + isJavaFun);

          // --- Reference Type: String ---
          System.out.println("\n=== String (Reference Type) ===");
                String greeting = "Hello, Java!";
                String name     = "Georgii";
                System.out.println(greeting);
                System.out.println("Name: " + name);
                System.out.println("Length: " + name.length());

          // --- Type casting ---
          System.out.println("\n=== Type Casting ===");
                // Widening (automatic)
          int   myInt    = 42;
                double myDouble = myInt;   // int -> double automatically
          System.out.println("int to double: " + myDouble);

          // Narrowing (explicit cast required)
          double pi        = 3.99;
                int    truncated = (int) pi;  // decimals are dropped, NOT rounded
          System.out.println("double to int: " + truncated);

          // --- Constants (final) ---
          System.out.println("\n=== Constants ===");
                final double PI = 3.141592653589793;
                final int    MAX_SPEED = 300;
                System.out.println("PI        = " + PI);
                System.out.println("MAX_SPEED = " + MAX_SPEED);

          // --- Variable scope example ---
          System.out.println("\n=== Scope ===");
                int outer = 10;
        {
                      int inner = 20;
                      System.out.println("outer inside block: " + outer);
                      System.out.println("inner inside block: " + inner);
        }
                // inner is NOT accessible here
          System.out.println("outer outside block: " + outer);
      }
}
