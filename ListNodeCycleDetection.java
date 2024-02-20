public class ListNodeCycleDetection {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false; // Reached end of list, no cycle
            }
            slow = slow.next; // Move slow pointer by one step
            fast = fast.next.next; // Move fast pointer by two steps
        }
        return true; // Fast pointer caught up with slow pointer, cycle detected
    }

    public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        // Create a cycle (last node points back to second node)
        head.next.next.next.next = head.next;

        boolean hasCycle = hasCycle(head);
        System.out.println("Linked list has cycle: " + hasCycle);
    }
}
