// ─────────────────────────────────────────────────────────────────
// A simple class representing a real-world "Dog"
// ─────────────────────────────────────────────────────────────────
class Dog {

    // Fields (instance variables) – the state of the object
    String name;
      String breed;
      int    age;

    // Constructor – called when we create a new Dog object
    Dog(String name, String breed, int age) {
              this.name  = name;    // 'this' refers to the current object
          this.breed = breed;
              this.age   = age;
    }

    // Default constructor
    Dog() {
              this("Unknown", "Mixed", 0);
    }

    // Methods – the behaviour of the object
    void bark() {
              System.out.println(name + " says: Woof!");
    }

    String describe() {
              return name + " (" + breed + ", " + age + " years old)";
    }
}

// ─────────────────────────────────────────────────────────────────
// A class with encapsulation (private fields + getters/setters)
// ─────────────────────────────────────────────────────────────────
class BankAccount {

    private String owner;   // private = only accessible inside this class
    private double balance;

    BankAccount(String owner, double initialBalance) {
              this.owner   = owner;
              this.balance = initialBalance;
    }

    // Getter
    public double getBalance() { return balance; }
      public String getOwner()   { return owner; }

    // Business logic in a method – protects the balance
    public void deposit(double amount) {
              if (amount <= 0) { System.out.println("Deposit must be positive."); return; }
              balance += amount;
              System.out.printf("Deposited %.2f. New balance: %.2f%n", amount, balance);
    }

    public void withdraw(double amount) {
              if (amount > balance) { System.out.println("Insufficient funds."); return; }
              balance -= amount;
              System.out.printf("Withdrew  %.2f. New balance: %.2f%n", amount, balance);
    }
}

// ─────────────────────────────────────────────────────────────────
// Main class
// ─────────────────────────────────────────────────────────────────
public class IntroToOOP {
      public static void main(String[] args) {

          // --- Creating objects ---
          System.out.println("=== Dog Objects ===");
                Dog rex   = new Dog("Rex",   "German Shepherd", 3);
                Dog bella = new Dog("Bella", "Labrador",         5);
                Dog stray = new Dog();   // default constructor

          rex.bark();
                bella.bark();
                System.out.println(rex.describe());
                System.out.println(bella.describe());
                System.out.println(stray.describe());

          // Modify a field directly (public access)
          stray.name  = "Max";
                stray.breed = "Beagle";
                stray.age   = 2;
                System.out.println("After update: " + stray.describe());

          // --- Encapsulation ---
          System.out.println("\n=== BankAccount (Encapsulation) ===");
                BankAccount account = new BankAccount("Alice", 1000.00);
                System.out.println("Owner:   " + account.getOwner());
                System.out.println("Balance: " + account.getBalance());

          account.deposit(500.00);
                account.withdraw(200.00);
                account.withdraw(2000.00);   // insufficient

          // account.balance = 999999;  // COMPILE ERROR – balance is private
      }
}
