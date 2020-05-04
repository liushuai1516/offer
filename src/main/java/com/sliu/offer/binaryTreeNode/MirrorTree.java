package com.sliu.offer.binaryTreeNode;

import java.util.Stack;

public class MirrorTree {

    public static void Mirror(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if (root.left != null) {
            Mirror(root.left);
        }
        if (root.right != null) {
            Mirror(root.right);
        }
    }

    // 非递归
    public static void Mirror2(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (stack.size() > 0) {
            TreeNode tree = stack.pop();
            if (tree.left != null || tree.right != null) {
                TreeNode temp = tree.left;
                tree.left = tree.right;
                tree.right = temp;
            }
            if (tree.left != null) {
                stack.push(tree.left);
            }
            if (tree.right != null) {
                stack.push(tree.right);
            }
        }
    }

}
