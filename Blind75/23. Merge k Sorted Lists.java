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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = new ListNode(0);

        for(ListNode node : lists){
            ListNode temp = list;
            while(temp != null){
                //instert the thing but need rebuild(ans).
                temp = temp.next;

            }
        }
        return ans
    }
    private void insert(){
        //two possibl way
    }
}
//so when you insert the number wheather you inster that and do the compare part in `insert` method or in the `for` loop
//both works but just remember that it wont help to save time and space so just try one of them 