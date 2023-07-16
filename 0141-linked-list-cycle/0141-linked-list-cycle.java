/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head==null) return false;
        
        ListNode scnd = head;
        ListNode frst = head;
        
        while(frst.next!=null && frst.next.next!=null){
            frst = frst.next.next;
            scnd = scnd.next;
            
            if(frst == scnd)    return true;
        }
        
        return false;
    }
}