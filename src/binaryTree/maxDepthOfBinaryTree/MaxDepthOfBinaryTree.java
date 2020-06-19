package binaryTree.maxDepthOfBinaryTree;

/**
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * Note: A leaf is a node with no children.
 * <p>
 * Example:
 * Given binary tree [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /    \
 * 15      7
 * <
 * return its depth = 3.
 */
public class MaxDepthOfBinaryTree {
    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int leftSide = 1 + maxDepth(root.left);
            int rightSide = 1 + maxDepth(root.right);

            if (rightSide > leftSide) {
                return rightSide;
            }
            return leftSide;
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
