import java.util.*;

class Solution {

    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int v) {
            value = v;
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        if (root.left == null) return minDepth(root.right) + 1;
        if (root.right == null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the tree values separated by spaces (use 'null' for missing nodes):");
        String userInput = scanner.nextLine();
        scanner.close();
        
        String[] values = userInput.split(" ");
        TreeNode root = values[0].equals("null") ? null : new TreeNode(Integer.parseInt(values[0]));

        if (root != null) { // Ensure root is not null before adding to the queue
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            for (int i = 1; i < values.length; i = i + 2) {
                TreeNode current = q.poll(); // safer to use poll which returns null if the queue is empty
                
                if (!values[i].equals("null")) {
                    current.left = new TreeNode(Integer.parseInt(values[i]));
                    q.add(current.left);
                }
                if (i + 1 < values.length && !values[i + 1].equals("null")) {
                    current.right = new TreeNode(Integer.parseInt(values[i + 1]));
                    q.add(current.right);
                }
            }
        }

        System.out.println("root: " + (root != null ? root.value : "null"));
        if (root != null && root.left != null) {
            System.out.println("root.left: " + root.left.value);
        }

        Solution s = new Solution();
        System.out.println(s.minDepth(root));
        
    }
}
