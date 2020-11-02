package _101.SymmetricTree;

import _98.ValidateBinarySearchTree.TreeNode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode firstNode, TreeNode secondNode) {
        if(firstNode == null && secondNode == null) {
            return true;
        }
        if(firstNode == null || secondNode == null) {
            return false;
        }
        if(firstNode.val == secondNode.val) {
            return isMirror(firstNode.left, secondNode.right) && isMirror(firstNode.right, secondNode.left);
        }
        return false;
    }
}

