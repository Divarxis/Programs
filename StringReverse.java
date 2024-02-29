class StringReverse {
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        int end = s.length();

        // Iterate over the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            // If we encounter a space or reach the beginning of a word, append the word to the result
            if (s.charAt(i) == ' ') {
                reversed.append(s.substring(i + 1, end)).append(' ');
                // Skip trailing spaces
                while (i >= 0 && s.charAt(i) == ' ') {
                    i--;
                }
                // Update the end index for the next word
                end = i + 1;
            }
        }
        // Append the first word (if any)
        reversed.append(s.substring(0, end));

        return reversed.toString().trim(); // Trim trailing spaces
    }
    public static void main(String[] args) {
        StringReverse solution = new StringReverse();

        // Test cases
        String s1 = "the sky is blue";
        System.out.println(solution.reverseWords(s1)); // Output: "blue is sky the"

        String s2 = "  hello world  ";
        System.out.println(solution.reverseWords(s2)); // Output: "world hello"

        String s3 = "a good   example";
        System.out.println(solution.reverseWords(s3)); // Output: "example good a"
    }
}
