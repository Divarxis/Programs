import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args) {
        // Creating a linked list with initial elements
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);

        // Reversing the linked list
        reverseLinkedList(linkedList);

        System.out.println("Reversed Linked List: " + linkedList);
    }

    public static void reverseLinkedList(LinkedList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            // Swap elements at index i and (size - i - 1)
            Integer temp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - i - 1, temp);
        }
    }
}
