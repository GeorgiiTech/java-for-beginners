import java.io.*;
import java.nio.file.*;
import java.util.List;

public class ReadingAndWritingFiles {

    static final String FILE_PATH = "lesson17_output.txt";

    public static void main(String[] args) {

          // ── 1. Write with BufferedWriter (classic API) ───────────────
          System.out.println("=== Writing file (BufferedWriter) ===");
              try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
                            writer.write("Line 1: Hello from Java file I/O!");
                            writer.newLine();
                            writer.write("Line 2: Writing files is easy.");
                            writer.newLine();
                            writer.write("Line 3: BufferedWriter is efficient.");
                            System.out.println("File written: " + FILE_PATH);
              } catch (IOException e) {
                            System.out.println("Write error: " + e.getMessage());
              }

          // ── 2. Read with BufferedReader (classic API) ────────────────
          System.out.println("\n=== Reading file (BufferedReader) ===");
              try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
                            String line;
                            int lineNum = 1;
                            while ((line = reader.readLine()) != null) {
                                              System.out.println(lineNum++ + ": " + line);
                            }
              } catch (IOException e) {
                            System.out.println("Read error: " + e.getMessage());
              }

          // ── 3. Append to existing file ───────────────────────────────
          System.out.println("\n=== Appending to file ===");
              try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
                            writer.newLine();
                            writer.write("Line 4: Appended later.");
                            System.out.println("Appended successfully.");
              } catch (IOException e) {
                            System.out.println("Append error: " + e.getMessage());
              }

          // ── 4. Modern Files API (Java 11+) ───────────────────────────
          System.out.println("\n=== Modern Files API (Java 11+) ===");
              Path path = Path.of(FILE_PATH);
              try {
                            // Read all lines at once
                  List<String> lines = Files.readAllLines(path);
                            System.out.println("Total lines: " + lines.size());
                            lines.forEach(l -> System.out.println("  >> " + l));

                  // Write entire content at once
                  String content = "Rewritten with Files.writeString()!\nTwo lines total.";
                            Files.writeString(path, content);

                  // Read entire content as a String
                  String readBack = Files.readString(path);
                            System.out.println("\nContent after Files.writeString:\n" + readBack);

              } catch (IOException e) {
                            System.out.println("Files API error: " + e.getMessage());
              }

          // ── 5. File existence and metadata ──────────────────────────
          System.out.println("\n=== File Info ===");
              File file = new File(FILE_PATH);
              System.out.println("Exists  : " + file.exists());
              System.out.println("Readable: " + file.canRead());
              System.out.println("Size    : " + file.length() + " bytes");
              System.out.println("Path    : " + file.getAbsolutePath());

          // Clean up
          file.delete();
              System.out.println("\nFile deleted. Exists: " + file.exists());
    }
}
