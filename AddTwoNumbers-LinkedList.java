/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0;    
    ListNode result = new ListNode(0);
    ListNode l3 = result;
        
    while (l1 != null || l2 != null) {
        int sum = carry;
        if (l1 != null) {
            sum += l1.val;
        }
        
         if (l2 != null) {
            sum += l2.val;
        }

        
        if (sum >= 10) {
            carry = 1;
            sum = sum % 10;
        } else {
            carry = 0;
        }
        
        l3.val = sum;
        
        l1 = (l1 == null) ? null : l1.next;
        l2 = (l2 == null) ? null : l2.next;
        if (l1 == null && l2 == null && carry == 0) {
            l3.next = null;
        } else {
            l3.next = new ListNode(0);
        }
        l3 = l3.next;
    }
    
    if (carry == 1) {
        l3.val = 1;
    }
    
    
    return result;
    }
}