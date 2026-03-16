public class ConditionalStatements {
      public static void main(String[] args) {

          // --- Basic if ---
          System.out.println("=== Basic if ===");
                int temperature = 25;
                if (temperature > 20) {
                              System.out.println("It's warm outside.");
                }

          // --- if / else ---
          System.out.println("\n=== if / else ===");
                int age = 16;
                if (age >= 18) {
                              System.out.println("You can vote.");
                } else {
                              System.out.println("You cannot vote yet.");
                }

          // --- if / else if / else ---
          System.out.println("\n=== if / else if / else ===");
                int score = 75;
                String grade;
                if (score >= 90) {
                              grade = "A";
                } else if (score >= 80) {
                              grade = "B";
                } else if (score >= 70) {
                              grade = "C";
                } else if (score >= 60) {
                              grade = "D";
                } else {
                              grade = "F";
                }
                System.out.println("Score: " + score + " => Grade: " + grade);

          // --- Nested if ---
          System.out.println("\n=== Nested if ===");
                boolean hasTicket = true;
                int userAge = 21;
                if (hasTicket) {
                              if (userAge >= 18) {
                                                System.out.println("Welcome to the event!");
                              } else {
                                                System.out.println("You are too young for this event.");
                              }
                } else {
                              System.out.println("Sorry, you need a ticket.");
                }

          // --- Switch statement (classic) ---
          System.out.println("\n=== switch (classic) ===");
                int dayNumber = 3;
                String dayName;
                switch (dayNumber) {
                  case 1:  dayName = "Monday";    break;
                  case 2:  dayName = "Tuesday";   break;
                  case 3:  dayName = "Wednesday"; break;
                  case 4:  dayName = "Thursday";  break;
                  case 5:  dayName = "Friday";    break;
                  case 6:  dayName = "Saturday";  break;
                  case 7:  dayName = "Sunday";    break;
                  default: dayName = "Unknown";
                }
                System.out.println("Day " + dayNumber + " => " + dayName);

          // --- Switch expression (Java 14+) ---
          System.out.println("\n=== switch expression (Java 14+) ===");
                String season = "WINTER";
                String description = switch (season) {
                  case "SPRING" -> "Flowers bloom";
                  case "SUMMER" -> "Hot and sunny";
                  case "AUTUMN" -> "Leaves fall";
                  case "WINTER" -> "Cold and snowy";
                              default        -> "Unknown season";
                };
                System.out.println(season + " => " + description);
      }
}
