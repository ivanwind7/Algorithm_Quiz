package levelOrderTraversal;

import sameTree.TreeNode;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(10);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(9);

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(true){
            TreeNode node = q.remove();
            if(node == null){
                list.add(tempList);
                if(q.isEmpty()){
                    break;
                }else{
                    tempList = new ArrayList<>();
                    q.add(null);
                }
            }else{
                tempList.add(node.val);
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
        }
        System.out.println(list);
    }
}
