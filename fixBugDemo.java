package fixBug;
import java.util.Arrays;
public class fixBugDemo {
	// Function  performing linear search
	public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;  // Return the index if the target is found
            }
        }
        return -1;  // Return -1 if the target is not found
    }

	public static void main(String[] args) {
		
		int[] arr = {5, 6, 7, 8, 9};
        int target = 3;
        int result = linearSearch(arr, target);
        System.out.println("Index of " + target + ": " + result);  
     // Original array
        int[] Array = {1, 30, 8, 5, 9};

        // Sorting the array
        Arrays.sort(Array);
        
        System.out.print("Sorted Array: ");
        for (int num : Array) {
            System.out.print(num + " ");
        }
		       }
		}