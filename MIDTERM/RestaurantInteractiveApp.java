// Name : Maneja, Jireh G.
// Assignment 1: Restaurant Interactive Application

import java.text.DecimalFormat;
import java.util.Scanner;

public class RestaurantInteractiveApp {
  
  // Display the menu options
  public static void printMenu() {
    System.out.println("- - - - - - - - - - - -");
    System.out.println("Menu:");
    System.out.println("1. C1 - Php 100.00");
    System.out.println("2. C2 - Php 150.00");
    System.out.println("3. C3 - Php 200.00");
    System.out.println("Add Ons:");
    System.out.println("4. R1 - Php 35.00");
    System.out.println("5. R2 - Php 50.00");
    System.out.println("- - - - - - - - - - - -");
  }
  
  // Prompt the user for quantity
  public static void quantityInput() {
    System.out.print("Quantity: ");
  }
  
  public static void main(String[] args) {
    
    // Initialize variables
    int choice, quantity;
    int c1 = 0, c2 = 0, c3 = 0, r1 = 0, r2 = 0;
    double total = 0.0;
    double usd = 0.0;
    
    Scanner input = new Scanner(System.in);
    DecimalFormat f = new DecimalFormat("0.00");
    
    do {
      
      printMenu(); // Display the menu
      
      System.out.print("Choice (0 to finish): ");
      choice = input.nextInt();
      
      switch (choice) {
        case 1: // Update the total, USD conversion, and quantity of C1
            quantityInput();
            quantity = input.nextInt();
            total += 100 * quantity;
            usd = total / 56.84;
            c1 += quantity;
            System.out.println("Order: " + quantity + " C1");
            System.out.printf("Current Total : Php " + total + " or USD " + f.format(usd) + "\n\n");
            break;
          
        case 2: // Update the total, USD conversion, and quantity of C2
            quantityInput();
            quantity = input.nextInt();
            total += 150 * quantity;
            usd = total / 56.84;
            c2 += quantity;
            System.out.println("Order: " + quantity + " C2");
            System.out.printf("Current Total : Php " + total + " or USD " + f.format(usd) + "\n\n");
            break;
          
        case 3: // Update the total, USD conversion, and quantity of C3
            quantityInput();
            quantity = input.nextInt();
            total += 200 * quantity;
            usd = total / 56.84;
            c3 += quantity;
            System.out.println("Order: " + quantity + " C3");
            System.out.printf("Current Total : Php " + total + " or USD " + f.format(usd) + "\n\n");
            break;
          
        case 4: // Update the total, USD conversion, and quantity of R1
            quantityInput();
            quantity = input.nextInt();
            total += 35 * quantity;
            usd = total / 56.84;
            r1 += quantity;
            System.out.println("Order: " + quantity + " R1");
            System.out.printf("Current Total : Php " + total + " or USD " + f.format(usd) + "\n\n");
            break;
          
        case 5: // Update the total, USD conversion, and quantity of R2
            quantityInput();
            quantity = input.nextInt();
            total += 50 * quantity;
            usd = total / 56.84;
            r2 += quantity;
            System.out.println("Order: " + quantity + " R2");
            System.out.printf("Current Total : Php " + total + " or USD " + f.format(usd) + "\n\n");
            break;
      }
    } while (choice != 0);
    
    // Display the items ordered
    System.out.println("Order Summary");
    System.out.println(c1 + " - C1");
    System.out.println(c2 + " - C2");
    System.out.println(c3 + " - C3");
    System.out.println(r1 + " - R1");
    System.out.println(r2 + " - R2");
    System.out.print("Total: $" + f.format(usd));
  }
}
