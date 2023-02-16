package BinarySearchTree;

import java.util.ArrayList;

public class PairSumSolution {
    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
        // Write your code here
//        if(root == null){
//            return;
//        }
////        if(root.data >= s && root.left == null){
////            return;
////        }
//        if(root.left == null  && root.right == null){
//            return;
//        }
//        if(root.left != null){
//            if(root.left.data + root.data == s){
//                System.out.println(root.left.data+" "+ root.data);
//            }
//        }
//        if(root.right != null){
//            if(root.right.data + root.data == s){
//                System.out.println(root.data +" "+root.right.data);
//            }
//        }
//        printNodesSumToS(root.left,s);
//        printNodesSumToS(root.right,s);
        ArrayList<Integer> list = new ArrayList<>();
        BSTtoList.bsttolist(root, list);
        int front = 0, end = list.size()-1;
        while (end > front){
            if (list.get(front) + list.get(end) == s){
                System.out.println(list.get(front) +" "+ list.get(end));
                front++;
                end--;
            }
            else if(list.get(front) + list.get(end) > s){
                end--;
            }
            else{
                front++;
            }
        }
    }
}
