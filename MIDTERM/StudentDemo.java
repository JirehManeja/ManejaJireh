import java.util.Scanner;

public class StudentDemo {
   public static void main(String[] args) {
      
      Student student = new Student();
      Scanner scan = new Scanner(System.in);
      
      System.out.print("First Name  : ");
      student.setFirstName(scan.nextLine());
      System.out.print("Middle Name : ");
      student.setMiddleName(scan.nextLine());
      System.out.print("Last Name   : ");
      student.setLastName(scan.nextLine());
      System.out.print("Suffix      : ");
      student.setSuffix(scan.nextLine());
      
      System.out.println("Full Name : " + student.getFullName());
      
      // System.out.print("Full Name   : " + student.getFirstName() + " " + student.getMiddleName() + " " + student.getLastName() + " " + student.getSuffix());
   }
}