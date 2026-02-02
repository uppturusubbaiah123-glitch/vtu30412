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
        int length = cycleLength(head);

        if(length == 0){
            return null;
        }

        ListNode first = head;
        ListNode second = head;
        while(length > 0){
            first = first.next;
            length--;
        }
        while(first != second){
            first = first.next;
            second = second.next;
        }
        return first;
    }
    int cycleLength(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                int length = 0;
                do{
                    slow = slow.next;
                    length++;
                } while(slow != fast);
                return length;
            }
        }
        return 0;
    }
}