package strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // here we create a Scanner class object

        System.out.print("Enter a String : "); // here we want an user input
        String text = sc.nextLine();  // here we got the user value

        String newText = "";  // here we set a demo variable for concatenation

        for (int i = text.length() - 1; i >= 0; i--) { // here the loop is running until the text length is 0
            newText += text.charAt(i); // here we concatenate our String [newText = descending order]
        }

        System.out.println("Original String: " + text); // here we print original String
        System.out.println("After Reversing the String: " + newText); // here we print reverse String

        sc.close(); // here we close our Scanner object class
    }
}

