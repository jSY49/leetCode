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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tmp = head;
        while(head!=null && tmp.next != null){
            if(tmp.val!= tmp.next.val){
                tmp = tmp.next;
            }else{
                tmp.next = tmp.next.next;
            }
            
        }
        
        return head;
    }
}