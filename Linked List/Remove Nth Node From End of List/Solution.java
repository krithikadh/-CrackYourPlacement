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
        ListNode a=new ListNode(0,head),p=a;
        for(int i=0;i<n;i++){
            head=head.next;
        }
        while(head!=null){
            head=head.next;
            p=p.next;
        }
        p.next=p.next.next;
        return a.next;       
    }
}
