import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        // Create a hash map to store the integer values of Roman numerals
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = map.get(s.charAt(i));

            // If the value of the current symbol is less than the previous one, subtract it
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }
            prevValue = currValue;
        }

        return result;
    }
    
    // Main class begins here
    public static void main(String[] args) {
        // Test cases
        String[] testCases = {"IV", "LVIII", "MCMXCIV"};
        for (String testCase : testCases) {
            System.out.println("Roman numeral: " + testCase + ", Integer value: " + romanToInt(testCase));
        }
    }
}
