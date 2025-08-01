package ControlFlow.Level3;
import java.util.Scanner;

class LeapYearSingleIf {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int year = input.nextInt();

      if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
         System.out.println(year + " is a Leap Year");
      } else {
         System.out.println(year + " is not a Leap Year");
      }
      input.close();
   }
}