package arrays;
import java.util.*;

public class ReverseArray{

    public static void reverse(int [] arr) { // here we create a static method for the main class it accepect an array
        int first = 0;  // here value is 0
        int last = arr.length - 1;  // here suppose array length is 5 value will be (5-1 = 4)

        while(first < last){  // here we check condition inside, This loop is run until first value < last value
            // suppose array is {1,2,3,4,5}
            // after one time of this loop the array will be : {5,2,3,4,1}
            int temp = arr[first];  // here first create a third variable that holds the array first index value => arr[0] => 1
            arr[first] = arr[last]; // here we swap first value with last value => arr[0] = arr[4] => arr[0] = 5
            arr[last] = temp;  // here we swap last value with first value => arr[4] = arr[0] => arr[4] = 1

            first++; // here we increse our first index value by 1 until this loop run => 0 + 1 = 1
            last--;  // here we decrese our last index value by 1  until this loop run => 4 - 1 = 3
        }
    }
    public static void main(String[] args) { 
        int [] item = {89,67,54,90,34,87,34,07}; // here we create our array
        System.out.println("Original arr is : " + Arrays.toString(item)); // here we define before swapping array
        reverse(item); // here we call the method with the argument of array item
        System.out.println("Reverse arr is : " + Arrays.toString(item)); // here we print after swapping array value
    }
}
