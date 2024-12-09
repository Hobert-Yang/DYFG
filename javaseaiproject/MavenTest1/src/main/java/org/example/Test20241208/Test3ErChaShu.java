<<<<<<< HEAD
package org.example.Test20241208;

// 題目號100 相同的樹
public class Test3ErChaShu {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 如果两棵树都为空，则认为它们相同
        if (p == null && q == null) {
            return true;
        }
        // 如果一棵树为空而另一棵不为空，或者节点的值不相等，则认为它们不相同
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        // 递归地检查左子树和右子树是否都相同
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    // 树的节点定义
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        // 创建两棵相同的树进行测试
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(3);
        tree1.right = new TreeNode(2);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);

        Test3ErChaShu solution = new Test3ErChaShu();
        boolean result = solution.isSameTree(tree1, tree2);
        System.out.println("The trees are the same: " + result); // 输出: The trees are the same: true
    }






}
=======
package org.example.Test20241208;

// 題目號100 相同的樹
public class Test3ErChaShu {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 如果两棵树都为空，则认为它们相同
        if (p == null && q == null) {
            return true;
        }
        // 如果一棵树为空而另一棵不为空，或者节点的值不相等，则认为它们不相同
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        // 递归地检查左子树和右子树是否都相同
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    // 树的节点定义
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        // 创建两棵相同的树进行测试
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(3);
        tree1.right = new TreeNode(2);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);

        Test3ErChaShu solution = new Test3ErChaShu();
        boolean result = solution.isSameTree(tree1, tree2);
        System.out.println("The trees are the same: " + result); // 输出: The trees are the same: true
    }






}
>>>>>>> 0dc6ebe (“Java”)
