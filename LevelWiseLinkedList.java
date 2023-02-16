package BinarySearchTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class LevelWiseLinkedList {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static BinaryTreeNode<Integer> takeInput() throws IOException {
        st = new StringTokenizer(br.readLine());
        int rootData = Integer.parseInt(st.nextToken());
        if (rootData == -1) {
            return null;
        }
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        pendingNodes.enqueue(root);

        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
            } catch (QueueEmptyException e) {
                return null;
            }
            int leftChildData = Integer.parseInt(st.nextToken());
            if (leftChildData != -1) {
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
                currentNode.left = leftChild;
                pendingNodes.enqueue(leftChild);
            }
            int rightChildData = Integer.parseInt(st.nextToken());
            if (rightChildData != -1) {
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
                currentNode.right = rightChild;
                pendingNodes.enqueue(rightChild);
            }
        }
        return root;
    }

    private static void print(LinkedListNode<Integer> temp)
    {
        while(temp != null){
            System.out.print(temp.data + " ") ;
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BinaryTreeNode<Integer> root = takeInput();
        ArrayList<LinkedListNode<Integer>> output = LevelWiseLinkedListSolution.constructLinkedListForEachLevel(root);
        if(output!=null)
        {
            for(LinkedListNode<Integer> head : output){
                print(head);

            }
        }
    }
}
