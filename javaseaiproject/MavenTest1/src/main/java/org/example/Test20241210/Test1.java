package org.example.Test20241210;

// 定義二叉樹節點的類
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

// 題目號104 二叉樹的最大深度
public class Test1 {

    // 計算二叉樹的最大深度的函數
    public static int maxDepth(TreeNode root) {
        // 如果節點為空，則深度為0
        if (root == null) {
            return 0;
        }

        // 遞歸計算左子樹和右子樹的深度
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // 返回左右子樹深度的最大值加1（當前節點的深度）
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        // 創建一個簡單的二叉樹進行測試
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // 計算並輸出二叉樹的最大深度
        int depth = maxDepth(root);
        System.out.println("二叉樹的最大深度為: " + depth);
    }
}
