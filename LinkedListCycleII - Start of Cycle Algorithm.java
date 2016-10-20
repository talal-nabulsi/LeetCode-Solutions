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
    public ListNode detectCycle(ListNode head) {
        
        if (head == null) {
            return head;
        }
        
        Set<ListNode> seen = new HashSet<ListNode>();
        ListNode curr= head;
      
        while (curr.next != null) {
            
            seen.add(curr);
            curr = curr.next;
            
            if (seen.contains(curr)) {
                return curr;
            }
        }

        
        return null;
        
        
   