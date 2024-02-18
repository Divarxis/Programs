import java.util.LinkedList;

public class LinkedListDeletion {
    public static void main(String[] args) {
        // Creating a linked list with 1000 items
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i);
        }

        // Removing an element from the linked list
        int elementToRemove = 500; // Example: Removing element with value 500
        if (linkedList.contains(elementToRemove)) {
            linkedList.remove(Integer.valueOf(elementToRemove)); // Removing by value
            System.out.println("Element " + elementToRemove + " removed successfully.");
        } else {
            System.out.println("Element " + elementToRemove + " not found in the list.");
        }

        System.out.println("Linked List size after deletion: " + linkedList.size());
    }
}
