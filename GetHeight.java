package BinarySearchTree;

public class GetHeight {
    public static int max(int n1, int n2){
        return Math.max(n1, n2);
    }
    public static int getheight(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root == null){
            return 0;
        }
        return 1 + max(getheight(root.left),getheight(root.right));
    }
}
