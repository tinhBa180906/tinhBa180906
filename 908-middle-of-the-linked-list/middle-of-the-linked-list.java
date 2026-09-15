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
    public ListNode middleNode(ListNode head) {
        if (head == null) return null;
        int length = 0;
        ListNode run = head;
        while (run != null) {
            length++;
            run = run.next;
        }
        int i = 0;
        ListNode run2 = head;
        while (true) {
            if (i == length / 2) {
                return run2;
            }
            run2 = run2.next;
            i++;
        }
    }
}