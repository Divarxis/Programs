import java.util.Arrays;

public class SecondLargestElement {
    public static int findSecondLargest(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        // Clone the original array to avoid modifying it
        int[] sortedArray = array.clone();

        // Sort the cloned array in ascending order
        Arrays.sort(sortedArray);

        // The second last element in the sorted array will be the second largest
        return sortedArray[sortedArray.length - 2];
    }
    public static void main(String[] args) {
        int[] intArray = {5, 10, 12, 6, 9};

        System.out.println("Original intArray: " + Arrays.toString(intArray));
        System.out.println("Second largest element in intArray: " + findSecondLargest(intArray));
    }
}
