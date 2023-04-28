package Blind75.Medium;

import Blind75.Easy.Classes.ListNode;

public class ReorderList {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode slow = head, fast = head, prev = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        ListNode tail = reverse(slow);
        head = merge(head, tail);
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(l1 != null && l2 != null){
            curr.next = l1;
            l1 = l1.next;
            curr = curr.next;
            curr.next = l2;
            l2 = l2.next;
            curr = curr.next;
        }
        curr.next = l1 ==null ? l2: l1;
        return dummy.next;
    }
}
/*
Time complexity : O(N)
Space complexity : O(1)
 */
