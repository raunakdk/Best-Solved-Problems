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
        public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
		// find the middle node
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next; 
        }
        if(fast!=null){
			slow=slow.next;
		}
		// reverse the half of list
        ListNode prev=null;
        while(slow!=null){
            ListNode temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
		// compare the first half and the second half.
        slow=prev;
        fast=head;
        while(slow!=null){
            if(slow.val!=fast.val){
				return false;
			}
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
	
}