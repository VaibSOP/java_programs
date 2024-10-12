import java.util.Scanner;

public class yash
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array (you can modify this with your own data)
        int[] arr = { 10, 25, 7, 42, 15, 30, 5 };

        System.out.print("Enter the value to search for: ");
        int target = scanner.nextInt();

        // Perform linear search
        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Found " + target + " at index " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }

        scanner.close();
    }

    // Linear search function
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Found the target value
            }
        }
        return -1; // Target value not found
    }
}
