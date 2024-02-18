// Define the ListNode class representing a single node in the linked list
class ListNode {
    int val;
    ListNode next;

    // Constructor to initialize a node with a given value
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

// Define the LinkedList class representing the linked list structure and operations
class LinkedList {
    ListNode head; // Reference to the head of the linked list

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = null;
    }

    // Method to add a node with a given value at the end of the linked list
    public void addNode(int val) {
        ListNode newNode = new ListNode(val); // Create a new node
        if (head == null) { // If the linked list is empty
            head = newNode; // Set the new node as the head
            return;
        }
        ListNode current = head;
        while (current.next != null) { // Traverse to the end of the linked list
            current = current.next;
        }
        current.next = newNode; // Add the new node to the end
    }

    // Method to insert a node with a given value after a target value in the linked list
    public void insertAfter(int target, int val) {
        ListNode current = head;
        while (current != null) { // Traverse the linked list
            if (current.val == target) { // If the target value is found
                ListNode newNode = new ListNode(val); // Create a new node
                newNode.next = current.next; // Set the next of the new node
                current.next = newNode; // Update the next of the current node to point to the new node
                return;
            }
            current = current.next; // Move to the next node
        }
        System.out.println("Target value not found in the list."); // If the target value is not found
    }

    // Method to print the elements of the linked list
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Main class to test the LinkedList operations
public class LinkedListInsertBetween {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Create a new linked list

        // Add elements to the linked list
        list.addNode(12);
        list.addNode(34);
        list.addNode(78);
        list.addNode(67);
        list.addNode(98);

        System.out.println("Original List:");
        list.printList(); // Print the original list

        int targetValue = 34; // Value after which to insert
        int newValue = 54; // Value to insert

        list.insertAfter(targetValue, newValue); // Insert the new value after the target value

        System.out.println("\nList after inserting " + newValue + " after " + targetValue + ":");
        list.printList(); // Print the updated list
    }
}
