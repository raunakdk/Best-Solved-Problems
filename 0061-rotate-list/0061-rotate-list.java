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
    public ListNode rotateRight(ListNode head, int k) {
        if(head== null)
        return head;

        ListNode Cph=head;
        int len =1;
        while(Cph.next!=null){
            Cph =Cph.next;
            len++;
        }
        Cph.next = head;

        for(int i = len-k%len;i>1;i--)
        head = head.next;
        Cph = head.next;
        head.next =null;
        return Cph;
        
    }
}