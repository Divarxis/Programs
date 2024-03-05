class HashTable {
    private int[] table;
    private int capacity;
    private int size;

    public HashTable(int capacity) {
        this.capacity = capacity;
        this.table = new int[capacity];
        this.size = 0;
    }

    // Hash function to calculate index
    private int hash(int key) {
        return key % capacity;
    }

    // Insert method to insert a key into the hash table
    public void insert(int key) {
        if (size == capacity) {
            System.out.println("Hash table is full, cannot insert more elements.");
            return;
        }

        int index = hash(key);

        // Linear probing to handle collisions
        while (table[index] != 0) {
            index = (index + 1) % capacity;
        }

        table[index] = key;
        size++;
    }

    // Search method to search for a key in the hash table
    public boolean search(int key) {
        int index = hash(key);

        while (table[index] != 0) {
            if (table[index] == key) {
                return true;
            }
            index = (index + 1) % capacity;
        }

        return false;
    }

    // Display method to print the contents of the hash table
    public void display() {
        System.out.println("Hash Table:");
        for (int i = 0; i < capacity; i++) {
            System.out.println("Index " + i + ": " + table[i]);
        }
    }
}
//Main class
public class LinearProbing {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        // Inserting elements into the hash table
        hashTable.insert(5);
        hashTable.insert(15);
        hashTable.insert(25);
        hashTable.insert(35);
        hashTable.insert(45);

        // Displaying the hash table
        hashTable.display();

        // Searching for keys in the hash table
        System.out.println("Search for key 25: " + hashTable.search(25));
        System.out.println("Search for key 10: " + hashTable.search(10));
    }
}
