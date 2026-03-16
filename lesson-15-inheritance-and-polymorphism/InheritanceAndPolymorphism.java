// Parent / base class
class Animal {
      String name;
      String sound;

    Animal(String name, String sound) {
              this.name  = name;
              this.sound = sound;
    }

    // Can be overridden by subclasses
    void makeSound() {
              System.out.println(name + " says: " + sound);
    }

    void eat() {
              System.out.println(name + " is eating.");
    }

    @Override
      public String toString() {
                return "Animal(" + name + ")";
      }
}

// Subclass – inherits from Animal
class Dog extends Animal {
      String breed;

    Dog(String name, String breed) {
              super(name, "Woof");  // calls Animal constructor
          this.breed = breed;
    }

    // Overriding parent method
    @Override
      void makeSound() {
                System.out.println(name + " (" + breed + ") barks: Woof woof!");
      }

    void fetch() {
              System.out.println(name + " fetches the ball!");
    }
}

class Cat extends Animal {
      boolean isIndoor;

    Cat(String name, boolean isIndoor) {
              super(name, "Meow");
              this.isIndoor = isIndoor;
    }

    @Override
      void makeSound() {
                System.out.println(name + " purrs and says: Meow~ (indoor=" + isIndoor + ")");
      }
}

class Bird extends Animal {
      Bird(String name) {
                super(name, "Tweet");
      }

    @Override
      void makeSound() {
                System.out.println(name + " sings: Tweet tweet!");
      }

    void fly() {
              System.out.println(name + " is flying!");
    }
}

public class InheritanceAndPolymorphism {
      public static void main(String[] args) {

          // --- Basic inheritance ---
          System.out.println("=== Inheritance ===");
                Dog dog = new Dog("Rex", "German Shepherd");
                dog.makeSound();      // overridden
          dog.eat();            // inherited from Animal
          dog.fetch();          // Dog-specific

          // --- Polymorphism: Animal reference holds Dog object ---
          System.out.println("\n=== Polymorphism ===");
                Animal[] animals = {
                              new Dog("Buddy", "Labrador"),
                              new Cat("Whiskers", true),
                              new Bird("Tweety"),
                              new Dog("Max", "Poodle")
                };

          for (Animal a : animals) {
                        a.makeSound();  // correct version called at runtime
          }

          // --- instanceof check ---
          System.out.println("\n=== instanceof ===");
                for (Animal a : animals) {
                              if (a instanceof Dog d) {             // Java 16+ pattern matching
                                  System.out.println(d.name + " is a Dog, breed: " + d.breed);
                              } else if (a instanceof Bird b) {
                                                System.out.println(b.name + " is a Bird");
                                                b.fly();
                              } else {
                                                System.out.println(a.name + " is a " + a.getClass().getSimpleName());
                              }
                }

          // --- super keyword ---
          System.out.println("\n=== super keyword ===");
                System.out.println(dog);  // toString() inherited from Animal
      }
}
