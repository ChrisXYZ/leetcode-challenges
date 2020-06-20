package binaryTree._104_Maximum_Depth_of_Binary_Tree;

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
