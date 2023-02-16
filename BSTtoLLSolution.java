package BinarySearchTree;

import java.util.Stack;

public class BSTtoLLSolution {
    private static void helpConstructor(BinaryTreeNode<Integer> root,
                                                           Stack<LinkedListNode<Integer>> stack){
        if(root == null){
            return;
        }
        helpConstructor(root.right,stack);
        LinkedListNode<Integer> node = new LinkedListNode<>(root.data);
        stack.push(node);
        helpConstructor(root.left, stack);
    }
    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        Stack<LinkedListNode<Integer>> stack = new Stack<>();
        helpConstructor(root, stack);
        LinkedListNode<Integer> head = null, tail = null;
        while(!stack.isEmpty()){
            LinkedListNode<Integer> temp = stack.pop();
            if(head == null) {
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
        }
        return head;
    }
}
