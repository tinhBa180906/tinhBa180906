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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // long num1 = 0;
        // int i = 0;
        // while (l1 != null) {
        //     num1 = num1 + l1.val * (long)Math.pow(10, i);
        //     l1 = l1.next;
        //     i++;
        // }
        
        // long num2 = 0;
        // int j = 0;
        // while (l2 != null) {
        //     num2 = num2 + l2.val * (long)Math.pow(10, j);
        //     l2 = l2.next;
        //     j++;
        // }
        
        // long sum = num1 + num2;
        // ListNode result = new ListNode((int)(sum % 10), null);
        // sum /= 10;
        //  System.out.println(num1);
        //  System.out.println(num2);
        //  System.out.println(sum);
        // ListNode result1 = result;
        // while (sum > 0) {
        //     int mod = (int) (sum % 10);
        //     result.next = new ListNode(mod, null);
        //     sum /= 10;
        //     result = result.next;
        // }
        
        
        // return result1;
        ListNode dummy = new ListNode(-1, null);
        ListNode result = dummy;
        int rem = 0;
        while (l1 != null && l2 != null) {
            int temp = l1.val + l2.val + rem;

            dummy.next = new ListNode(temp % 10, null);
            if (temp >= 10) {
                rem = 1;
            } else {
                rem = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
            dummy = dummy.next;
        }
        
        while (l1 != null) {
            int temp = l1.val + rem;

            dummy.next = new ListNode(temp % 10, null);
            if (temp >= 10) {
                rem = 1;
            } else {
                rem = 0;
            }
            l1 = l1.next;
            dummy = dummy.next;
        }
        
        while (l2 != null) {
            int temp = l2.val + rem;

            dummy.next = new ListNode(temp % 10, null);
            if (temp >= 10) {
                rem = 1;
            } else {
                rem = 0;
            }
            l2 = l2.next;
            dummy = dummy.next;
        }
        
        if (rem == 1) {
            dummy.next = new ListNode(1, null);
        }
        return result.next;
    }
}