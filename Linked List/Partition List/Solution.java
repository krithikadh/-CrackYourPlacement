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
    public ListNode partition(ListNode head, int x) {
        ListNode a = new ListNode(0), b = new ListNode(0);
        ListNode c = a;
        ListNode d = b;
        while(head != null) {
            if(head.val < x) {
                c.next = head;
                c = c.next;
            } else {
                d.next = head; 
                d = d.next;
            }
            head = head.next;
        }
        d.next = null;
        c.next = b.next;
        return a.next;
    }
}
