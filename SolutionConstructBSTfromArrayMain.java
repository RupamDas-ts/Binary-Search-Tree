package BinarySearchTree;

public class SolutionConstructBSTfromArrayMain {

	/*	Binary Tree Node class
	 *
	 * 	class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;

			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		*/
    private static BinaryTreeNode<Integer> helperTreeBuild(int[] arr, int start, int end, int n){
        if(start > end){
            return null;
        }
        int mid = (start + end)/2;
        int rootValue = arr[mid];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootValue);
        root.left = helperTreeBuild(arr, start, mid-1, n);
        root.right = helperTreeBuild(arr, mid+1, end, n);
        return root;
    }
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        return helperTreeBuild(arr, 0, n-1, n);
    }
}
