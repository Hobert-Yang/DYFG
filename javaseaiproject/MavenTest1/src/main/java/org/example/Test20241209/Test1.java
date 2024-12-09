package org.example.Test20241209;

// 題目號 101 對稱二叉樹
public class Test1 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static boolean isSymmetric(TreeNode root) {
        // 如果树为空，或者只有一个节点，那么它是对称的
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        // 否则，检查左子树和右子树是否镜像对称
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode left, TreeNode right) {
        // 如果两个节点都为空，那么它们是镜像对称的
        if (left == null && right == null) {
            return true;
        }
        // 如果只有一个节点为空，或者节点值不相等，那么它们不是镜像对称的
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        // 递归检查左子树的左孩子和右子树的右孩子，以及左子树的右孩子和右子树的左孩子
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public static void main(String[] args) {
        // 创建一个对称二叉树进行测试
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        Test1 solution = new Test1();
        boolean result = solution.isSymmetric(root);
        System.out.println("Is the tree symmetric? " + result); // 输出: Is the tree symmetric? true
    }
}
