/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reorderList(ListNode head) {
        if (head == null || head.next == null) return head;

        // Convert the original ListNode to a LinkedList
        LinkedList<ListNode> list = new LinkedList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node);
            node = node.next;
        }

        // Create a new ListNode to store the result
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // Reorder the list
        while (!list.isEmpty()) {
            // Add a node from the beginning
            tail.next = list.removeFirst();
            tail = tail.next;

            if (!list.isEmpty()) {
                // Add a node from the end
                tail.next = list.removeLast();
                tail = tail.next;
            }
        }

        // Make sure the last node points to null
        tail.next = null;

        return dummy.next;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution2 {
    public void reorderList(ListNode head) {

        // 1. Split the list into 2 halves
        // 2. Reverse the 2nd half
        // 3. Sew up the 2 halves in alternating fashion 
        // e.g. 1st node in 1st half points to 1st node in reversed 2nd half
        // e.g. 1st node in reversed 2nd half points to 2nd node in 1st half
        // e.g. 2nd node in 1st half points to 2nd node in reversed 2nd half
        // e.g. 2nd node in revesred 2nd half points to 3rd node in 1st half etc. 
 
        // 1. Find the middle node of the input llist
        ListNode slow = head; 
        ListNode fast = head.next; 
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Now slow is pointing at the end of first half of list
        // slow.next is the start of the second half
        ListNode second = slow.next;
        slow.next = null; // The last node of 1st half of list should point to null in the final product

        

        // 2. Now we need to reverse the 2nd half of list
        ListNode prev = null;
        // while (second != null) {
        //     ListNode tempNext = second.next; 
        //     second.next = prev;
        //     prev = second; 
        //     second = tempNext;
        // }
        ListNode curr = second;
        
        while (curr != null) {
            ListNode next = curr.next; 
            curr.next = prev; 
            prev = curr;
            curr = next;
        }

        

        // 3. Now we need to merge 1st half of list with the reversed 2nd half of list
        // prev is now pointing to the head of the reversed 2nd half of list
        second = prev;
        ListNode first = head; 

        while (second != null) {
            ListNode firstNext = first.next; 
            ListNode secondNext = second.next; 
            first.next = second; 
  