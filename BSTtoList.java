package BinarySearchTree;

import java.util.ArrayList;

public class BSTtoList {
    public static void bsttolist(BinaryTreeNode<Integer> root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        bsttolist(root.left,list);
        list.add(root.data);
        bsttolist(root.right,list);
    }
}
