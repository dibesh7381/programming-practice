package strings;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // here we create a scanner class object

        System.out.print("Enter a string to check Palindrome: "); // here we want an user value
        String str = sc.nextLine().replaceAll("\\s", "").toLowerCase(); // here we got the value + check ignore spaces and case

        String reversed = ""; // here we set a demo variable for concatenation

        for (int i = str.length() - 1; i >= 0; i--) { // here the loop is run backwards until the String length is 0
            reversed += str.charAt(i); //  here we store str value in reverse order
        }

        if (str.equals(reversed)) { // here we check if madam is equals madam reverse order if true it print
            System.out.println(str + " It is a Palindrome.");
        } else { //  else this line will be print
            System.out.println(str + " It is not a Palindrome.");
        }

        sc.close(); // here we close our scanner class object
    }
}

