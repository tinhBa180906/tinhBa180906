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
    public ListNode insertionSortList(ListNode head) {
         if (head == null || head.next == null) return head;
        ListNode current = head;
        ListNode result = head;
        while (current != null) {
            ListNode minNode = current;
            ListNode temp = minNode.next;
            while(temp != null) {
                if (temp.val < minNode.val) {
                    minNode = temp;
                }
                temp = temp.next;
            }
            if (current != minNode) {
                int t = minNode.val;
                minNode.val = current.val;
                current.val = t;
            }
            current = current.next;
        }
        
        return result;
    }
}