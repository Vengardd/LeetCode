package _109.ConvertSortedListToBinarySearchTree;

import _21.MergeTwoSortedLists.ListNode;
import _98.ValidateBinarySearchTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> valuesAsList = listToArray(head);
        return middleNode(valuesAsList, 0, valuesAsList.size() - 1);
    }

    private List<Integer> listToArray(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list;
    }


    private TreeNode middleNode(List<Integer> valuesAsList, int i, int j) {
        if(i < 0 || j > valuesAsList.size() -1) {
            return null;
        }
        int middleIndex = (i + j) / 2;
        TreeNode middle = new TreeNode(valuesAsList.get(middleIndex));
        middle.left = middleNode(valuesAsList, i, middleIndex - 1);
        middle.left = middleNode(valuesAsList, middleIndex + 1, j);
        return middle;
    }
}
