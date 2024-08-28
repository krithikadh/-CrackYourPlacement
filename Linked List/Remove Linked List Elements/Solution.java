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
    public ListNode removeElements(ListNode head, int val) {
        ListNode a=new ListNode(0),b=a;
        a.next=head;
        while(b.next!=null){
            if(b.next.val==val){
                b.next=b.next.next;
            }else{
                b=b.next;
            }
        }
        return a.next; 
    }
}
