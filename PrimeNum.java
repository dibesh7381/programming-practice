
import java.util.Scanner;

public class PrimeNum {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  // here we create a Scanner class object

      System.out.print("Enter a number : ");   // here we want user input
      int num = sc.nextInt(); // here we got the input value

      if (num <= 0) { // here if the value is 0 or less than 0 it is not a prime number
         System.out.println(num + " is not a prime number");
      }
      else{ // else here is the condition is checked
         boolean isPrime = true;  // boolean value is true
         for (int i = 2; i < num / 2; i++) { // here the loop is running based on user input / 2 meaning [10/2 = 5 times]
            if(num %i == 0){  // here check the logic if [10 %2 == 0] true it runs 
                isPrime = false;  // change the boolean value to false
                break;  // stop the program here 
            }
         }

         if (isPrime) {  // if the value is divisible by 1 and itself it is a prime number
            System.out.println(num + " is a prime number");
         }
         else{ // either the value is not a prime number if it divisible by 1,itself and by any value
            System.out.println(num + " is not a prime number");
         }
      }


      sc.close();  // here we stop our program
   }
}
