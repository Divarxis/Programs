import java.util.LinkedList;

public class LinkedListInsert {
    public static void main(String[] args) {
        // Creating an empty linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Inserting elements into the linked list
        linkedList.add(10); // Adds at the end
        linkedList.addFirst(5); // Adds at the beginning
        linkedList.addLast(15); // Adds at the end
        linkedList.add(1, 7); // Adds at index 1

        System.out.println("Linked List after insertion: " + linkedList);
    }
}
