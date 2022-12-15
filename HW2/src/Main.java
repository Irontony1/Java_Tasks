import Custom.TreeNode;
public class Main {
    public static void main(String[] args) {
        // Вызов задачи 1
//        TreeNode tr = new TreeNode([1,2,2,null,3,null,3]);
//        boolean out_task1 = isSymmetric(tr);

        // Вызов задачи 2
        int[][] input_task2 = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                               {0,0,0,0,0,0,0,1,1,1,0,0,0},
                               {0,1,1,0,1,0,0,0,0,0,0,0,0},
                               {0,1,0,0,1,1,0,0,1,0,1,0,0},
                               {0,1,0,0,1,1,0,0,1,1,1,0,0},
                               {0,0,0,0,0,0,0,0,0,0,1,0,0},
                               {0,0,0,0,0,0,0,1,1,1,0,0,0},
                               {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int out_task2 = maxAreaOfIsland(input_task2);
        System.out.print(out_task2);


    }
    // Задача 1
//    public static boolean isSymmetric(TreeNode root) {
//        return SymmetricStep(root,root);
//    }

//    private static boolean SymmetricStep(TreeNode r1, TreeNode r2) {
//        if (r1 == null && r2 == null) return true;
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
}

