package BinarySearchTree;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConstructBSTfromArrayMain {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    private static void preOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int arr[] = new int[len];
        if(len>0)
        {
            st = new StringTokenizer(br.readLine());
        }
        for(int i=0;i<len;i++)
        {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        BinaryTreeNode<Integer> ans = SolutionConstructBSTfromArrayMain.SortedArrayToBST(arr, len);
        preOrder(ans);
    }
}
