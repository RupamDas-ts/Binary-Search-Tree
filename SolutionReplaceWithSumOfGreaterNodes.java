package BinarySearchTree;

import java.util.Stack;

public class SolutionReplaceWithSumOfGreaterNodes {
    public static void helper(BinaryTreeNode<Integer> root, Stack<Integer> stack){
        if(root == null){
            return;
        }
        helper(root.right, stack);
        int max = stack.pop()+root.data;
        root.data = max;
        stack.push(max);
        helper(root.left, stack);
    }
    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        // Write your code here
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        helper(root, stack);
    }
}
