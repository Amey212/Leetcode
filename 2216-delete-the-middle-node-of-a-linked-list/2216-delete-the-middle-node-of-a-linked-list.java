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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;

        // First pass to find the size
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        // Second pass to delete middle node
        int mid = size / 2;
        curr = head;
        for (int i = 0; i < mid - 1; i++) {
            curr = curr.next;
        }

        // Skip the middle node
        curr.next = curr.next.next;

        return head;
    }
}
