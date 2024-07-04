public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        
        ListNode slow = head; // Slow pointer moves one step at a time
        ListNode fast = head.next; // Fast pointer moves two steps at a time

        while (fast != null && fast.next != null) {
            if (slow == fast) { // If they meet, there's a cycle
                return true;
            }
            slow = slow.next; // Move slow pointer one step
            fast = fast.next.next; // Move fast pointer two steps
        }
        
        return false; // If fast pointer reaches the end, there's no cycle
    }
}
