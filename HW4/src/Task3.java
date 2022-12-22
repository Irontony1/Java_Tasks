import java.util.ArrayDeque;

public class Task3 {
    public static class TreeNode {
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


    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        if (root.left == null || root.right == null) return false;

        ArrayDeque<TreeNode> stack = new ArrayDeque<TreeNode>();
        stack.add(root.left);
        stack.add(root.right);

        while (!stack.isEmpty()) {
            TreeNode step1 = stack.pop();
            TreeNode step2 = stack.pop();

            if (step1.val != step2.val || step1.left == null ^ step2.right == null || step1.right == null ^ step2.left == null)
                return false;

            if (step1.left != null) {
                stack.add(step1.left);
                stack.add(step2.right);
            }
            if (step1.right != null) {
                stack.add(step1.right);
                stack.add(step2.left);
            }
        }
        return true;
    }

}

