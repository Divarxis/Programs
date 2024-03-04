public class MajorityElement {

    // Function to find the majority element using Moore's Voting Algorithm
    public static int findMajorityElement(int[] nums) {
        // Step 1: Moore's Voting Algorithm to find candidate
        int candidate = 0; // Initialize the candidate element
        int count = 0; // Initialize the count of the candidate element
        
        // Iterate through the array
        for (int num : nums) {
            // If count is 0, assign the current element as candidate
            // and increment the count
            if (count == 0) {
                candidate = num;
                count++;
            } 
            // If the current element is equal to the candidate, increment count
            else if (num == candidate) {
                count++;
            } 
            // If the current element is different from candidate, decrement count
            else {
                count--;
            }
        }

        // Step 2: Verify candidate
        count = 0; // Reset count for verification
        
        // Iterate through the array again to count occurrences of candidate
        for (int num : nums) {
            // If the current element is equal to candidate, increment count
            if (num == candidate) {
                count++;
            }
        }

        // If candidate appears more than n/2 times, return it as majority element
        if (count > nums.length / 2) {
            return candidate;
        } else {
            // No majority element found
            return -1;
        }
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {9, 3, 9, 2, 9, 5, 3, 9, 9, 9, 9};

        // Call the findMajorityElement function and print the result
        int majorityElement = findMajorityElement(nums);
        if (majorityElement != -1) {
            System.out.println("Majority Element: " + majorityElement);
        } else {
            System.out.println("No Majority Element");
        }
    }
}
