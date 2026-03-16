public class WorkingWithStrings {
      public static void main(String[] args) {

          String s = "Hello, Java World!";
                System.out.println("String: " + s);

          // --- Basic properties ---
          System.out.println("\n=== Basic Properties ===");
                System.out.println("length()      : " + s.length());
                System.out.println("charAt(7)     : " + s.charAt(7));
                System.out.println("isEmpty()     : " + s.isEmpty());
                System.out.println("isBlank()     : " + "   ".isBlank());

          // --- Searching ---
          System.out.println("\n=== Searching ===");
                System.out.println("indexOf('J')         : " + s.indexOf('J'));
                System.out.println("indexOf(\"Java\")      : " + s.indexOf("Java"));
                System.out.println("lastIndexOf('o')     : " + s.lastIndexOf('o'));
                System.out.println("contains(\"World\")   : " + s.contains("World"));
                System.out.println("startsWith(\"Hello\") : " + s.startsWith("Hello"));
                System.out.println("endsWith(\"!\")       : " + s.endsWith("!"));

          // --- Extracting ---
          System.out.println("\n=== Extracting ===");
                System.out.println("substring(7)     : " + s.substring(7));
                System.out.println("substring(7,11)  : " + s.substring(7, 11));

          // --- Modifying (strings are immutable – methods return NEW strings) ---
          System.out.println("\n=== Modifying ===");
                System.out.println("toUpperCase() : " + s.toUpperCase());
                System.out.println("toLowerCase() : " + s.toLowerCase());
                System.out.println("replace(Java,Python): " + s.replace("Java", "Python"));
                System.out.println("trim()        : " + "  hello  ".trim());
                System.out.println("strip()       : " + "  hello  ".strip()); // Unicode-aware

          // --- Splitting ---
          System.out.println("\n=== Splitting ===");
                String csv = "Alice,Bob,Charlie,Diana";
                String[] parts = csv.split(",");
                for (int i = 0; i < parts.length; i++) {
                              System.out.println("  [" + i + "] " + parts[i]);
                }

          // --- Joining ---
          System.out.println("\n=== Joining ===");
                String joined = String.join(" | ", parts);
                System.out.println("Joined: " + joined);

          // --- Comparison (ALWAYS use equals(), never ==) ---
          System.out.println("\n=== Comparison ===");
                String a = new String("Java");
                String b = new String("Java");
                System.out.println("a == b           : " + (a == b));          // false (different objects)
          System.out.println("a.equals(b)      : " + a.equals(b));       // true
          System.out.println("equalsIgnoreCase : " + "java".equalsIgnoreCase("JAVA")); // true
          System.out.println("compareTo        : " + "apple".compareTo("banana"));   // negative

          // --- String.format / formatted ---
          System.out.println("\n=== Formatting ===");
                String formatted = String.format("Name: %-10s | Age: %3d | Score: %.2f", "Alice", 25, 98.765);
                System.out.println(formatted);

          // --- StringBuilder (efficient for many concatenations) ---
          System.out.println("\n=== StringBuilder ===");
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i <= 5; i++) {
                              sb.append("item").append(i);
                              if (i < 5) sb.append(", ");
                }
                sb.insert(0, "[").append("]");
                System.out.println(sb.toString());
                System.out.println("Reversed: " + sb.reverse());

          // --- Checking content ---
          System.out.println("\n=== Char checks ===");
                String test = "Hello123";
                for (char c : test.toCharArray()) {
                              System.out.printf("'%c' isLetter=%b  isDigit=%b%n", c,
                                                                Character.isLetter(c), Character.isDigit(c));
                }
      }
}
