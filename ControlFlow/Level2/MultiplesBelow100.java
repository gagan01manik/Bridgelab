import java.util.Scanner;

class MultiplesBelow100 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();

      for (int i = 1; i <= 100; i++) {
         if (i % number == 0)
            System.out.println(i);
      }
      input.close();
   }
}