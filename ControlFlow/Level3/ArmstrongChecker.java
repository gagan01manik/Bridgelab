package ControlFlow.Level3;

import java.util.Scanner;

class ArmstrongChecker {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();

      int originalNumber = number;
      int sum = 0;

      while (originalNumber != 0) {
         int digit = originalNumber % 10;
         sum += digit * digit * digit;
         originalNumber = originalNumber / 10;
      }

      if (sum == number)
         System.out.println(number + " is an Armstrong Number");
      else
         System.out.println(number + " is not an Armstrong Number");
      input.close();
   }
}