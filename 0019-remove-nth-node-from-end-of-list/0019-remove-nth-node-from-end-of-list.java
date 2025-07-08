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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        int size = 0;
        ListNode curr = head;
        while(curr!=null){
            size++;
            curr = curr.next;
        }

        if(size==n){
            return head.next;
        }
        int index = size-n;
        int i = 1;
        ListNode prev = head;
        while(i<index){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}