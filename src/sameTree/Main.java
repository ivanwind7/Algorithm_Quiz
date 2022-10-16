package sameTree;

import com.sun.source.tree.Tree;

public class Main {
    public static void main(String[] args) {
        // tree1
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        // tree2
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        boolean isSame = sameTree(root1, root2);
        System.out.println(isSame);
    }

    public static boolean sameTree(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null){
            return true;
        }
        if(node1 == null || node2 == null){
            return false;
        }
        return (node1.val == node2.val) && sameTree(node1.left, node2.left) && sameTree(node1.right, node2.right);
    }
}
