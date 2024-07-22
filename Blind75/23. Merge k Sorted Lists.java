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

//so when you insert the number wheather you inster that and do the compare part in `insert` method or in the `for` loop
//both works but just remember that it wont help to save time and space so just try one of them 

//update the algor gonna be like:
// [1,2,3] [2,3,4] [6,7,7]
// 1,2,3
// then read [2,3,4] [6,7,7] and insert one by one




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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);

        for (ListNode list : lists) {
            while (list != null) {
                dummy.next = insert(dummy.next, new ListNode(list.val));
                list = list.next;
            }
        }
        return dummy.next;
    }

    public ListNode insert(ListNode head, ListNode newNode) {
        if (head == null || newNode.val <= head.val) {
            newNode.next = head;
            return newNode;
        }

        ListNode current = head;
        while (current.next != null && current.next.val < newNode.val) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        return head;
    }
}
