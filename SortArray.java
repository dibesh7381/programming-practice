public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};

        // Sorting logic (using Bubble Sort)
        for (int i = 0; i < arr.length - 1; i++) { // loop is run 5 times
            for (int j = 0; j < arr.length - 1 - i; j++) {  // loop is run 5 times
                if (arr[j] > arr[j + 1]) {  // if(5 > 2)
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];  // temp = 5
                    arr[j] = arr[j + 1];  // 5 = 2
                    arr[j + 1] = temp;  // 2 = 5
                }
            }
        }

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}

