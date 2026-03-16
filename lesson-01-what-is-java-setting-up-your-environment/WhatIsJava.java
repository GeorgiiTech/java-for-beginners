/**
 * Lesson 1 – What is Java? Setting Up Your Environment
    *
    * How to run:
  *   1. Make sure Java is installed:  java -version
    *   2. Compile:  javac WhatIsJava.java
    *   3. Run:      java WhatIsJava
    *
    * This class demonstrates basic Java facts and your first compilation steps.
    */
public class WhatIsJava {

    public static void main(String[] args) {

          // Java is a platform-independent, object-oriented language.
          // It compiles to bytecode which runs on the Java Virtual Machine (JVM).

          System.out.println("=== What is Java? ===");
              System.out.println("Java is platform-independent: Write Once, Run Anywhere.");
              System.out.println("Java compiles to bytecode (.class) that runs on the JVM.");
              System.out.println();

          // Print the Java version currently running this code
          String javaVersion = System.getProperty("java.version");
              String javaVendor  = System.getProperty("java.vendor");
              System.out.println("=== Your Java Environment ===");
              System.out.println("Java version : " + javaVersion);
              System.out.println("Java vendor  : " + javaVendor);
              System.out.println();

          // Every Java program needs:
          //  1. A public class matching the filename
          //  2. A main method – the entry point
          System.out.println("=== Anatomy of a Java Program ===");
              System.out.println("public class WhatIsJava {           // class declaration");
              System.out.println("    public static void main(...) {  // entry point");
              System.out.println("        System.out.println(...);    // print to console");
              System.out.println("    }");
              System.out.println("}");
              System.out.println();

          System.out.println("Setup complete! You are ready to write Java.");
    }
}
