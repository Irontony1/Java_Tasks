
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.SortedMap;


public class Main {
    public static void main(String[] args) {
        /* Задача 1
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 2, 4, 5));
        System.out.println(equalList(list1, list2)); */
        /* Задача 2
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5, 5, 9, 8, 4, 5, 0));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5, 5, 2, 5, 4));
        System.out.println(findNumCount(list1, list2, 5)); */

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 4, 5, 6, 7, 2, 2, 9));
        System.out.println(sortEven(list1));

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

    // На вход методу приходят два ArrayList<Integer> и целое число num.
    // Проверьте, что число num встречается в обоих массивах одинаковое кол-во раз.
    public static boolean findNumCount(ArrayList<Integer> list1, ArrayList<Integer> list2, int num) {
        int count = 0;
        for (Integer i : list1) {
            if (i == num) {
                count++;
            }
        }
        for (Integer i : list2) {
            if (i == num) {
                count--;
            }
        }
        return count == 0;
    }

    //На вход приходит ArrayList<Integer>. Отсортируйте в нем только четные числа.
    //Пример: [10, 4, 5, 6, 7, 2, 2, 9] -> [2, 2, 5, 4, 7, 6, 10, 9]
    public static ArrayList<Integer> sortEven(ArrayList<Integer> list1) {
        ArrayList<Integer> even = new ArrayList<>(); //
        int j = 0;
        for (Integer integer : list1) {
            if (integer % 2 == 0) {
                even.add(integer);
            }
        }
        Collections.sort(even);
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0) {
                list1.set(i,even.get(j));
                j++;
            }
        }
        return list1;
    }
}

