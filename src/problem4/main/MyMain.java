/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBinarySearchTree obj = new MyBinarySearchTree();
        MyQueue q = new MyQueue();
        TreeNode root;
        root = new TreeNode(10);
        obj.insert(root, 5);
        obj.insert(root, 2);
        obj.insert(root, 16);
        obj.insert(root, 9);
        obj.insert(root, 7);
        obj.insert(root, 14);
        obj.insert(root, 31);
        obj.insert(root, 25);
        obj.insert(root, 40);
        obj.insert(root, 50);
        obj.insert(root, 6);
        q.preorder(root);
        q.queuePrint(q);
        System.out.println("Enter the value");
        q.printSuccessor(sc.nextInt());
    }
}
