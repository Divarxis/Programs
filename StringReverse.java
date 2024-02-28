class StringReverse {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces and split the string into words
        String[] words = s.trim().split("\\s+");
        
        StringBuilder reversed = new StringBuilder();
        
        // Append words in reverse order with a single space between each word
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }
    
    public static void main(String[] args) {
        StringReverse solution = new StringReverse();
        
        // Test cases
        String s1 = "the sky is blue";
        System.out.println(solution.reverseWords(s1)); // Output: "blue is sky the"
        
        String s2 = "  hello world  ";
        System.out.println(solution.reverseWords(s2)); // Output: "world hello"
        
        String s3 = "Raunak is Generous";
        System.out.println(solution.reverseWords(s3)); // Output: "example good a"
    }
}
