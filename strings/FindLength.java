package strings;

import java.util.Scanner;

public class FindLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String s = sc.nextLine();

        System.out.println("Length of " + s + " is : " + s.length());

        sc.close();
    }
}
