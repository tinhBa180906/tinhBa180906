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
         ListNode slow = head;
        ListNode fash = head;
        while (fash != null && fash.next != null) {
            fash = fash.next.next;
            slow = slow.next;
        }
        
        ListNode halfReverse = reverseList(slow);
        
        ListNode p = head;
        while(halfReverse != null) {
            if (halfReverse.val != p.val) return false;
            p = p.next;
            halfReverse = halfReverse.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next; // Bước 1
            curr.next = prev; // Bước 2
            prev = curr;      // Bước 3
            curr = next;      // Bước 4
        }
        return prev;
    }

}