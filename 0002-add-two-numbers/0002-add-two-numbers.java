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
        
        ListNode tmpA = l1;
        ListNode tmpB = l2;
        int carry =0;
        int sum = 0;
        
        ListNode res = null;
        ListNode current = null;
        
        while(tmpA!=null||tmpB!=null||carry!=0){
            sum = carry;
            sum += tmpA !=null ?  tmpA.val : 0;
            sum += tmpB !=null ?  tmpB.val : 0;
            
            carry = sum / 10;
            
            if(res == null){
                res = new ListNode(sum%10);
                current = res;
            }else{
                current.next = new ListNode(sum%10);
                current = current.next;
            }
            
            tmpA= tmpA != null? tmpA.next:null;
            tmpB= tmpB != null? tmpB.next:null;
            
 
        }
        
        return res;
    }
}