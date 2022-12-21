import java.util.ArrayDeque;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        /* Задача 1 */
        String s = "/home/foo/.//name";
        System.out.println(simplifyPath(s));



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
}

