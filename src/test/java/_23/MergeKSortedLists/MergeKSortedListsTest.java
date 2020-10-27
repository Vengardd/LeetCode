package _23.MergeKSortedLists;

import _21.MergeTwoSortedLists.ListNode;
import org.junit.jupiter.api.Test;

class MergeKSortedListsTest {

    private final MergeKSortedLists testee = new MergeKSortedLists();

    @Test
    public void test() {
        ListNode firstNode = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode secondNode = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode thirdNode = new ListNode(2, new ListNode(6));

        ListNode[] nodes = new ListNode[]{firstNode, secondNode, thirdNode};

        ListNode result = testee.mergeKLists(nodes);

    }

}