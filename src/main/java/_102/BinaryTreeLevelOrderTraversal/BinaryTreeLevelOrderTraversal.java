package _102.BinaryTreeLevelOrderTraversal;

import _98.ValidateBinarySearchTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> singleLevel = new LinkedList<>();
            int countOfAllActualNodesAtLevel = queue.size();
            for (int i = 0; i < countOfAllActualNodesAtLevel; i++) {
                TreeNode actualNode = queue.poll();
                if (actualNode.left != null) {
                    queue.add(actualNode.left);
                }
                if (actualNode.right != null) {
                    queue.add(actualNode.right);
                }
                singleLevel.add(actualNode.val);
            }
            result.add(singleLevel);
        }
        return result;
    }
}
