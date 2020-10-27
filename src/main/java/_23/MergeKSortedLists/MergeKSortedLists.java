package _23.MergeKSortedLists;

import _21.MergeTwoSortedLists.ListNode;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode beforeHead = new ListNode(0);
        ListNode tail = beforeHead;
        while (areNotNullValuesInList(lists)) {
            ListNode smallestNode = getSmallestNode(lists);
            tail.next = smallestNode;
            tail = smallestNode;
            lists[findIndexOfNode(smallestNode, lists)] = smallestNode.next;
        }
        return beforeHead.next;
    }

    private int findIndexOfNode(ListNode nodeToFind, ListNode[] lists) {
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == nodeToFind) {
                return i;
            }
        }
        return -1;
    }

    private boolean areNotNullValuesInList(ListNode[] lists) {
        for (ListNode node :
                lists) {
            if (node != null) {
                return true;
            }
        }
        return false;
    }

    private ListNode getSmallestNode(ListNode[] lists) {
        ListNode smallestNode = null;
        for (ListNode node :
                lists) {
            if (smallestNode == null) {
                smallestNode = node;
            } else if (node != null) {
                if (node.val < smallestNode.val) {
                    smallestNode = node;
                }
            }
        }
        return smallestNode;
    }
}
