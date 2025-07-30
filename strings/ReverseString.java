package strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String text = sc.nextLine();

        String newText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            newText += text.charAt(i);
        }

        System.out.println("Original String: " + text);
        System.out.println("After Reversing the String: " + newText);

        sc.close();
    }
}

