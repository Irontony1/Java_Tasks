import javax.swing.tree.TreeNode;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /* Задача 1 */
        String s = "/home/foo/.//name";
        System.out.println(Task1.simplifyPath(s));

        /* Задача 2 */
        int[][] input_task2 = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        int out_task2 = Task2.maxAreaOfIsland(input_task2);
        System.out.println(out_task2);

        /* Задача 3 */
        Task3.TreeNode root = new Task3.TreeNode(1);
        root.left = new Task3.TreeNode(2);
        root.right = new Task3.TreeNode(2);
        root.left.right = new Task3.TreeNode(3);
        root.left.left = new Task3.TreeNode(4);
        root.right.left = new Task3.TreeNode(3);
        root.right.right = new Task3.TreeNode(4);

        Task3.TreeNode root2 = new Task3.TreeNode(1);
        root2.left = new Task3.TreeNode(2);
        root2.right = new Task3.TreeNode(2);
        root2.left.right = new Task3.TreeNode(3);
        root2.right.right = new Task3.TreeNode(3);
        System.out.println(Task3.isSymmetric(root));
        
        /*Задача 4*/
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        System.out.println(Arrays.deepToString(Task4.updateMatrix(mat)));
    }
}



