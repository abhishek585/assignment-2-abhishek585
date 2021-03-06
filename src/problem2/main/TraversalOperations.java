package problem2.main;

import problem1.node.TreeNode;

public class TraversalOperations {
    void printPostorder(TreeNode node) {
        if (node == null)
            return;
        printPostorder(node.getLeft());
        printPostorder(node.getRight());
        System.out.println(node.getData() + " ");
    }

    void printInorder(TreeNode node) {
        if (node == null)
            return;
        printInorder(node.getLeft());
        System.out.println(node.getData() + " ");
        printInorder(node.getRight());
    }

    void printPreorder(TreeNode node) {
        if (node == null)
            return;
        System.out.println(node.getData());
        printPreorder(node.getLeft());
        printPreorder(node.getRight());
    }
}
