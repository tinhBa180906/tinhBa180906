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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode result;
        if(list1.val >= list2.val) {
            result = new ListNode(list2.val);
            list2 = list2.next;
        } else {
            result = new ListNode(list1.val);
            list1 = list1.next;
        }

        ListNode current = result;
        
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                current.next = new ListNode(list2.val);
                list2 = list2.next;
            } else {
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            }

            current = current.next;
        }
        if(list1 != null) current.next = list1;
        if(list2 != null) current.next = list2;

        return result;
    }

    
}