package Level_2;
import java.util.*;
import java.lang.*;


public class Task2 {
    public static void main(String args[])
    {
        TreeNode root= new TreeNode(3);
        root.left= new TreeNode(9);
        root.right= new TreeNode(20);
        root.right.left= new TreeNode(15);
        root.right.right= new TreeNode(7);

        System.out.println(maxDepth(root));

    }

    public static class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right)
        {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
        public static int maxDepth(TreeNode root)
        {
            if(root==null) return 0;

            return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        }

}
