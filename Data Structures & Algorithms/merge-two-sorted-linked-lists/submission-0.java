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
         ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        // iterate through both linked 2ists
        while (list1 != null && list2 != null) {
          
            // add the smaller node to the merged list
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        // if any list is left, append it to 
        // the merged list
        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        // return the merged list starting from 
        // the next of dummy node
        return dummy.next;
    }
}