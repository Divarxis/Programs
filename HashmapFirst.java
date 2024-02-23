import java.util.HashMap;
import java.util.Map;

public class HashmapFirst {
    // Custom hash function for demonstration purposes
    private static int customHashFunction(String key) {
        // Simple hash function that sums the ASCII values of characters in the key
        int hash = 0;
        for (char c : key.toCharArray()) {
            hash += c;
        }
        return hash;
    }

    public static void main(String[] args) {
        // Create a HashMap with key of type String and value of type Integer
        Map<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("apple", 10);
        hashMap.put("banana", 20);
        hashMap.put("orange", 30);

        // Accessing elements in the HashMap
        int numberOfApples = hashMap.get("apple");
        System.out.println("Number of apples: " + numberOfApples);

        // Iterating over the HashMap
        System.out.println("Iterating over the HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " : " + value);
        }

        // Removing a key-value pair from the HashMap
        hashMap.remove("banana");

        // Checking if a key exists in the HashMap
        boolean containsKey = hashMap.containsKey("banana");
        System.out.println("Contains key 'banana': " + containsKey);

        // Using the custom hash function
        String keyToHash = "apple";
        int hashedKey = customHashFunction(keyToHash);
        System.out.println("Hash value for key '" + keyToHash + "': " + hashedKey);
    }
}
