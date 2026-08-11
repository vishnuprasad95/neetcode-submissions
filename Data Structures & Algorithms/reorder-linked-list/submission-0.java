class Solution {
    public void reorderList(ListNode head) {

        // 1. Find the middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Split the list
        ListNode second = slow.next;
        slow.next = null;

        // 3. Reverse the second half
        ListNode previous = null;
        ListNode current = second;

        while (current != null) {
            ListNode next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }

        // 4. Merge alternately
        ListNode first = head;
        second = previous;

        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}