// ── Interface: a contract that classes must fulfil ──────────────
interface Drawable {
      void draw();                          // abstract by default
    default String getColor() { return "black"; }  // default method (Java 8+)
}

interface Resizable {
      void resize(double factor);
}

// ── Abstract class: partial implementation ───────────────────────
abstract class Shape {
      String name;

    Shape(String name) { this.name = name; }

    // Abstract method – subclasses MUST implement this
    abstract double area();

    // Concrete method – shared by all shapes
    void describe() {
              System.out.printf("%-12s area = %.2f%n", name, area());
    }
}

// ── Concrete classes: implement interface AND extend abstract class
class Circle extends Shape implements Drawable, Resizable {
      double radius;

    Circle(double radius) {
              super("Circle");
              this.radius = radius;
    }

    @Override public double area()          { return Math.PI * radius * radius; }
      @Override public void draw()            { System.out.println("Drawing a circle with radius " + radius); }
      @Override public void resize(double f)  { radius *= f; }
}

class Rectangle extends Shape implements Drawable, Resizable {
      double width, height;

    Rectangle(double w, double h) {
              super("Rectangle");
              this.width = w; this.height = h;
    }

    @Override public double area()          { return width * height; }
      @Override public void draw()            { System.out.println("Drawing a rectangle " + width + "x" + height); }
      @Override public void resize(double f)  { width *= f; height *= f; }
}

class Triangle extends Shape implements Drawable {
      double base, height;

    Triangle(double base, double height) {
              super("Triangle");
              this.base = base; this.height = height;
    }

    @Override public double area()  { return 0.5 * base * height; }
      @Override public void draw()    { System.out.println("Drawing a triangle (base=" + base + ", h=" + height + ")"); }
}

public class InterfacesAndAbstractClasses {
      public static void main(String[] args) {

          // --- Using through abstract type ---
          System.out.println("=== Abstract class polymorphism ===");
                Shape[] shapes = { new Circle(5), new Rectangle(4, 6), new Triangle(3, 8) };
                for (Shape s : shapes) s.describe();

          // --- Using through interface ---
          System.out.println("\n=== Interface polymorphism ===");
                Drawable[] drawables = { new Circle(3), new Rectangle(2, 5), new Triangle(4, 4) };
                for (Drawable d : drawables) {
                              d.draw();
                              System.out.println("  color: " + d.getColor());  // default method
                }

          // --- Resizable interface ---
          System.out.println("\n=== Resizable interface ===");
                Circle c = new Circle(10);
                System.out.printf("Before resize: area = %.2f%n", c.area());
                c.resize(2.0);
                System.out.printf("After  resize: area = %.2f%n", c.area());
      }
}
