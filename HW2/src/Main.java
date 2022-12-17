import Custom.TreeNode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Вызов задачи 1
//        TreeNode tr = new TreeNode([1,2,2,null,3,null,3]);
//        boolean out_task1 = isSymmetric(tr);

        // Вызов задачи 2
        int[][] input_task2 = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        int out_task2 = maxAreaOfIsland(input_task2);
        System.out.println(out_task2);

        // Вызов задачи 3
        int[][] input_task3 = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] out_task3 = floodFill(input_task3, 1, 1, 2);
        System.out.println(Arrays.deepToString(out_task3).replace("], ", "]\n"));

    }
    // Задача 1
//    public static boolean isSymmetric(TreeNode root) {
//        return SymmetricStep(root,root);
//    }

//    private static boolean SymmetricStep(TreeNode r1, TreeNode r2) {
//        if (r1 == null && r2 == null) {
//          return true;
//        }
//        return r1 != null && r2 != null && r1.val == r2.val && SymmetricStep(r1.left, r2.right) && SymmetricStep(r1.right, r2.left);
//    }

    // Задача 2
    public static int maxAreaOfIsland(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count = Math.max(count, dfs(i, j, grid));
                }
            }
        }
        return count;
    }

    private static int dfs(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }

        grid[i][j] = 0;
        return 1 + dfs(i - 1, j, grid) + dfs(i + 1, j, grid) + dfs(i, j - 1, grid) + dfs(i, j + 1, grid);
    }

    // Задача 3
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] != color) {
            dfs(image, sr, sc, color, image[sr][sc]);
        }
        return image;
    }

    private static void dfs(int[][] image, int i, int j, int color, int cell) {
        if (i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] != cell) {
            return;
        }

        image[i][j] = color;
        dfs(image, i - 1, j, color, cell);
        dfs(image, i + 1, j, color, cell);
        dfs(image, i, j - 1, color, cell);
        dfs(image, i, j + 1, color, cell);
    }
}

