import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // here we make our Scanner class for user input

        System.out.print("Enter a Number : ");  // here we take user input
        int num = sc.nextInt();  // here we got the value whatever the user give

        if(num %2 == 0){  // here we check condition [suppose user give 4,  condition is checked (4 %2 == 0) remainder is 0 so this condition is true]
            System.out.println(num + " is a even number");
        }
        else{
            System.out.println(num + " is a odd number");  // here if user give 3 => (3 %2 == 1) remainder is 1 so condition is false and this else case is executed
        }


        sc.close();  // here we close our Scanner class [optional but good for optimization]
    }
}