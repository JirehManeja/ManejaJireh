// Name : Maneja, Jireh G.

import java.util.Scanner;

public class RouteApplication {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      double route1 = 84.9, route2 = 96.2, route3 = 102.4; 
      double speed = 0.0, estimatedTime = 0.0, hours = 0.0, minutes = 0.0;
      int answer, choice;
      
      System.out.print("Is Barili blocked? 1(yes) / 0(no): ");
      answer = scanner.nextInt();
      
      if (answer == 0) {
         System.out.print("Enter Speed (km/hr): ");
         speed = scanner.nextDouble();
         estimatedTime = route1 / speed;
         hours = (int) estimatedTime;
         minutes = (int) ((estimatedTime - hours) * 60);
         printRoute1();
         System.out.println("Distance: " + route1 + "km");
         System.out.println("Speed: " + (int)speed + "km/hr");
         System.out.println("Estimate Time of Arrival: " + (int)hours + " hr" + " " + (int)minutes + " min");
      } else if (answer == 1) {
         System.out.println("\nYou have chosen a different route (Sibonga)");
         System.out.println("Which route from Sibonga would you choose?");
         System.out.print("1-Dumanjug, 0-Argao. Choice: ");
         choice = scanner.nextInt();
         
         if (choice == 1) {
            System.out.print("Enter Speed (km/hr): ");
            speed = scanner.nextDouble();
            estimatedTime = route2 / speed;
            hours = (int) estimatedTime;
            minutes = (int) ((estimatedTime - hours) * 60);
            printRoute2();
            System.out.println("Distance: " + route2 + "km");
            System.out.println("Speed: " + (int)speed + "km/hr");
            System.out.println("Estimate Time of Arrival: " + (int)hours + " hr" + " " + (int)minutes + " min");
         } else if (choice == 0) {
            System.out.print("Enter Speed (km/hr): ");
            speed = scanner.nextDouble();
            estimatedTime = route3 / speed;
            hours = (int) estimatedTime;
            minutes = (int) ((estimatedTime - hours) * 60);
            printRoute3();
            System.out.println("Distance: " + route3 + "km");
            System.out.println("Speed: " + (int)speed + "km/hr");
            System.out.println("Estimate Time of Arrival: " + (int)hours + " hr" + " " + (int)minutes + " min");
         } else { System.out.println("Invalid"); }
      } else { System.out.println("Invalid"); }
   }
   public static void printRoute1() {
      System.out.println("\nRoute 1:");
      System.out.println("Cebu City (Emall) - Start");
      System.out.println("Minglanilla       - Route 1");
      System.out.println("San Fernando      - Route 2");
      System.out.println("Carcar            - Route 3");
      System.out.println("Barili            - Route 4.1");
      System.out.println("Dumanjug          - Route 4.1.1");
      System.out.println("Alcantara         - Route 4.1.2");
      System.out.println("Moalboal          - End\n");
   }
   
   public static void printRoute2() {
      System.out.println("\nRoute 2:");
      System.out.println("Cebu City (Emall) - Start");
      System.out.println("Minglanilla       - Route 1");
      System.out.println("San Fernando      - Route 2");
      System.out.println("Carcar            - Route 3");
      System.out.println("Sibonga           - Route 4.2");
      System.out.println("Dumanjug          - Route 4.2.1");
      System.out.println("Alcantara         - Route 4.2.2");
      System.out.println("Moalboal          - End\n");
   }
   
   public static void printRoute3() {
      System.out.println("\nRoute 3:");
      System.out.println("Cebu City (Emall) - Start");
      System.out.println("Minglanilla       - Route 1");
      System.out.println("San Fernando      - Route 2");
      System.out.println("Carcar            - Route 3");
      System.out.println("Sibonga           - Route 4.2");
      System.out.println("Argao             - Route 5");
      System.out.println("Ronda             - Route 5.1");
      System.out.println("Alcantara         - Route 5.2");
      System.out.println("Moalboal          - End\n");
   }
}