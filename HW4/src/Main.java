import java.util.ArrayDeque;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        /* Задача 1
        String s = "/home/foo/.//name";
        System.out.println(simplifyPath(s)); */

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

    }

    public static String simplifyPath(String path) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        String[] splitPath = path.split("/");

        for (String s : splitPath) {
            if (!s.equals(".") && !s.equals("..") && !s.equals("")) {
                stack.add(s);
            }
            if (!stack.isEmpty() && s.equals("..")) {
                stack.poll();
            }
        }

        return sb.append("/").append(String.join("/", stack)).toString();
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        ArrayDeque<int[]> stack = new ArrayDeque<>();
        boolean[][] isView = new boolean[grid.length][grid[0].length];
        int[][] steps = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                int area = 0;
                if (grid[row][col] == 1 && !isView[row][col]) {
                    stack.add(new int[]{row, col});
                    isView[row][col] = true;
                    area++;
                }
                while (!stack.isEmpty()) {
                    int[] curPoint = stack.pop();
                    int curRow = curPoint[0];
                    int curCol = curPoint[1];
                    for (int[] step : steps) {
                        int newRow = curRow + step[0];
                        int newCol = curCol + step[1];
                        if ((newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length && grid[newRow][newCol] == 1 && !isView[newRow][newCol])) {
                            stack.add(new int[]{newRow, newCol});
                            isView[newRow][newCol] = true;
                            area++;
                        }
                    }
                }
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}



