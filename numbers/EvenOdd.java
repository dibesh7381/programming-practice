package numbers;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // here we declare Scanner class object

        System.out.println("Enter a number : ");  // here we want an user input
        int num = sc.nextInt(); // here we got the user value

        if (num %2 == 0){  // here check the condition [10 %2 == 0 => remainder is 0 so it is run]
            System.out.println(num + " is an even number");
        }
        else{ // if condition is false else is run
            System.out.println(num + " is an odd number");
        }

        sc.close();  // here we close our scanner object class
    }
}
