package BinarySearchTree;

import java.util.ArrayList;

class Pair<T>{
    T head;
    T tail;
}
public class LevelWiseLinkedListSolution {
    private static Pair<LinkedListNode<Integer>> constructNewList(BinaryTreeNode<Integer> root, int level,
                                                                  Pair<LinkedListNode<Integer>> pair){
        if(root == null){
            return pair;
        }
        pair = constructNewList(root.left, level-1, pair);
        if(level == 0){
            LinkedListNode<Integer> newNode = new LinkedListNode<>(root.data);
            if(pair.head == null){
                pair.head = newNode;
                pair.tail = newNode;
                return pair;
            }
            pair.tail.next = newNode;
            pair.tail = newNode;
            return pair;
        }
        pair = constructNewList(root.right, level-1, pair);
        return pair;
    }
    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
        // Write your code here
        int h = GetHeight.getheight(root);
        ArrayList<LinkedListNode<Integer>> list = new ArrayList<>();
        for( int i = 0; i<h; i++){
            Pair<LinkedListNode<Integer>> newPair = new Pair<>();
            LinkedListNode<Integer> newList = constructNewList(root, i, newPair).head;
            list.add(newList);
        }
        return list;
    }
}
