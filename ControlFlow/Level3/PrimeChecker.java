package ControlFlow.Level3;

import java.util.Scanner;

class PrimeChecker {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();

      boolean isPrime = true;

      if (number <= 1) {
         isPrime = false;
      } else {
         for (int i = 2; i < number; i++) {
            if (number % i == 0) {
               isPrime = false;
               break;
            }
         }
      }

      if (isPrime)
         System.out.println(number + " is a Prime Number");
      else
         System.out.println(number + " is not a Prime Number");
      input.close();
   }
}