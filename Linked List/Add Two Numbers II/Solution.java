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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        while(l1 !=null){
            st1.add(l1.val);
            l1=l1.next;
        }
        while(l2 !=null){
            st2.add(l2.val);
            l2=l2.next;
        }
        int carry=0;
        ListNode result=null;
        while(!st1.isEmpty()|| !st2.isEmpty()){
            int a=0;
            int b=0;
            if(!st1.isEmpty()){
                a=st1.pop();
            }
             if(!st2.isEmpty()){
                b=st2.pop();
            }
            int total=a+b+carry;
            ListNode temp=new ListNode(total%10);
            carry=total/10;
            if(result==null){
                result=temp;
            }
            else{
                temp.next=result;
                result=temp;
            }
        }
        if(carry!=0){
            ListNode temp=new ListNode(carry);
            temp.next=result;
            result=temp;
        }
        return result;
    }
}
