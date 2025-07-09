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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        return prev;
    }

    public ListNode fmid(ListNode head){
        ListNode Hare = head;
        ListNode Turtle = head;

        while(Hare.next !=null && Hare.next.next !=null){
            Turtle = Turtle.next;
            Hare = Hare.next.next;
        }
        return Turtle;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next ==null){
            return true;
        }

        ListNode middle = fmid(head);
        ListNode sechalf = reverse(middle.next);

        ListNode Fhalf = head;
        while(sechalf != null ){
            while(Fhalf.val != sechalf.val){
                return false;
            }
            Fhalf = Fhalf.next;
            sechalf = sechalf.next;
        }
        return true;
    }
}