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
         if (head == null || head.next == null ) return false;
        ListNode slow = head;
        ListNode fash = head;
        while (fash != null && slow != null) {
            if (fash.next == null ||fash.next.next == null || slow.next == null) return false;
            else if (fash.next.next == slow.next) {
                return true;
            }
            fash = fash.next.next;
            slow = slow.next;
            
        }
        
        return false;
    }
}