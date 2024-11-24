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
    public ListNode reverse(ListNode Head){
        ListNode prev = null;
        //
        ListNode cur = Head;
        while(cur!=null){
            ListNode nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        
        return prev;
    }
    public ListNode middle(ListNode tempHead){
        ListNode slow = tempHead;
        ListNode fast = tempHead;
        //ListNode temp = tempHead;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next; 
        }

        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode first = head;
        if(head.next==null){
            return true;
        }
        ListNode mid = middle(head);
        ListNode rev = reverse(mid);
        
        while(first!=null && rev != null){
            if(first.val != rev.val){
                return false;
            }

            first = first.next;
            rev = rev.next;
        }
        return true; 
    }
}