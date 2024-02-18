public class MergeSort {
    // Main method to perform Merge Sort
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            // Base case: If the array is empty or has only one element, it is already sorted
            return;
        }
        // Call the helper method to recursively sort the array
        sort(arr, 0, arr.length - 1);
    }

    // Helper method to recursively sort the array
    private static void sort(int[] arr, int left, int right) {
        if (left < right) {
            // Calculate the middle index
            int mid = left + (right - left) / 2;

            // Recursively sort the left and right halves
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted subarrays into a single sorted array
    private static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays to store the subarrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data from the original array to the temporary arrays
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[mid + 1 + j];
        }

        // Merge the two temporary arrays into the original array
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements from R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main method to test the Merge Sort implementation
    public static void main(String[] args) {
        // Sample array to be sorted
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array:");
        printArray(arr);

        // Perform Merge Sort
        mergeSort(arr);

        System.out.println("\nSorted array:");
        printArray(arr);
    }

    // Utility method to print the elements of an array
    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
