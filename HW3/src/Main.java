import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 2, 4, 5));
        boolean out = equalList(list1, list2);

        System.out.println(out);
    }

    //На вход приходят два ArrayList<Integer> напишите метод, который проверяет два массива на равенство.
    // Нужно реализовать алгоритм, не использовать метод equals.
    public static boolean equalList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size() != list2.size()) {
            return false;
        } else {
            for (int i = 0; i < list1.size(); i++) {
                int itemList1 = list1.get(i);
                int itemList2 = list2.get(i);
                if (itemList1 != itemList2) {
                    return false;
                }
            }
            return true;
        }
    }


}