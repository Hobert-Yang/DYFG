package org.example.Test20241208;

import java.util.ArrayList;
import java.util.List;

// 題目號94 二叉樹的中序遍歷
public class Test2ErChaShu {

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

    // 递归实现中序遍历
    public static ArrayList inorderTraversal(TreeNode root,ArrayList<Integer> list) {
        if (root == null) {
            ArrayList<Integer> nullList = new ArrayList<>();
            return nullList;
        }

        // 遍历左子树
        inorderTraversal(root.left,list);

        // 访问根节点
//        System.out.print(root.val + " ");
        list.add(root.val);

        // 遍历右子树
        inorderTraversal(root.right,list);

        return list;
    }

    public static void main(String[] args) {

        // 主方法用于测试
            // 创建一个简单的二叉树
            //        1
            //       / \
            //      2   3
            //     / \
            //    4   5
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);

        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> newlist = new ArrayList<>();

        Test2ErChaShu traversal = new Test2ErChaShu();
            // 输出中序遍历结果
         newlist = traversal.inorderTraversal(root,list); // 输出: 4 2 5 1 3

        for (int i = 0; i < list.size(); i++) {
            System.out.println(newlist.get(i));
        }
    }

}
