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
    public int pairSum(ListNode head) {
        if(head.next.next == null){
            return head.val + head.next.val;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr != slow){
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        int ans = 0;
        while(prev != null){
            ans = Math.max(ans, prev.val+curr.val);
            curr = curr.next;
            prev = prev.next;
        }

        return ans;
    }
}
