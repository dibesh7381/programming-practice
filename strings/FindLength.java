package strings;

import java.util.Scanner;

public class FindLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // here we create Scanner class object

        System.out.print("Enter a String : "); // here we want user input
        String s = sc.nextLine();  // here we got the user input value

        System.out.println("Length of " + s + " is : " + s.length());  // here we print the length of the value

        sc.close();  //  here we close our Scanner class object
    }
}
