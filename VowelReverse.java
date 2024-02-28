class VowelReverse {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            // Move left pointer to the right until it points to a vowel
            while (left < right && !vowels.contains(chars[left] + ""))
                left++;
            
            // Move right pointer to the left until it points to a vowel
            while (left < right && !vowels.contains(chars[right] + ""))
                right--;

            // Swap vowels at left and right pointers
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        VowelReverse solution = new VowelReverse();
        
        // Test cases
        String s1 = "hello";
        System.out.println("Original string: " + s1);
        System.out.println("Reversed vowels: " + solution.reverseVowels(s1)); // Output: "holle"
        
        String s2 = "leetcode";
        System.out.println("Original string: " + s2);
        System.out.println("Reversed vowels: " + solution.reverseVowels(s2)); // Output: "leotcede"
}}
