import java.util.Scanner;

public class LargestNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // here we declare a scanner class object

        System.out.print("Enter the size of an array : ");  // here we want user input
        int size = sc.nextInt();  // here we got the user input

        int [] numbers = new int[size];  // here we make our array, size is whatever the user is give

        for (int i = 0; i < numbers.length; i++) {  // here the condition is checked
            System.out.println("Enter the value you want to put in an array : "); // here we want user is give the value so we put in our array
            int value = sc.nextInt();  // here we got the values
            numbers[i] = value;  // here we insert values in an array
        }

        int largest = numbers[0];  // here we got the first value of an array
        int smallest = numbers[0];  // here also we  got the first value of an array

        for (int i = 1; i < numbers.length; i++) {  // here the loop is starting from index 1 of an array until array full length
             if(numbers[i] > largest){ // here we check for find largest value [like if index-1 value is 20 and largest value is 10 condition is true it runs]
                largest = numbers[i];  // here we update our largest value like old value is 10 then new value is 20
             }
             if (numbers[i] < smallest) {  // here also same we find the smallest value
                smallest = numbers[i];  // old value is 5 then new value is 3
             }
        }

        System.out.println("Largest number from array is " + largest);  // here we print largest value from an array
        System.out.println("Smallest number from array is " + smallest);  // here we print  smallest value from an array


        sc.close(); // here we close the Scanner class object
    }
}