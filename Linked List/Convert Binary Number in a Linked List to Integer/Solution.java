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
    public int getDecimalValue(ListNode head) {
        ListNode p=head;
        int a=0,ans=0;
        while(p!=null){
            a++;
            p=p.next;
        }
        int b=a-1;
        p=head;
        while(p!=null){
            if(p.val==1){
                ans+=Math.pow(2,b);
            }
            b--;
            p=p.next;
        }
        return ans;
    }
}
