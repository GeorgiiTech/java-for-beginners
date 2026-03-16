import java.util.*;

public class ArrayListAndCollections {
      public static void main(String[] args) {

          // ── ArrayList ──────────────────────────────────────────────────
          System.out.println("=== ArrayList ===");
                ArrayList<String> names = new ArrayList<>();
                names.add("Alice");
                names.add("Bob");
                names.add("Charlie");
                names.add("Diana");
                System.out.println("List: " + names);
                System.out.println("Size: " + names.size());
                System.out.println("Get(1): " + names.get(1));
                System.out.println("Contains Bob: " + names.contains("Bob"));

          names.set(1, "Ben");           // update index 1
          names.remove("Charlie");       // remove by value
          names.remove(0);               // remove by index
          System.out.println("After edits: " + names);

          // Iterating
          System.out.println("Iterating:");
                for (String name : names) System.out.println("  " + name);

          // ── HashMap ────────────────────────────────────────────────────
          System.out.println("\n=== HashMap (key->value) ===");
                HashMap<String, Integer> scores = new HashMap<>();
                scores.put("Alice", 95);
                scores.put("Ben",   87);
                scores.put("Diana", 92);
                scores.put("Eve",   78);
                System.out.println("Map: " + scores);
                System.out.println("Alice's score: " + scores.get("Alice"));
                System.out.println("Contains key 'Bob': " + scores.containsKey("Bob"));
                scores.put("Alice", 99);   // update
          System.out.println("Alice updated: " + scores.get("Alice"));

          // Iterating over entries
          System.out.println("All entries:");
                for (Map.Entry<String, Integer> entry : scores.entrySet()) {
                              System.out.printf("  %-8s -> %d%n", entry.getKey(), entry.getValue());
                }

          // ── HashSet ────────────────────────────────────────────────────
          System.out.println("\n=== HashSet (unique elements) ===");
                HashSet<String> fruits = new HashSet<>();
                fruits.add("Apple");
                fruits.add("Banana");
                fruits.add("Apple");   // duplicate – ignored
          fruits.add("Cherry");
                System.out.println("Set: " + fruits);
                System.out.println("Size (no duplicates): " + fruits.size());

          // ── Collections utility ────────────────────────────────────────
          System.out.println("\n=== Collections utility ===");
                List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 9, 2, 7));
                System.out.println("Before: " + numbers);
                Collections.sort(numbers);
                System.out.println("Sorted: " + numbers);
                Collections.reverse(numbers);
                System.out.println("Reversed: " + numbers);
                System.out.println("Min: " + Collections.min(numbers));
                System.out.println("Max: " + Collections.max(numbers));
                Collections.shuffle(numbers);
                System.out.println("Shuffled: " + numbers);
      }
}
