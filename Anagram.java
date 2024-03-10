import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first string:");
        String a = scanner.nextLine();
        
        System.out.println("Enter the second string:");
        String b = scanner.nextLine();
        
        System.out.println(isAnagram(a, b)); // Output: true or false
        
        scanner.close();
    }

    public static boolean isAnagram(String a, String b) {
        // Convert strings to lowercase for case-insensitive comparison
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // Arrays to store character frequencies
        int[] freqA = new int[26]; // Assuming English alphabets only
        int[] freqB = new int[26]; // Assuming English alphabets only
        
        // Count character frequencies in string a
        for (char c : a.toCharArray()) {
            if (Character.isLetter(c)) {
                freqA[c - 'a']++;
            }
        }
        
        // Count character frequencies in string b
        for (char c : b.toCharArray()) {
            if (Character.isLetter(c)) {
                freqB[c - 'a']++;
            }
        }
        
        // Check if frequencies of characters in both strings are equal
        for (int i = 0; i < 26; i++) {
            if (freqA[i] != freqB[i]) {
                return false;
            }
        }
        
        return true;
    }
}
