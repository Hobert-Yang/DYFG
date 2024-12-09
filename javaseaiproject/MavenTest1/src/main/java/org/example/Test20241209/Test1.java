package org.example.Test20241209;

import java.util.ArrayList;

public class Test1 {

    TreeNode root;

    // Method to get the root node
    TreeNode getRoot() {
        return root;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public boolean isGoodTree(Test1.TreeNode root) {
        // 如果树为空，则认为它對稱
        if (root == null) {
            return true;
        }

        boolean flag = true;

        if (root.left != null | root.right != null) {
            isGoodTree(root.left)
        }

        return isGoodTree(p.left, q.left) && isSameTree(p.right, q.right);

    }


    public static void main(String[] args) {
        Test1.TreeNode root = new Test1.TreeNode(1);
//        root.left = new Test1.TreeNode(2);
//        root.right = new Test1.TreeNode(2);
//        root.left.right = new Test1.TreeNode(3);
//        root.right.right = new Test1.TreeNode(3);

        root.left = new Test1.TreeNode(2);
        root.right = new Test1.TreeNode(2);
        root.left.left = new Test1.TreeNode(3);
        root.left.right = new Test1.TreeNode(4);
        root.right.left = new Test1.TreeNode(4);
        root.right.right = new Test1.TreeNode(3);

        boolean flag = isGoodTree(root);
        System.out.println(flag);
    }
}
