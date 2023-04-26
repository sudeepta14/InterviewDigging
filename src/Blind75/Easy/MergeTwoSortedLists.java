package Blind75.Easy;

import Blind75.Easy.Classes.ListNode;

public class MergeTwoSortedLists {
    public static void main(String[] args){

        ListNode l1 = new ListNode(6);
        l1.next = new ListNode(8);
        ListNode l2 = new ListNode(7);
        l2.next = new ListNode(10);

        ListNode result = mergeTwoLists(l1, l2);
        while(result != null){
            System.out.print(result.val);
            System.out.print(" ");
            result = result.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(l1 != null && l2 != null){
            if(l1.val <l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = l1 == null ? l2: l1;
        return dummy.next;
    }
}

