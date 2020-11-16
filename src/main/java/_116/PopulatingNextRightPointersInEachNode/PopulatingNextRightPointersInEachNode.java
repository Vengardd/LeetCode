package _116.PopulatingNextRightPointersInEachNode;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        if(root.left != root.right) root.left.next = root.right;
        if(root.right != null && root.next != null) root.right.next = root.next.left;
        connect(root.left);
        connect(root.right);
        return root;
    }
}
