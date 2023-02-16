package BinarySearchTree;

import java.util.ArrayList;

public class FindPathInBSTSolution {
    private static void getPathHelper(BinaryTreeNode<Integer> root, int data, ArrayList<Integer> list){
        if(root == null){
            list.clear();
            return;
        }
        list.add(0,root.data);
        if(root.data == data){
            return;
        }
        if(data < root.data){
            getPathHelper(root.left, data, list);
        }
        if(data > root.data){
            getPathHelper(root.right, data, list);
        }
    }
    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
        ArrayList<Integer> arrayList = new ArrayList<>();
        getPathHelper(root, data, arrayList);
        return arrayList;
    }
}
