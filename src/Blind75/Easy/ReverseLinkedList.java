package Blind75.Easy;

import Blind75.Easy.Classes.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args){
        ListNode l1 = new ListNode(5);
        l1.next = new ListNode(10);
        l1.next.next = new ListNode(15);
        l1.next.next.next = new ListNode(20);

        ListNode reverse = reverse(l1);
        while(reverse != null){
            System.out.print(reverse.val);
            System.out.println(" ");
            reverse = reverse.next;
        }
    }

    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next  = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
