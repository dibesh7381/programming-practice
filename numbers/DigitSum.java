package numbers;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // here we create Scanner class object

        int sum = 0;  // here we set the demo variable 
        int num = 0; // here we set the demo variable 

        System.out.print("Enter a number : "); // here we want user input
        num = sc.nextInt();  // here we got the user value

        while (num > 0) {  // it runs until num value is 0
            sum = sum + (num % 10);  // here example [num value is 11 => sum = 0 + 1 = 1] again calculate [1 + 1 = 2]
            num = num / 10; // here [num = 11 / 10 = 1] again here [num = 1/10 = 0] condition is false loop exit
        }

        System.out.println("Sum of the digits is : " + sum);  // here we print the sum value



        sc.close();  // here we close the Scanner class
    }
}
