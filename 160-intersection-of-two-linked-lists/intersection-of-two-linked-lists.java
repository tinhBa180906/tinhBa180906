/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        while(headA != null) {
            ListNode run = headB;
            while(run != null) {
                if(headA == run) return run;
               // if(headA.next == run.next) return headA.next;
                run = run.next;
            }
            headA = headA.next;
        }
        return null;
    }

   
}