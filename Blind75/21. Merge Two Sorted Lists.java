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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode st = new ListNode(0);
        ListNode curr = st;

        while(curr1 != null && curr2 != null){
            if(curr1.val <= curr2.val){
                curr.next = curr1;
                curr1 = curr1.next;
            }else{
                curr.next = curr2;
                curr2 = curr2.next;
            }
            curr = curr.next;
        }

        if(curr1 != null){
            curr.next = curr1;
        }else if(curr2 != null){
            curr.next = curr2;
        }

        return st.next;
    }
}

// The purpose of this code is to deal with the case where two linked lists are not of equal length. 
// In a `while` loop, we traverse the two linked lists until one of them has been traversed. 
// If the lengths of the two lists are different, then at the end of the `while` loop, 
//     there will be some nodes left in the longer list that have not been processed.
// Ex:
// List1:
// 1 -> 2 -> 3 -> 4 -> 5 
// List2:
// 1 -> 2 -> 4 -> 5 -> 5 -> 7 -> 8
// When iterate after `5` in the list 1, then while loop will ends but we still have few number need to merge in `List2`