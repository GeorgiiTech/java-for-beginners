import java.io.*;
import java.nio.file.*;
import java.util.*;

// ── Student class (OOP + Encapsulation) ─────────────────────────────────────
class Student {
      private String name;
      private List<Double> scores;

    Student(String name) {
              this.name   = name;
              this.scores = new ArrayList<>();
    }

    void addScore(double score) {
              if (score < 0 || score > 100) throw new IllegalArgumentException("Score must be 0-100");
              scores.add(score);
    }

    String getName()   { return name; }
      int    numScores() { return scores.size(); }

    double average() {
              if (scores.isEmpty()) return 0;
              double sum = 0;
              for (double s : scores) sum += s;
              return sum / scores.size();
    }

    String grade() {
              double avg = average();
              if (avg >= 90) return "A";
              if (avg >= 80) return "B";
              if (avg >= 70) return "C";
              if (avg >= 60) return "D";
              return "F";
    }

    boolean passed() { return average() >= 60; }

    @Override
      public String toString() {
                return String.format("%-15s | Scores: %-30s | Avg: %6.2f | Grade: %s | %s",
                                                 name,
                                                 scores.toString(),
                                                 average(),
                                                 grade(),
                                                 passed() ? "PASS" : "FAIL");
      }
}

// ── Main Program ─────────────────────────────────────────────────────────────
public class StudentGradeCalculator {

    static final String REPORT_FILE = "grade_report.txt";

    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              List<Student> students = new ArrayList<>();

          System.out.println("╔══════════════════════════════════════╗");
              System.out.println("║   Student Grade Calculator v1.0      ║");
              System.out.println("╚══════════════════════════════════════╝");

          boolean running = true;
              while (running) {
                            System.out.println("\nMenu: [1] Add student  [2] View report  [3] Save & Exit");
                            System.out.print("Choice: ");
                            String choice = scanner.nextLine().trim();

                  switch (choice) {
                    case "1" -> addStudent(scanner, students);
                    case "2" -> printReport(students);
                    case "3" -> { saveReport(students); running = false; }
                                      default  -> System.out.println("Invalid choice. Try 1, 2, or 3.");
                  }
              }

          scanner.close();
              System.out.println("Goodbye!");
    }

    static void addStudent(Scanner sc, List<Student> students) {
              System.out.print("Student name: ");
              String name = sc.nextLine().trim();
              if (name.isEmpty()) { System.out.println("Name cannot be empty."); return; }

          Student student = new Student(name);

          System.out.print("How many scores to enter? ");
              int n = 0;
              try { n = Integer.parseInt(sc.nextLine().trim()); }
              catch (NumberFormatException e) { System.out.println("Invalid number."); return; }

          for (int i = 1; i <= n; i++) {
                        System.out.printf("Score %d (0-100): ", i);
                        try {
                                          double score = Double.parseDouble(sc.nextLine().trim());
                                          student.addScore(score);
                        } catch (NumberFormatException | IllegalArgumentException e) {
                                          System.out.println("Invalid score: " + e.getMessage() + " — skipped.");
                        }
          }

          if (student.numScores() > 0) {
                        students.add(student);
                        System.out.println("Added: " + student);
          } else {
                        System.out.println("No valid scores entered — student not added.");
          }
    }

    static void printReport(List<Student> students) {
              if (students.isEmpty()) { System.out.println("No students yet."); return; }
              System.out.println("\n" + "─".repeat(80));
              System.out.printf("%-15s | %-30s | %6s | %5s | %s%n",
                  "Name", "Scores", "Avg", "Grade", "Result");
              System.out.println("─".repeat(80));
              for (Student s : students) System.out.println(s);
              System.out.println("─".repeat(80));

          long passing = students.stream().filter(Student::passed).count();
              System.out.printf("Total: %d students | Passing: %d | Failing: %d%n",
                                            students.size(), passing, students.size() - passing);
    }

    static void saveReport(List<Student> students) {
              StringBuilder sb = new StringBuilder();
              sb.append("STUDENT GRADE REPORT\n");
              sb.append("=".repeat(60)).append("\n");
              if (students.isEmpty()) {
                            sb.append("No students recorded.\n");
              } else {
                            for (Student s : students) sb.append(s).append("\n");
                            long passing = students.stream().filter(Student::passed).count();
                            sb.append("-".repeat(60)).append("\n");
                            sb.append(String.format("Total: %d | Passing: %d | Failing: %d%n",
                                                                    students.size(), passing, students.size() - passing));
              }

          try {
                        Files.writeString(Path.of(REPORT_FILE), sb.toString());
                        System.out.println("Report saved to: " + REPORT_FILE);
          } catch (IOException e) {
                        System.out.println("Could not save file: " + e.getMessage());
          }
    }
}
