package _21.MergeTwoSortedLists;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(0);
        ListNode tail = preHead;

        while(l1 != null && l2 != null) {
            if(l1.val > l2.val) {
                tail.next = l2;
                l2 = l2.next;
            } else {
                tail.next = l1;
                l1 = l1.next;
            }
            tail = tail.next;
        }

        if(l1 == null) {
            tail.next = l2;
        } else {
            tail.next = l1;
        }

        return preHead.next;
    }
}
