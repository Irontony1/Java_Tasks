import java.util.ArrayDeque;

public class Task1 {

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
